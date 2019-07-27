package portfel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

class PortfelTest {

    Portfel portfel;

    @BeforeEach
    public void stworzPortfel(){
        portfel=new Portfel();
    }

    @Test
    public void wplac() {

        //is
        BigDecimal kwota = new BigDecimal(70.8);
        Pieniadze zlotowiWplacane = new Pieniadze(kwota,Waluta.PLN);

        //then
        portfel.wplac(zlotowiWplacane);

        //expected
        assertEquals(zlotowiWplacane,portfel.getMiliony().get(Waluta.PLN));
    }

    @Test
    void wyplac() throws JestesBiednyException {

        //is
        BigDecimal kwotaWyplacona = new BigDecimal(60.99);//.setScale(2, RoundingMode.HALF_UP);

        BigDecimal kwotaWplacona = new BigDecimal(70.99);//.setScale(2, RoundingMode.HALF_UP);
        BigDecimal kwotaSpodziewana = new BigDecimal(10.00);//.setScale(2, RoundingMode.HALF_UP);

        Pieniadze pieniądeSpodziewane = new Pieniadze(kwotaSpodziewana,Waluta.PLN);
        Pieniadze zlotowkiWplacone = new Pieniadze(kwotaWplacona,Waluta.PLN);
        portfel.wplac(zlotowkiWplacone);
        Pieniadze zlotowkiWyplacane = new Pieniadze(kwotaWyplacona,Waluta.PLN);

        //then
        portfel.wyplac(zlotowkiWyplacane);

        //expected
        assertEquals(pieniądeSpodziewane,portfel.getMiliony().get(Waluta.PLN));

    }

    @Test
    void saldo() {
    }
}