
// 4. Write a Java Program to find Sum of n-natural numbers.
import java.util.Scanner;

class SumOfNaturalNumbers {
    int n;

    int calculateSum() {
        // Formula to calculate the sum of n natural numbers: sum = n * (n + 1) / 2
        return n * (n + 1) / 2;
    }
}

public class Ass4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SumOfNaturalNumbers sumCalculator = new SumOfNaturalNumbers();

        System.out.print("Enter the value of n: ");
        sumCalculator.n = scanner.nextInt();

        int sum = sumCalculator.calculateSum();

        System.out.println("Sum of first " + sumCalculator.n + " natural numbers: " + sum);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
