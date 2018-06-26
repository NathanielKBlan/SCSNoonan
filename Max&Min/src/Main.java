/* Created on: 06/24/18
 * Author: Nathaniel K. Blanquel
 * Purpose: To keep track of maximum and minimum values inputed by the user.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean stop = false;
		double max = Integer.MIN_VALUE;
		double min = Integer.MAX_VALUE;
		
		while(!stop) {
			
			double input = getInput(sc);
			
			if(input > max) {
				max = input;
			}
			if(input < min) {
				min = input;
			}
			
			System.out.println("The minimum value entered so far is " + min + ".");
			System.out.println("The maximum value entered so far is " + max + ".");
			stop = willItStop(sc);
			
		}
		
		System.out.println("\nThank you for using my program.");
		
	}
	
	static double getInput(Scanner sc) {
		
		double num;
		
		try {
			
			System.out.print("Enter a number: ");
			num = Double.parseDouble(sc.next());
			return num;
			
		} catch(Exception e) {
			System.out.println("Please enter a valid number.\n");
			return getInput(sc);
		}
		
		
	}
	
	static boolean willItStop(Scanner sc) {
		
		System.out.print("Would you like to enter another numer? (Y or N) ");
		String response = sc.next();
		
		if(response.toUpperCase().equals("N")) {
			return true;
		}else if(response.toUpperCase().equals("Y")){
			return false;
		}else{
			System.out.println(response + " is not a valid response");
			return willItStop(sc);
		}
		
	}
}
