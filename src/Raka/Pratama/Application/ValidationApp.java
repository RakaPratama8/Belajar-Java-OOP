package Raka.Pratama.Application;

import Raka.Pratama.Util.ValidationUtil;
import Raka.Pratama.error.ValidationException;
import Raka.Pratama.records.LoginRequest;

public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("Raka","bebek123");
        System.out.println(loginRequest);
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        } catch (ValidationException exception) {
            System.out.println("Data Tidak Valid" + exception.getMessage());
        } finally {
            System.out.println("Data Ter - exe.");
        }
        System.out.println("---------------------------------------------------------");
        LoginRequest loginRequest1 = new LoginRequest("Fathan","");
        System.out.println(loginRequest1);
        try {
            ValidationUtil.validate(loginRequest1);
            System.out.println("Data Valid");
        } catch (ValidationException exception) {
            System.out.println("Data Tidak Valid : " + exception.getMessage());
        } catch (NullPointerException exception){
            System.out.println("Data Tidak Valid : " + exception.getMessage());
        } finally {
            System.out.println("Data Ter - exe.");
        }
    }
}
