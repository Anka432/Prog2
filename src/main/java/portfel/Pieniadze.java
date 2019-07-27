package portfel;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Pieniadze {

    private BigDecimal kwota;
    private Waluta waluta;

    public Pieniadze(BigDecimal kwotaPoczatkowa,Waluta waluta) {

        this.kwota = kwotaPoczatkowa.setScale(2, RoundingMode.HALF_UP);

        this.waluta = waluta;
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

    public BigDecimal getKwota() {
        return kwota;
    }

    //@Override
    public String toString() {
        return "Pieniadze{" +
                "kwota=" + kwota +
                ", waluta=" + waluta +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pieniadze pieniadze = (Pieniadze) o;
        return kwota.compareTo(pieniadze.kwota) == 0 &&
                waluta == pieniadze.waluta;
    }

    @Override
    public int hashCode() {
        return Objects.hash(kwota, waluta);
    }
}
