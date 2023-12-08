
// 9. Write a Java Program to check Armstrong number.
/*
 An Armstrong number (also known as a narcissistic number, pluperfect digital invariant, or pluperfect number) is a number that is the sum of its own digits each raised to the power of the number of digits. In other words, an n-digit number is an Armstrong number if the sum of its digits, each raised to the power of n, is equal to the number itself.

 Example : 153 = 1^3 + 5^3 + 3^3
           1634 = 1^4 + 6^4 + 3^4 + 4^4
 */
import java.util.Scanner;

class ArmstrongNumberChecker {
    int number;

    boolean isArmstrongNumber() {
        int originalNumber = number;
        int digitCount = countDigits();
        int sum = 0;

        while (originalNumber > 0) {
            int digit = originalNumber % 10;
            sum += Math.pow(digit, digitCount);
            originalNumber /= 10;
        }

        return sum == number;
    }

    int countDigits() {
        int count = 0;
        int tempNumber = number;

        while (tempNumber != 0) {
            tempNumber /= 10;
            count++;
        }

        return count;
    }
}

public class Ass9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArmstrongNumberChecker armstrongChecker = new ArmstrongNumberChecker();

        System.out.print("Enter a number to check if it's an Armstrong number: ");
        armstrongChecker.number = scanner.nextInt();

        if (armstrongChecker.isArmstrongNumber()) {
            System.out.println(armstrongChecker.number + " is an Armstrong number.");
        } else {
            System.out.println(armstrongChecker.number + " is not an Armstrong number.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
