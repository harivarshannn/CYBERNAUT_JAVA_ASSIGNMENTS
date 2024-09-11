public class Circle {
    private static final double PI = 3.14159265359;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        double area = circle.calculateArea();
        System.out.println("Area of the circle with radius 5.0: " + area);
    }
}

