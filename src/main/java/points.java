public class points {
    public static void main() {
        Point2D p1 = new Point2D(0.1, 0.7);


        Point2D p2 = new Point2D(1.8, 1.3);


        p1.subtract(p2);
        p1.print();

        Point2D p3 = new Point2D(4.4, 0/0.);

        p3.print();
        System.out.println(p3.getX());
    }


}
