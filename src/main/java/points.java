public class points {
    public static void main() {


        Rectangle rec1 = new Rectangle(3, 5);
        int fläche = rec1.area();
        System.out.println(fläche);
        int umfang = rec1.perimeter();
        System.out.println(umfang);
        boolean quadrat = rec1.isSquare();
        System.out.println(quadrat);

    }


}
