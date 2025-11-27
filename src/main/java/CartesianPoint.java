class CartesianPoint implements Point{
    private final double x;
    private final double y;
    
    CartesianPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    double getRadius() {
        return Math.sqrt(x * x + y * y);
    }
    
    double getTheta() {
        return Math.atan2(y, x);
    }
    
    CartesianPoint subtract(Point otherPoint) {
        double newX = x - otherPoint.getX();
        double newY = y - otherPoint.getY();
        return new CartesianPoint(newX, newY);
    }
}
