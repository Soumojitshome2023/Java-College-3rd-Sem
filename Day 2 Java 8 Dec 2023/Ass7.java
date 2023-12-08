
// 7. Write a Java Program to display prime numbers from 1 to n.
/*
 A prime number is a positive integer that is only divisible by 1 and itself
 Example :2, 3, 5, 7, 11, 13, 17, 19, 23, 29.
 */
import java.util.Scanner;

class PrimeNumberPrinter {
    int n;

    void printPrimeNumbers() {
        System.out.println("Prime numbers from 1 to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}

public class Ass7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PrimeNumberPrinter primePrinter = new PrimeNumberPrinter();

        System.out.print("Enter the value of n: ");
        primePrinter.n = scanner.nextInt();

        primePrinter.printPrimeNumbers();

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
