package Raka.Pratama.Application;

import Raka.Pratama.Data.Product;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Laptop Dell", 9_000_000);
        Product product1 = new Product("MacBook Pro", 12_000_000);
        System.out.println(product);
        System.out.println(product1);

    }

}
