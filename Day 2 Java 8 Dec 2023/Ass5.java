
// 5. Write a Java Program to print Factorial of a given number.
import java.util.Scanner;

class FactorialCalculator {
    int number;

    long calculateFactorial() {
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1; // Return -1 to indicate an error condition
        }

        long factorial = 1;

        // Calculate factorial using a loop
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
}

public class Ass5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FactorialCalculator factorialCalculator = new FactorialCalculator();

        System.out.print("Enter a number to calculate its factorial: ");
        factorialCalculator.number = scanner.nextInt();

        long factorial = factorialCalculator.calculateFactorial();

        if (factorial != -1) {
            System.out.println("Factorial of " + factorialCalculator.number + ": " + factorial);
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
