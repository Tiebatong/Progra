public class points {
    public static void main() {


        Point2D p1 = new Point2D(2.4, 5.6);
        Point2D p2 = new Point2D(3, 6.7);
        Point2D p3 = p1.subtract(p2);

        Point2D p4 = new Point2D(0, 1);
        System.out.println(p4.radius());
        System.out.println(p4.theta());

    }


}
