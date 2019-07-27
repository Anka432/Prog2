package portfel;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Portfel {

    private Map<Waluta,Pieniadze > miliony;

    public Portfel(){

       miliony= new HashMap<>();
    }

    public void wplac(Pieniadze ile) {
        if (!miliony.containsKey(ile.getWaluta())){
            miliony.put(ile.getWaluta(),new Pieniadze(new BigDecimal(0),ile.getWaluta()));
        }
        miliony.get(ile.getWaluta()).przyjmijPieniadze(ile);
    }

    public void wyplac(Pieniadze ile)throws JestesBiednyException {
        miliony.get(ile.getWaluta()).pobierzPieniadze(ile);
    }

    public String saldo() {

        return String.format("Saldo: %f",miliony);
    }

    public Map<Waluta, Pieniadze> getMiliony() {
        return miliony;
    }
}