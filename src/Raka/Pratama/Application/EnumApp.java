package Raka.Pratama.Application;

import Raka.Pratama.Data.Customer;
import Raka.Pratama.enums.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Raka");
        customer.setLevel(Level.GOLD);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());

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
