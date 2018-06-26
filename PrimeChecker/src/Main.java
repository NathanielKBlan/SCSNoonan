import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a prime number: ");
		
		isPrime(getInput(sc));
		
	}
	
	static boolean isPrime(int n) {
		for(int i = 1; i <= n/2; i++) {
			if(n % i == 0 && i != 1) {
				System.out.println(n + " is a composite number.\nThe smallest integer greater than 1 that divides it evenly is " + i + ".");
				return false;
			}
		}
		System.out.println(n + " is a prime number.");
		return true;
	}
	
	static int getInput(Scanner sc) {
		  try {
			  return Integer.parseInt(sc.next());
		  }catch(Exception e) {
			  System.out.print("That was not a valid input.");
			  return getInput(sc);
		  }
	 }
}
