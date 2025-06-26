import java.io.IOException;
import java.net.*;
import java.util.UUID;

public class Client {
    //create host credentials on network
    private static final int BROADCAST_PORT = 8888;
    private static final int INVITE_PORT = 8889;
    private static final UUID uuid = UUID.randomUUID();
    private static final String BROADCAST_ADDRESS = "255.255.255.255";

       
    public static void main(String[] args) {
        //ensures the args contain both host name and port
        if (args.length != 1){
            System.out.println("Usage: <username>");
            return;
        }

        //fetch device's IP and username
        String username = args[0];
        try {
            InetAddress localHost = InetAddress.getLocalHost();
        }
        catch (UnknownHostException e) {
            System.err.println("Could not find local host: " + e.getMessage());
        }

        try(DatagramSocket helloSocket = new DatagramSocket()) {

            //Starts threads; listens to broadcast, listens to chat requests
            new Thread(Client::broadcastListener).start();
            new Thread(Client::inviteListener).start();

            //broadcast udp packets
            //protocol: USERNAME <username> ID <UUID> REQUEST <request>
            String message = "USERNAME" + " " + username + "ID" + " " + uuid +  "REQUEST" + " " + "HELLO";

            //assigns broadcasting address
            try {
                //Create packet and send
                helloSocket.setBroadcast(true);
                InetAddress broadcastAddress = InetAddress.getByName(BROADCAST_ADDRESS);
                DatagramPacket sendPacket = new DatagramPacket(message.getBytes(), message.length(), broadcastAddress, BROADCAST_PORT);
                //use UUID to prevent sending to yourself
                try {
                    helloSocket.send(sendPacket);
                }
                catch (IOException e){
                    System.err.println("Error sending broadcast: " + e.getMessage());
                }
            }
            catch (UnknownHostException e) {
                System.err.println("Assigning broadcast address error: " + e.getMessage());
            }
        }
        catch (java.net.SocketException e) {
            System.out.println("Socket creation error: " + e.getMessage());
        }
    }

    private static void inviteListener(){

    }


    /**
     * Listens for hello packets from other devices on the network
     */
    private static void broadcastListener(){
        byte[] buffer = new byte[1024];

        //socket listening on port 8888
        try(DatagramSocket helloSocket = new DatagramSocket(BROADCAST_PORT)){
            while(true){
                //receiving packet from broadcast
                DatagramPacket broadcastPacket = new DatagramPacket(buffer, buffer.length);
                helloSocket.receive(broadcastPacket);

                //get and split message
                String message = new String(broadcastPacket.getData(), 0, broadcastPacket.getLength());
                String[] messageArr = message.split(" ");
                String senderID = messageArr[3];

                //filter messages from self
                if (senderID.equals(uuid.toString())){
                    continue;
                }







            }
        }
        catch(Exception e){
            System.out.println("Broadcast listening error: " + e.getMessage());
        }

    }


}
