// 3. Write a Java Program to find the maximum among three numbers.

// import java.lang.*;
public class Ass3 {
	public static void main(String args[]) {

		int num1 = 101;
		int num2 = 117;
		int num3 = 110;
		if (num1 > num2 && num1 > num3) {
			System.out.printf("Max %d", num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.printf("Max %d", num2);
		} else {
			System.out.printf("Max %d", num3);
		}
	}
}
