package Raka.Pratama.Application;

import Raka.Pratama.Data.Avanza;
import Raka.Pratama.Data.Car;

public class CarApp {
    public static void main(String[] args) {

        Car avanza = new Avanza();

        avanza.drive();
        System.out.println(avanza.getTier());
    }
}
