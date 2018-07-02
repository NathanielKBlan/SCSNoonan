import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String one = "";
		one = getInput(sc);
		String two = reverseString(one);
		
		if(one.equals(two)) {
			System.out.print(one + " is a palindrome.");
		}else {
			System.out.print(one + " is not a palindrome.");
		}
		
	}
	
	static String reverseString(String s) {
		return new StringBuilder(s).reverse().toString();
	}
	
	static String getInput(Scanner sc) {
		
		String s;
		System.out.print("Enter a word: ");
		s = sc.next();
		return s;
		
	}
}
