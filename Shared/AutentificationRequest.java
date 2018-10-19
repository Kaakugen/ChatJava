package ChatJava.Shared;

import ChatJava.Server.Compte;


    public class AutentificationRequest extends Request {



        private Compte compte1;

        public AutentificationRequest(String username,String password) {

        this.compte1 = new Compte(username,password);


    }


        public Compte getUser() {
            return this.compte1;
        }
}
