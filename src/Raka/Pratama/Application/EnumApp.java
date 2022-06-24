package Raka.Pratama.Application;

import Raka.Pratama.Data.Customer;
import Raka.Pratama.enums.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Raka");
        customer.setLevel(Level.GOLD);

        Customer customer1 = new Customer();
        customer1.setName("Fathan");
        customer1.setLevel(Level.PLATINUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel().getDescription());
        System.out.println(customer1.getName());
        System.out.println(customer1.getLevel().getDescription());

        String level = Level.PLATINUM.name(); //method name()
        System.out.println(level);

        Level levelstring = Level.valueOf("BRONZE"); //method valueof()
        System.out.println(levelstring);



        System.out.println("-----------------------------------------------------------");
        for (var values: Level.values()) { //method values()
            System.out.println(values);
        }
    }
}
