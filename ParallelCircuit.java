class ParallelCircuit implements Resistor{

    private double ohm;
    private int count;

    ParallelCircuit(Resistor resistance1, Resistor resistance2) {
        this.count = resistance1.resistorCount() + resistance2.resistorCount();
        this.ohm = (resistance1.resistance() * resistance2.resistance()) / (resistance1.resistance() + resistance2.resistance());
        
    }
    @Override
    public double resistance() {
        return this.ohm;
    }
    
    @Override
    public int resistorCount() {
        return this.count; // hier immer 2
    }
}
