// 5. Write a Java Program to check whether a given character is vowel or consonant.

// import java.lang.*;
public class Ass5 {
	public static void main(String args[]) {

		char ch = 'b';
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.printf("%c Vowel", ch);
		} else {
			System.out.printf("%c Consonant", ch);
		}
	}
}
