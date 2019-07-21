package portfel;

import java.math.BigDecimal;

public class MainPortfel {
    public static void main(String[] args) {


        Osoba osoba1 = new Osoba();

        Osoba osoba2 = new Osoba();

        osoba1.zaplac(osoba2, new Pieniadze(BigDecimal.TEN, Waluta.PLN));
        osoba2.zaplac(osoba1,new Pieniadze(new BigDecimal("10"),Waluta.GBP));

    }
}
