class PolarPoint implements Point{
    private final double r;
    private final double theta;
    
    PolarPoint(double r, double theta) {
        this.r = r;
        this.theta = theta;
    }
    
    public double getX() {
        return r * Math.cos(theta);
    }
    
    public double getY() {
        return r * Math.sin(theta);
    }
    
    double getTheta() {
        return theta;
    }
    
    double getRadius() {
        return r;
    }
    
    PolarPoint subtract(Point otherPoint) {
        double newX = this.getX() - otherPoint.getX();
        double newY = this.getY() - otherPoint.getY();
        CartesianPoint newPoint = new CartesianPoint(newX, newY);
        return new PolarPoint(newPoint.getRadius(), newPoint.getTheta());
    }
}
