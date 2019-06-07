import java.io.IOException;
import java.net.InetAddress;

import static java.lang.Thread.sleep;

public class IpLookup {
    public static void main(String[] args) throws IOException, InterruptedException {

        //java.security.Security.setProperty("networkaddress.cache.ttl" , "60"); //property set is working;

        InetAddress ip;
        String hostname;

        while (System.in.available() == 0) {
            ip = InetAddress.getByName("facebook.com");
            hostname = ip.getHostAddress();

            System.out.println("Your current IP address : " + ip.getHostName());
            System.out.println("Your current Host address : " + hostname);
            System.out.println();

            sleep(5000);
        }
    }
}