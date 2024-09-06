public class CarDemo {

    // Inner Car class
    static class Car {
        // Fields
        private String make;
        private String model;

        // Constructor
        public Car(String make, String model) {
            this.make = make;
            this.model = model;
        }

        // Method to display car details
        public void displayCarInfo() {
            System.out.println("Make: " + make);
            System.out.println("Model: " + model);
        }
    }

    public static void main(String[] args) {
        // Create an object of the Car class
        Car myCar = new Car("Toyota", "Camry");

        // Call method to display car details
        myCar.displayCarInfo();
    }
}
