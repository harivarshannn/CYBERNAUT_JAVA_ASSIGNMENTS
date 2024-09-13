import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerIntEg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Please enter an integer: ");
            try {
                int number = scanner.nextInt();
                System.out.println("You entered: " + number);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter an integer");
                scanner.next();
            }
        }
        
        scanner.close();
    }
}
