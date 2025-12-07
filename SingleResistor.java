class SingleResistor implements Resistor{

    private double ohm;
    private int count;

    SingleResistor(double ohm) {
        this.ohm = ohm;
        this.count += 1;
    }

    @Override
    public double resistance() {
        return this.ohm;
    }
    
    @Override
    public int resistorCount() {
        return this.count; 
    }
    
}
