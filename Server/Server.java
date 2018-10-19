package Server;

import Shared.ClientHandler;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {


    public static final int SERVER_PORT = 3000;

    private ServerSocket server;
    private Socket socket = new Socket();



    public Server() throws IOException, ClassNotFoundException {

        this.server = new ServerSocket(SERVER_PORT);

        System.out.println("server démmaré sur le port :"+ SERVER_PORT);
    }

    public void WaitClient() throws IOException {


        while (true) {

            System.out.println("En attente de connexion...");
            Socket client = this.server.accept();
            System.out.println("Un client s'est connecté.");


            ObjectInputStream ois = new ObjectInputStream(client.getInputStream());
            ObjectOutputStream oos = new ObjectOutputStream(client.getOutputStream());



        }


    }



}