/* Created on: 06/19/28
 * Author: Nathaniel Kristopher Blanquel
 * Purpose: To calculate the area of rectangles and circles.
 */

public class Main {
	
	public static void main(String[] args) {
		
		final double rL = 2.5;
		final double rW = 3;
		final double cR = 5;
		
		printAreaCirc(cR);
		printAreaRect(rL, rW);
		
	}
	
	static double calculateRect(double l, double w) {
		return l * w;
	}
	
	static double calculateCirc(double r) {
		return r * r * Math.PI;
	}
	
	static void printAreaCirc(double r) {
		System.out.println("The circle with radius of " + r + " has an area of " + calculateCirc(r) + ".");
	}
	
	static void printAreaRect(double l, double w) {
		System.out.println("The rectangle with length " + l + " and width " + w + " has an area of " + calculateRect(l, w) + ".");
	}
}
