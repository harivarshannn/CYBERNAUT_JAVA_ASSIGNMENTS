public class CounterExample {
    // Static variable to keep track of the count
    private static int counter = 0;

    // Static method to increment the counter
    public static void incrementCounter() {
        counter++;
    }

    public static void main(String[] args) {
        // Call incrementCounter method multiple times and print the value of counter
        incrementCounter();
        System.out.println("Counter after 1st increment: " + counter);

        incrementCounter();
        System.out.println("Counter after 2nd increment: " + counter);

        incrementCounter();
        System.out.println("Counter after 3rd increment: " + counter);

        incrementCounter();
        System.out.println("Counter after 4th increment: " + counter);
    }
}
