/* Created on: 06/19/18
 * Author: Nathaniel Kristopher Blanquel
 * Purpose: To calculate the volume of spheres, cones, and cubes.
 */

public class Main {

	public static void main(String[] args) {
		
		calculateSVolume(17.3);
		calculateSVolume(156.593);
		calculateCVolume(17.3, 10.1);
		calculateCVolume(25.33, 1.22);
		calculateCuVolume(10.0);
		calculateCuVolume(27894.359);
		
	}
	
	static void calculateSVolume(double r) {
		System.out.println("The volume of the sphere with "
				+ "radius " + r + " is " + (4.0/3) * Math.PI * r * r * r + ".\n");
	}
	
	static void calculateCVolume(double r, double h) {
		System.out.println("The volume of the cone with radius " + r + " and height " + h + " is " 
	+ Math.PI * r * r * (h/3) + ".\n");
	}
	
	static void calculateCuVolume(double s) {
		System.out.println("The volume of the cube with side of " + s + " is " + s * s * s + ".\n");
	}
}
