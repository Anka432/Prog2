package portfel;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PieniadzeTest {

    @org.junit.jupiter.api.Test
    void przyjmijPieniadze() {
        Pieniadze p1 =new Pieniadze(new BigDecimal(30),Waluta.PLN);
        Pieniadze p2 =new Pieniadze(new BigDecimal(350),Waluta.PLN);

        p1.przyjmijPieniadze(p2);

        assertEquals(p1.getKwota(),new BigDecimal(380));
    }

    @org.junit.jupiter.api.Test
    void pobierzPieniadze() throws JestesBiednyException {

        Pieniadze p1 = new Pieniadze(new BigDecimal(270),Waluta.PLN);
        Pieniadze p2 = new Pieniadze(new BigDecimal(70),Waluta.PLN);

        p1.pobierzPieniadze(p2);
        assertEquals(p1.getKwota(),new BigDecimal(200));
    }

    @org.junit.jupiter.api.Test
    void czyCieStac() {

        Pieniadze wymaganePieniadze = new Pieniadze(new BigDecimal(20),Waluta.PLN);
        Pieniadze pytanePieniadze = new Pieniadze(new BigDecimal(0),Waluta.PLN);

        assertFalse(pytanePieniadze.czyCieStac(wymaganePieniadze));

         wymaganePieniadze = new Pieniadze(new BigDecimal(20),Waluta.PLN);
         pytanePieniadze = new Pieniadze(new BigDecimal(70),Waluta.PLN);

        assertTrue(pytanePieniadze.czyCieStac(wymaganePieniadze));
    }


}