public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    
    public int getArea() {
        return length * width;
    }

   public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        int area = rectangle.getArea();
        System.out.println("The area of the rectangle is: " + area);
    }
}
