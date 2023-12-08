
//    1. Write a Java Program to convert long to int.
import java.util.Scanner;

class LongToIntConverter {
    long num;

    int converter() {
        return (int) num;
    }
}

public class Ass1 {
    public static void main(String args[]) {
        LongToIntConverter o1 = new LongToIntConverter();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a long number: ");
        o1.num = scanner.nextLong();
        scanner.close();

        int result = o1.converter();

        System.out.println("Converted int value: " + result);
    }
}
