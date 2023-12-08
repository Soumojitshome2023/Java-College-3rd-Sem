
// 10. Write a Java Program to check Krishnamurthy number.
/*
 
A Krishnamurthy number, also known as a Strong number, is a number in which the sum of the factorial of its digits is equal to the number itself. For an n-digit number abcd, the condition is given by:
a! + b! + c! + d! = abcd;

Example : 1!+4!+5! = 1+24+120 = 145.
          
 */

import java.util.Scanner;

class KrishnamurthyNumberChecker {
    int number;

    boolean isKrishnamurthyNumber() {
        int originalNumber = number;
        int sum = 0;

        while (originalNumber > 0) {
            int digit = originalNumber % 10;
            sum += factorial(digit);
            originalNumber /= 10;
        }

        return sum == number;
    }

    int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}

public class Ass10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        KrishnamurthyNumberChecker krishnamurthyChecker = new KrishnamurthyNumberChecker();

        System.out.print("Enter a number to check if it's a Krishnamurthy number: ");
        krishnamurthyChecker.number = scanner.nextInt();

        if (krishnamurthyChecker.isKrishnamurthyNumber()) {
            System.out.println(krishnamurthyChecker.number + " is a Krishnamurthy number.");
        } else {
            System.out.println(krishnamurthyChecker.number + " is not a Krishnamurthy number.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
