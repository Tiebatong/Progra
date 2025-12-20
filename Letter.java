record Letter(Location Absender, Location Empfänger) implements  Sendable{


    public Location senderLocation() {
        return Absender;
    }

    public Location receiverLocation() {
        return Empfänger;
    }

    public double weight() {
        return 80;
    }
    

    
}
