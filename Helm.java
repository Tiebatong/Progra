record Helm(int preis, Helmtyp Helm) implements Produkt {}

/* 
class Helm implements Produkt {

    private final int preis;

    private final Helmtyp typ;

    public final int preis() {
        return this.preis;
    }

    Helmtyp typ() {
        return this.typ;
    }

    public Helm(int preis, Helmtyp typ) {
        this.preis = preis;
        this.typ = typ;
    }

    @Override
    public String toString() {
        return "Helm " + (preis / 100) + " $ " + this.typ;
    }

    
}
*/