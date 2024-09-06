public class CarDemo {

    
    static class Car {
        private String make;
        private String model;

        public Car(String make, String model) {
            this.make = make;
            this.model = model;
        }

        public void displayCarInfo() {
            System.out.println("Make: " + make);
            System.out.println("Model: " + model);
        }
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry");
        myCar.displayCarInfo();
    }
}
