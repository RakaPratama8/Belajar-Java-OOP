package Raka.Pratama.Application;

import Raka.Pratama.Data.Animal;
import Raka.Pratama.Data.Cat;

public class AnimalApp {
    public static void main(String[] args) {

        Animal animal =  new Cat();
        animal.Name = "Lalo";
        System.out.println(animal.Name);

    }
}
