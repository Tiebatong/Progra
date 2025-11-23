class Point2D {
    private double x;
    private double y;

    Point2D(double x, double y) {
        this.setX(x);
        this.setY(y);
    }

    Point2D() {
        this.x = 0;
        this.y = 0;
    }

    void print() {
        System.out.println(this.x + "," + this.y);
    }

    void subtract(Point2D other) {
        this.x = this.x - other.x;
        this.y = this.y - other.y;
    }

    void setY (double newy) {
        if(Double.isNaN(newy)) {
            return;
        }
        this.y = newy;
    }

    void setX (double newx) {
        if(Double.isNaN(newx)) {
            return;
        }
        this.x = newx;
    }

    double getX () {
        return this.x;
    }

    double getY () {
        return this.y;
    }
}