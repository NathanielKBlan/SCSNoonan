/* Created on: 06/19/18
 * Author: Nathaniel Kristopher Blanquel
 * Purpose: To convert miles to kilometers and vice-versa.
 */

public class Main {
	
	public static void main(String[] args) {
		
		double numMiles = 10.3;
		double numKilometers = 23.7;
		final double kMiC = 1.60934;
		
		System.out.println("Number of Miles Given - " + numMiles);
		System.out.println("Number of Kilometers in " + numMiles + " - " + mToKConv(numMiles, kMiC) + "\n");
		
		System.out.println("Number of Kilometers Given - " + numKilometers);
		System.out.println("Number of Miles in " + numKilometers + " - " + kToMConv(numKilometers, kMiC) + "\n");
	}
	
	static double kToMConv(double k, double c) {
		return k / c;
	}
	
	static double mToKConv(double m, double c) {
		return m * c;
	}
	
}
