class Warenkorb {

    private final Produkt[] produkte;

    Warenkorb(Produkt... produkte) {
        for(Produkt produkt: produkte) {
            if(produkt == null) {
                java.util.Objects.requireNonNull(produkt);
            }
        }
        //this.produkte = new Produkt[produkte.length];
        //for(int i = 0; i < produkte.length; i++) {
        //    this.produkte[i] = produkte[i];
        //}
        this.produkte = produkte.clone();
        
    }

    // Warenkorb(Produkt produkt) {
    //    Produkt[] prodarr = {produkt};
    //    this.produkte = prodarr;
    //}

    

    int summe() {
        int summe = 0;
        for(Produkt produkt: produkte) {
            summe += produkt.preis();
        }
        return summe;
    }

    @Override
    public String toString() {
        String result = "Warenkorb mit: \n";
        return result + java.util.Arrays.toString(this.produkte);
    }
    
    
}
