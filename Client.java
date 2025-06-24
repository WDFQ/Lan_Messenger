import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.UUID;

public class Client {
    //obtain client subnet
    //broadcast over subnet 
    

    //create host credentials on network
    private final int BROADCAST_PORT = 8888;
    private final int INVITE_PORT = 8889;
    private final UUID uuid = UUID.randomUUID();

       
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

        //broadcast udp packets
        


    }
}
