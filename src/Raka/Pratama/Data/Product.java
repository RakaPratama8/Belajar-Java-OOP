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

    @Override
    public boolean equals(Object o) { // OVERRIDE EQUALS
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (Price != product.Price) return false;
        return Name != null ? Name.equals(product.Name) : product.Name == null;
    }

    @Override
    public int hashCode() {
        int result = Name != null ? Name.hashCode() : 0;
        result = 31 * result + Price;
        return result;
    }
}
