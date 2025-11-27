import java.awt.*;

class Point2D {
    private final double x;
    private final double y;

    Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    Point2D() {
        this.x = 0;
        this.y = 0;
    }

    void print() {
        System.out.println(this.x + "," + this.y);
    }

    public String toString() {
        return x + " " + y;
    }

    Point2D subtract(Point2D other) {
        double newX = this.x - other.x;
        double newY = this.y - other.y;
        return new Point2D(newX, newY);
    }

    Point2D setY (double newy) {
        return new Point2D(this.x, newy);
    }

    Point2D setX (double newx) {
        return new Point2D(newx, this.y);
    }

    double getX () {
        return this.x;
    }

    double getY () {
        return this.y;
    }

    double radius() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    double theta() {
        return Math.atan2(this.y, this.x);
    }
}