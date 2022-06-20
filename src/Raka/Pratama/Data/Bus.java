package Raka.Pratama.Data;

public class Bus implements Car{
    public void drive() {

    }

    public int getTier() {
        return 0;
    }

    public boolean isBig() {
        return Car.super.isBig();
    }

    public boolean isMaintenance() {
        return false;
    }
}
