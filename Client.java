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

        //create non binding socket for sending
        try(DatagramSocket helloSocket = new DatagramSocket()) {

            //Starts threads; listens to broadcast, listens to chat requests
            new Thread(Client::broadcastListener).start();
            new Thread(Client::inviteListener).start();
          
            //protocol: USERNAME <username> ID <UUID> REQUEST <request>
            String message = String.format("USERNAME %s ID %s REQUEST HELLO", args[0], uuid);
            System.out.println(message);
            helloSocket.setBroadcast(true);
            
            //continously send packets
            while (true) {
                try {
                    InetAddress broadcastAddress = InetAddress.getByName(BROADCAST_ADDRESS);
                    DatagramPacket sendPacket = new DatagramPacket(
                            message.getBytes(),
                            message.length(),
                            broadcastAddress,
                            BROADCAST_PORT
                    );

                    helloSocket.send(sendPacket);
                    System.out.println("Broadcast sent: " + message);
                    //wait 3 seconds before next packet send
                    Thread.sleep(3000);
                }
                catch (UnknownHostException e) {
                    System.err.println("Assigning broadcast address error: " + e.getMessage());
                }
                catch (IOException e) {
                    System.err.println("Error sending broadcast: " + e.getMessage());
                }
                catch (InterruptedException e) {
                    System.err.println("Sleep interrupted: " + e.getMessage());
                    Thread.currentThread().interrupt();
                }
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
                String senderUsername = messageArr[1];
                String senderID = messageArr[3];
                String senderReq = messageArr[5];


                //filter messages from self
                if (senderID.equals(uuid.toString())){
                    System.out.println("Rejected Self Packet");
                    continue;
                }

                //print received packet
                System.out.println("Username: " + senderUsername + " ID: " + senderID + " Type: " + senderReq);

            }
        }
        catch(Exception e){
            System.out.println("Broadcast listening error: " + e.getMessage());
        }
    }
}
