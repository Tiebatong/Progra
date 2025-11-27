class Rectangle {
    private int width;
    private int height;


    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    Rectangle() {
        this.width = 0;
        this.height = 0;
    }

    int area() {
        return (this.width * this.height);
    }

    int perimeter() {
        return 2 *  this.width + 2 * this. height;
    }

    boolean isSquare() {
        if (this.width == this.height) {
            return true;
        }
        return false;
    }

    public String toString() {
        for (int i = 0; i < this.width; i++) {

        }
    }
}
