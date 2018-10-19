package Server;

import Shared.AutentificationRequest;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Compte {

    private String user;
    private String password;

    private ObjectOutputStream oos;
    private ObjectInputStream ois;


    public Compte(String user, String password) {
        this.user = user;
        this.password = password;
    }


    public void Autentificate (Compte c) throws IOException {

        boolean autentificate;

        AutentificationRequest req = new AutentificationRequest(c.user,c.password);
        oos.writeObject(req);
    }
}

