package Raka.Pratama.Application;

import Raka.Pratama.Data.Product;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("Laptop Dell", 5_000_000);
        System.out.println(product.Name);
        System.out.println(product.Price);
    }
}
