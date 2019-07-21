package portfel;

import java.math.BigDecimal;

public class Pieniadze {

    private BigDecimal kwota;

    private Waluta waluta;

    public Pieniadze(BigDecimal kwotaPoczatkowa) {

        this.kwota = kwotaPoczatkowa;

        this.waluta = Waluta.PLN;

        this.waluta = Waluta.GBP;

    }

    public Pieniadze przyjmijPieniadze(Pieniadze pieniadz) {

        this.kwota = this.kwota.add(pieniadz.kwota);

        return this;
    }

    public Pieniadze pobierzPieniadze(Pieniadze pieniadz) throws JestesBiednyException {

        if (!czyCieStac(pieniadz)) {
            throw new JestesBiednyException();
        }
        else
            this.kwota = this.kwota.subtract(pieniadz.kwota);
        return this;
    }

    public boolean czyCieStac(Pieniadze ile) {

        return this.kwota.compareTo(ile.kwota) >= 0;
    }

    public Waluta getWaluta() {
        return waluta;
    }
}
