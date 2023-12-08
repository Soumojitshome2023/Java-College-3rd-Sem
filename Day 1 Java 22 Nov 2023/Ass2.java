// 2. Write a Java Program to check a number is Even or Odd.

// import java.lang.*;
public class Ass2 {
	public static void main(String args[]) {

		int num1 = 101;
		int temp = num1 % 2;
		if (temp == 1) {
			System.out.printf("Odd");
		} else {
			System.out.printf("Even");
		}
	}
}
