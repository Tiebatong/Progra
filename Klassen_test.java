public class Klassen_test {
    static void main(String[] args) {
        

        Location l1 = new Location(40474, "Deutschland");
            
        
        Letter b0 = new Letter(new Location(40474, "Deutschland"),new Location(45454, "Deutschland"));

        Parcel p0 = new Parcel(l1, new Location(12345, "Frankreich"), 89.0);
        System.out.println(p0.weight());
    }
    
}
