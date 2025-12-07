class SeriesCircuit implements Resistor{

    private double ohm;
    private int count;

    SeriesCircuit(Resistor resistor1, Resistor resistor2) {
        this.ohm = resistor1.resistance() + resistor2.resistance();
        this.count = resistor1.resistorCount() + resistor2.resistorCount() ;
    }
    
    @Override
    public double resistance() {
        return this.ohm;
    }
    
    @Override
    public int resistorCount() {
        return this.count; // hier immer 1
    }
    
}
