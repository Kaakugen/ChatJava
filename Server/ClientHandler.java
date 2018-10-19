package ChatJava.Server;

import ChatJava.Shared.AutentificationRequest;
import ChatJava.Shared.Request;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandler implements Runnable, Serializable {

    private Socket client;
    private ObjectInputStream ois;
    private ObjectOutputStream oos;

    private Userdatabase userDatabase;
    private Compte compte;


    public static final String UDB_FILE_NAME ="userdatabase.db";

    public boolean islogged = false;

    public ClientHandler(Socket client) {
        this.client = client;
        this.userDatabase=new Userdatabase(UDB_FILE_NAME);


    }



    @Override
    public void run() {

        //lire message client
        try {
            ObjectInputStream ois = new ObjectInputStream(this.client.getInputStream());
            ObjectOutputStream oos = new ObjectOutputStream(this.client.getOutputStream());

            ArrayList<Compte> userList = userDatabase.loadData();
            Request req = (Request) ois.readObject();

            while (true) {

                try {
                    switch (req.getClass().getSimpleName()) {

                        case "AutentificationRequest" :
                        {

                         System.out.println("on rentre dans authentification");
                         AutentificationRequest Areq = (AutentificationRequest) req;
                         Compte c1 = Areq.getUser();


                        }

                    }

                } catch (Exception e) {
                    e.printStackTrace();
                    System.exit(1);
                }


            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}