package Shared;

import Shared.AutentificationRequest;
import Shared.Request;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;

public class ClientHandler implements Runnable, Serializable {

    private Socket client;

    public ClientHandler(Socket client) {
        this.client = client;

    }

    @Override
    public void run() {

            //lire message client
            try {
                ObjectInputStream ois = new ObjectInputStream(this.client.getInputStream());
                ObjectOutputStream oos = new ObjectOutputStream(this.client.getOutputStream());


                while (true) {

                    Request request = (Request) ois.readObject();
                    if (request instanceof AutentificationRequest) {

                        AutentificationRequest req = (AutentificationRequest) request;


                    }

                }

            } catch (Exception e) {
                e.printStackTrace();
                System.exit(1);
            }



    }

}
