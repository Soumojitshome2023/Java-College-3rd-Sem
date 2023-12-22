/*3. Write a Java Program to display the sequence AMM, COO, EQQ ,..........*/

import java.util.Scanner;
public class pro3{
	public static void main (String[] args){
	//System.out.println((char)67);	
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n :   ");	
		int n = sc.nextInt();
		System.out.print(">> ");	
		for(int i = 1; i<=2*n; i+=2){
			System.out.print(((char)(i+64) ) +""+ ((char)(76+i))  +""+ ((char)(76+i)) );
			if(i <= 2*n-2){
				System.out.print(" , ");	
			}
		}
	}
}
