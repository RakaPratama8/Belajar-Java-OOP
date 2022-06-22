package Raka.Pratama.Application;

import Raka.Pratama.Data.Application;
import Raka.Pratama.Data.Country;
import static Raka.Pratama.Data.constant.*;
import Raka.Pratama.Util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
// Cara access static adalah : Nama class.Nama static
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(MathUtil.sum(12,12));

        Country.City city = new Country.City();
        city.setName("Depok");
        System.out.println(city.getName());

        System.out.println(Application.PROCESSOR);

    }
}
