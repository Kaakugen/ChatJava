package ChatJava.Server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable{


    public static final int SERVER_PORT = 3000;

    private ServerSocket server;
    private Socket socket = new Socket();

    public Thread t1;



    public Server() throws IOException, ClassNotFoundException {

        this.server = new ServerSocket(SERVER_PORT);

        System.out.println("server démmaré sur le port :"+ SERVER_PORT);
        System.out.println("En attente de connexion...");
    }



    @Override
    public void run() {





        try {

            Socket client;
            boolean run = true;

        while (run){

            System.out.println("Attente acceptation client...");
            client = this.server.accept();
            System.out.println("Un client s'est connecté.");

            t1 = new Thread(new ClientHandler(client));
            System.out.println("on démarre client handler");
            t1.start();
            }

        } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
