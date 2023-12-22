/* 4. Write a Java Program to display the sequence A1, B2, C3, ....Y25,Z26, A1, B2,... */

import java.util.Scanner;
public class pro4{
	public static void main (String[] args){
	//System.out.println((char)67);	
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n :   ");	
		int n = sc.nextInt();
		System.out.print(">> ");	
		int i = 1, j =1;
		while( j <= n){
			System.out.print(((char)(i+64) ) + "" + i);
			if(j < n){
				System.out.print(" , ");	
			}
			i++; j++;
			if(i == 27){
				i=1;
			}
		}
	}
}
