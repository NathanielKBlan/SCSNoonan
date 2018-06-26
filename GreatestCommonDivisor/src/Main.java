import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = getInput(sc);
		int y = getInput(sc);
		int gcd = 0;
		
		if(x > y) {
			for(int i = 1; i <= x; i++) {
				if(x % i == 0 && y % i == 0) {
					gcd = i;
				}
			}
		}else{
			for(int i = 1; i <= y; i++) {
				if(x % i == 0 && y % i == 0) {
					gcd = i;
				}
			}
		}
		
		System.out.println("The greatest common divisor (GCD) is " + gcd + ".");
	}
	
	static int getInput(Scanner sc) {
		  try {
			  System.out.print("Enter a number: ");
			  return Integer.parseInt(sc.next());
		  }catch(Exception e) {
			  System.out.print("That was not a valid input.");
			  return getInput(sc);
		  }
	 }
}
