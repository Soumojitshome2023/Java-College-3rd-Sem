// 6. Write a Java Program to multiply a number by 4 and divide the same number by 2 using shift operator.

// import java.lang.*;
public class Ass6 {
	public static void main(String args[]) {
		int num = 6;
		System.out.printf("multiply %d by 4 %d\n", num, num << 2);
		System.out.printf("divide %d by 2 %d\n", num, num >> 1);
	}
}
