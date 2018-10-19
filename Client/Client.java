package ChatJava.Client;

import ChatJava.Shared.AutentificationRequest;

import java.io.*;
import java.net.Socket;

public class Client {

    private Socket client;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;


    public static final String SERVER_HOST = null; // localhost
    public static final int SERVER_PORT = 3000;

    public Client() throws Exception {

        this.client = new Socket(SERVER_HOST, SERVER_PORT);
        this.oos = new ObjectOutputStream(this.client.getOutputStream());
        this.ois = new ObjectInputStream(this.client.getInputStream());


    }
/** Requete d'autentification du compte */

boolean autentificate(String Username, String Password) throws IOException {

    boolean access;

        AutentificationRequest Areq = new AutentificationRequest(Username,Password);
       this.oos.writeObject(Areq);
       this.oos.flush();


    return access;

    }
}

