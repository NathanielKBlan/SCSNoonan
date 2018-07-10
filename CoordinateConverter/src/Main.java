import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.print("Welcome to the coordinate converter and distance finder.");
		
		Scanner sc = new Scanner(System.in);
		
		boolean cont = true;
		
		while(cont) {
			
			boolean isCart = false;
			double[] coordinates;
			isCart = isCart(sc);
			coordinates = getInput(sc, isCart);
			double[] opCoordinates = convert(coordinates, isCart);
			
			if(isCart) {
				System.out.println("(x1, y1) = (" + coordinates[0] + ", " + coordinates[1] + ")  " + "(r1, theta1) = (" + opCoordinates[0] + ", " + opCoordinates[1] + ")");
				System.out.println("(x1, y1) = (" + coordinates[2] + ", " + coordinates[3] + ")  " + "(r1, theta1) = (" + opCoordinates[2] + ", " + opCoordinates[3] + ")");
			}else {
				System.out.println("(x1, y1) = (" + opCoordinates[0] + ", " + opCoordinates[1] + ")  " + "(r1, theta1) = (" + coordinates[0] + ", " + coordinates[1] + ")");
				System.out.println("(x1, y1) = (" + opCoordinates[2] + ", " + opCoordinates[3] + ")  " + "(r1, theta1) = (" + coordinates[2] + ", " + coordinates[3] + ")");
			}
			
			System.out.println("\nThe distance between the two points is " + getDistance(coordinates[0], coordinates[1], coordinates[2], coordinates[3]) + ".");
			
			cont = getContInput(sc);
		}
		
		System.out.println("\nThank you for using my coordinate converter and distance program.");
	}
	
	static boolean isCart(Scanner sc) {
		
		System.out.println("\nC) Cartesian"); 
		System.out.print("P) Polar\n"); 
		System.out.print("Which coordinate space would you like to use? "); 
		
		String choice = sc.next();
		if(choice.toUpperCase().equals("C")) {
			
			return true;
				
		}else if(choice.toUpperCase().equals("P")) {
			
			return false;
			
		}else {
			System.out.println("That was not a valid choice!");
			return isCart(sc);
		}
	}
	
	static double[] getInput(Scanner sc, boolean isCart) {
		double[] coordinates = new double[4];
		try {
			if(isCart) {
				System.out.print("Please enter x1: ");
				coordinates[0] = Double.parseDouble(sc.next());
				System.out.print("Please enter y1: ");
				coordinates[1] = Double.parseDouble(sc.next());
				System.out.print("Please enter x2: ");
				coordinates[2] = Double.parseDouble(sc.next());
				System.out.print("Please enter y2: ");
				coordinates[3] = Double.parseDouble(sc.next());
				return coordinates;
			}else {
				System.out.print("Please enter r1: ");
				coordinates[0] = Double.parseDouble(sc.next());
				System.out.print("Please enter theta1: ");
				coordinates[1] = Double.parseDouble(sc.next());
				System.out.print("Please enter r2: ");
				coordinates[2] = Double.parseDouble(sc.next());
				System.out.print("Please enter theta2: ");
				coordinates[3] = Double.parseDouble(sc.next());
				return coordinates;
			}
		}catch(Exception e) {
			System.out.print("\nThat was not a valid number. ");
			return getInput(sc, isCart);
		}
	}
	
	static double[] convert(double[] coordinates, boolean isCart) {
		if(isCart) {
			for(int i = 0; i < coordinates.length - 1; i+=2) {
				double temp = coordinates[i];
				coordinates[i] = Math.sqrt(Math.pow(coordinates[i], 2) + Math.pow(coordinates[i+1], 2));
				coordinates[i+1] = Math.atan(coordinates[i+1]/temp);
			}
			return coordinates;
		}else {
			for(int i = 0; i < coordinates.length - 1; i+=2) {
				double temp = coordinates[i];
				coordinates[i] = coordinates[i] * Math.cos(coordinates[i+1]);
				coordinates[i+1] = temp * Math.sin(coordinates[i+1]);
			}
			return coordinates;
		}
	}
	
	static double getDistance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow((x2-x1), 2) - Math.pow((y2-y1), 2));
	}
	
	static boolean getContInput(Scanner sc) {
		System.out.println("Would you like to convert more coordinates? (Y or N) ");
		String input = sc.next();
		if(input.toUpperCase().equals("Y")) {
			return true;
		}
		if(input.toUpperCase().equals("N")) {
			return false;
		}else {
			System.out.println("That was an invalid input!");
			return getContInput(sc);
		}
	}
}
