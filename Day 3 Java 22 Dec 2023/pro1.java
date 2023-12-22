/* 1. Write a Java program that accepts an integer (n) and computes the value of
n+nn+.....+nnn... up to n times.
(For example, if 3 is your input then, print the value of 3+33+333).
*/
import java.util.Scanner;
public class pro1{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n :   ");	
		int n = sc.nextInt();
		System.out.print(">>");	
		for(int i = 1; i<=n; i++){
			for(int j = 1; j<=i; j++){
				System.out.print(n);
			}
			if(i != n){
				System.out.print(" + ");	
			}
		}
	}
}
