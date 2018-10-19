package ChatJava.Server;

import java.io.*;
import java.util.ArrayList;

public class Userdatabase {

/** Fichier de stockage **/


    private File file;


    /** Constructor (Nom du fichier)**/


    public Userdatabase(String name) {

        this.file = new File(name);
    }


    /** Array list pour charger les utilisateurs utilisateurs*/

    public ArrayList<Compte> loadData() throws IOException, ClassNotFoundException {

        ArrayList<Compte> data = new ArrayList<Compte>();

        /**Est ce que le fichier existe?*/
        if (this.file.exists() && !this.file.isDirectory()) {

            FileInputStream fis = new FileInputStream(this.file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            data = (ArrayList <Compte>) ois.readObject();
            ois.close();
        }
     else {
        System.out.println("Le fichier de sauvegarde n'existe pas.");
    }

		System.out.println(data.size() + "Utilisateurs chargés depuis la dernière sauvegarde.");
		return data;
    }




    /** Sauvegarder le nom de l'utilisateur  dans la base**/

    public void saveUser(ArrayList<Compte> data) throws IOException {

        FileOutputStream fos = new FileOutputStream(this.file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(data);
        oos.close();

        System.out.println("Sauvegarde effectuée, Utilisateur enregistrés:" + data.size());


    }



}
