
// 6. Write a Java Program to print Fibonacci series up to n number.
import java.util.Scanner;

class FibonacciSeriesPrinter {
    int n;

    void printFibonacciSeries() {
        int first = 0, second = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}

public class Ass6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FibonacciSeriesPrinter fibonacciPrinter = new FibonacciSeriesPrinter();

        System.out.print("Enter the value of n: ");
        fibonacciPrinter.n = scanner.nextInt();

        System.out.println("Fibonacci series up to " + fibonacciPrinter.n + ":");
        fibonacciPrinter.printFibonacciSeries();

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
