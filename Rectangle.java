

public class Rectangle {

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
        return this.height * this.width;
    }

    int perimeter() {
        return 2 * this.height + 2 * this.width;
    }

    boolean isSquare() {
        if (this.width == this.height) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String toString = "";
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                toString += "* ";
            }
            toString += "\n";
        }
        return toString;
    }

    
    
}
