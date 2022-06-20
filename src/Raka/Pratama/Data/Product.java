package Raka.Pratama.Data;

public class Product {
    public String Name;
    public int Price;

    public Product(String name, int price) {
        Name = name;
        Price = price;
    }
    public String toString(){ // ToString untuk mengubah default variabel
        return "Product name: " + Name + " Price: " + Price;
    }
}
