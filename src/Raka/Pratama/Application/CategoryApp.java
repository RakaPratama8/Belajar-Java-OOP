package Raka.Pratama.Application;

import Raka.Pratama.Data.Category;

public class CategoryApp {
    public static void main(String[] args) {

        var category = new Category();


        category.setId(null);
        category.setId("Gandalf");
        category.setId("One");
        category.setExpensive(false);
        category.setExpensive(true);

        // Untuk ubah data pakai set
        // Untuk Access data pakai Get / is for boolean

        System.out.println(category.getId());
        System.out.println(category.isExpensive()); // Is Karena boolean
    }
}
