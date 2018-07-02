import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double deg = getInput(sc);
		double rad = Math.toRadians(deg);
		System.out.println(deg + " degrees is " + rad + " radians and meets the unit circle at (" + Math.cos(rad) + ", " + Math.sin(rad) + ").");
	}
	
	static double getInput(Scanner sc) {
		  try {
			  System.out.print("Enter an angle in degrees: ");
			  return Double.parseDouble(sc.next());
		  }catch(Exception e) {
			  System.out.print("That was not a valid input.");
			  return getInput(sc);
		  }
	 }
}
