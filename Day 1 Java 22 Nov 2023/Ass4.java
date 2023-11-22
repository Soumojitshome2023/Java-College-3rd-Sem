// 4. Write a Java Program to check Leap Year.

import java.lang.*;
public class Ass4 {
	public static void main(String args[]){

		int year = 2024;
	
		if((year%4 == 0 && year%100 != 0) || (year%400 == 0)){
			System.out.printf("%d Leap Year", year);
		}
		else{
			System.out.printf("%d not Leap Year", year);
		}
	}	
}
