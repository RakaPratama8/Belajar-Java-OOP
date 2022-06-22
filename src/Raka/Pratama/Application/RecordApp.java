package Raka.Pratama.Application;

import Raka.Pratama.records.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Raka", "bebek123");
        LoginRequest loginRequest1 = new LoginRequest("", "bebek123");

        System.out.println(loginRequest);
        System.out.println(loginRequest.password());
        System.out.println(loginRequest.username());
        System.out.println(loginRequest1);
    }
}
