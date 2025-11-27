class Playground {
    static void main() {
        // CartesianPoint ist das, was du mir programmiert hast
        // (Ich hab noch die Setter entfernt, die brauchten wir gar nicht mehr.)
        CartesianPoint p1 = new CartesianPoint(2, 2);
        CartesianPoint p2 = new CartesianPoint(2, 0);
        
        System.out.println(p1.getX());
        System.out.println(p1.getY());
        System.out.println(p1.getTheta());
        System.out.println(p1.getRadius());
        
        CartesianPoint p3 = p1.subtract(p2);
        System.out.println(p3.getX() + ", " + p3.getY());
        
        System.out.println("=========");
        
        // PolarPoint ist meine Variante mit Polarkoordinaten
        PolarPoint pp1 = new PolarPoint(Math.sqrt(8), Math.PI / 4); // entspricht (2,2) in kartesischen Koordinaten
        PolarPoint pp2 = new PolarPoint(2, 0);                      // entspricht (2,0)
        
        System.out.println(pp1.getX());
        System.out.println(pp1.getY());
        System.out.println(pp1.getTheta());
        System.out.println(pp1.getRadius());
        
        PolarPoint pp3 = pp1.subtract(pp2);
        System.out.println(pp3.getX() + ", " + pp3.getY());
        
        
        
        
        
        System.out.println("=========");
        
         Point point3 = p1.subtract(pp2);
         System.out.println(point3.getX() + ", " + point3.getY());

         Point p = point3;

        
    }
}
