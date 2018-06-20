/* Created on: 06/19/18
 * Author: Nathaniel Kristopher Blanquel
 * Purpose: To find the root of a quadratic equation.
 */

public class Main {
	
	public static void main(String[] args) {
		printRes(1, 2, 1);
	}
	
	static double calculatePosRoot(double a, double b, double c) {
		return ((-1*b) + Math.sqrt((b*b) - 4*a*c))/(2*a);
	}
	
	static double calculateNegRoot(double a, double b, double c) {
		return ((-1*b) - Math.sqrt((b*b) - 4*a*c))/(2*a);
	}
	
	static void printRes(double a, double b, double c) {
		if(a == 1) {
			System.out.println("For the equation " + "x^2 + " + (int) b + "x + " + (int) c + ", the solutions are \n"
					+ "x1 = " + calculatePosRoot(a, b, c) + " and x2 = " + calculateNegRoot(a, b, c) + ".");
		}else {
			System.out.println("For the equation " + (int) a + "x^2 + " + (int) b + "x + " + (int) c + ", the solutions are \n"
					+ "x1 = " + calculatePosRoot(a, b, c) + " and x2 = " + calculateNegRoot(a, b, c) + ".");
		}
	}
}
