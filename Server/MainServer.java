package ChatJava.Server;

import java.io.IOException;

public class MainServer {

    public static void main (String[] args) throws IOException {



        try {
            Server serv1 = new Server();
            serv1.WaitClient();



        } catch (Exception e)
        {
            System.out.println("système down");
            System.exit(1);
        }

    }

}
