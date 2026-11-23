class Rectangle {
    private double length;
    private double width;
    public void setter(double length, double width) {
        if (length > 0 && width > 0) {
            this.length = length;
            this.width = width;
        } else {
            System.out.println("Invalid dimensions");
        }
    }
    public void calculateArea() {
        System.out.println("Area: " + (length * width));
    }
    public void calculatePerimeter() {
        System.out.println("Perimeter: " + (2 * (length + width)));
    }
}
public class Main1 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setter(5, 4);
        r.calculateArea();
        r.calculatePerimeter();
    }
}