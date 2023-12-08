
// 2. Write a Java Program to find ASCII value of a Character.
import java.util.Scanner;

class CharToAsciiConverter {
    char character;

    int convertToAscii() {
        return (int) character;
    }
}

public class Ass2 {
    public static void main(String args[]) {
        CharToAsciiConverter converter = new CharToAsciiConverter();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        converter.character = scanner.next().charAt(0);

        int asciiValue = converter.convertToAscii();
        System.out.println("ASCII value of '" + converter.character + "': " + asciiValue);

        scanner.close();

    }
}
