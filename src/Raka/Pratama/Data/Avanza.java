package Raka.Pratama.Data;

public class Avanza implements Car, IsMaintenance{ // multiple interface implements

    public void drive() {
        System.out.println("avanza drive");
    }

    public int getTier() {
        return 12;
    }

    public int speed() {
        return 23;
    }

    public boolean isMaintenance() {
        return true;
    }
}
