/* 2. Write a Java Program to display the sequence ABA, BCB, CDC, DED,........*/

import java.util.Scanner;
public class pro2{
	public static void main (String[] args){
	//System.out.println((char)67);	
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n :   ");	
		int n = sc.nextInt();
		System.out.print(">> ");	
		for(int i = 65; i<=65+n; i++){
			System.out.print(((char)i ) +""+ ((char)(i+1))  +""+ ((char)i));
			if(i != 65+n){
				System.out.print(" , ");	
			}
		}
	}
}
