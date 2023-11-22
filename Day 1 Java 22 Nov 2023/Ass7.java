// 7. Write a Java Program to swap two numbers using bitwise operator.

import java.lang.*;
public class Ass7 {
	public static void main(String args[]){
		int num1 = 6; 
		int num2 = 4;
		System.out.printf("Before Swap num1 = %d & num2 = %d\n", num1, num2);
		
		num1 = num1^num2;
		num2 = num1^num2;
		num1 = num1^num2;
		
		System.out.printf("After Swap num1 = %d & num2 = %d\n", num1, num2);
	}	
}
