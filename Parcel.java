record Parcel(Location Absender, Location Empfänger, double Gewicht) implements Sendable{

    public Location senderLocation() {
        return Absender;
    }

    public Location receiverLocation() {
        return Empfänger;
    }

    public double weight() {
        return Gewicht;
    }
}
