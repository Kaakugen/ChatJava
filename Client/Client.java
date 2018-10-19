package Client;

import Shared.AutentificationRequest;

import java.io.*;
import java.net.Socket;

public class Client {

    private Socket client;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;


    public static final String SERVER_HOST = null; // localhost
    public static final int SERVER_PORT = 3000;

    public Client() throws Exception {



        this.oos = new ObjectOutputStream(this.client.getOutputStream());
        this.ois = new ObjectInputStream(this.client.getInputStream());


    }




}


