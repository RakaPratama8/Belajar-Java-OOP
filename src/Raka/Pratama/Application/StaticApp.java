package Raka.Pratama.Application;

import Raka.Pratama.Data.Application;
import Raka.Pratama.Data.Country;
import Raka.Pratama.Data.constant;
import Raka.Pratama.Util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
// Cara access static adalah : Nama class.Nama static
        System.out.println(constant.APPLICATION);
        System.out.println(constant.VERSION);

        System.out.println(MathUtil.sum(12,12));

        Country.City city = new Country.City();
        city.setName("Depok");

        System.out.println(Application.PROCESSOR);

    }
}
