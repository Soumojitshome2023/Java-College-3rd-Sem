
// 8. Write a Java Program to check perfect number.
/*
 A  positive integer that is equal to the sum of its proper divisors. Examples of perfect numbers: Sum of 1, 2, and 3 equals 6
 */
import java.util.Scanner;

class PerfectNumberChecker {
    int number;

    boolean isPerfectNumber() {
        int sum = 0;

        // Check proper divisors and calculate sum
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if the sum of proper divisors is equal to the original number
        return sum == number;
    }
}

public class Ass8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PerfectNumberChecker perfectChecker = new PerfectNumberChecker();

        System.out.print("Enter a number to check if it's a perfect number: ");
        perfectChecker.number = scanner.nextInt();

        if (perfectChecker.isPerfectNumber()) {
            System.out.println(perfectChecker.number + " is a perfect number.");
        } else {
            System.out.println(perfectChecker.number + " is not a perfect number.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
