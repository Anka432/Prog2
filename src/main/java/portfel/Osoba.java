package portfel;

public class Osoba {

    private Portfel portfel;

    public Osoba() {
        portfel = new Portfel();
    }

    public boolean czyMaszPortfel() {
        if(portfel.equals(null)){
        return true;
    }
        return false;
    }

    public void zaplac(Osoba komu, Pieniadze ile) {
        try{
            portfel.wyplac(ile);
        komu.przyjmij(ile);
        }catch (JestesBiednyException e){
            System.out.println("Jesteś biedny");
        }
    }

    public void przyjmij(Pieniadze ile) {
        portfel.wplac(ile);

    }
}
