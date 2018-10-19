package ChatJava.Shared;

import java.util.Scanner;

public class RegisterRequest extends Request {

    private String username;
    private String password;

    Scanner scUser = new Scanner(System.in);
    Scanner scPassword = new Scanner (System.in);


    public RegisterRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
