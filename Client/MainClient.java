package ChatJava.Client;

import ChatJava.Client.Client;

import java.util.Scanner;

public class MainClient {

    public static void main (String[] args) throws Exception {


        System.out.println("Tapez 'Connexion' pour vous connecter, 'Register' pour vous enregistrer");

        Client cli1 = new Client();
        Scanner sc = new Scanner(System.in);
        Scanner user = new Scanner(System.in);
        Scanner mdp = new Scanner(System.in);
        String Requete = sc.nextLine();



        if (Requete.equals( "connexion")) {

            System.out.println("\n entrez votre nom de compte");
            String User = user.nextLine();

            System.out.println("\n entrez votre mot de passe");
            String MDP = mdp.nextLine();




        }
        else {
            System.out.println(" création compte");




        }





        }

    }

