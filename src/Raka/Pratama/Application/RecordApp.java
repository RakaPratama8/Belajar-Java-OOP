package Raka.Pratama.Application;

import Raka.Pratama.records.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Raka", "bebek123");
        System.out.println(loginRequest);

        LoginRequest loginRequest1 = new LoginRequest("Fathan", "bebek123rafathrai");
        System.out.println(loginRequest1);

        System.out.println("--------------------------------------------------------------------");
        System.out.println(loginRequest.password());
        System.out.println(loginRequest.username());

    }
}
