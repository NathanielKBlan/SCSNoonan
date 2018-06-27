import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean isF = false;
		
		isF = getScale(sc);
		double temp = getInput(sc, isF);
		temp = convert(temp, isF);
		
		if(!isF) {
			System.out.println("The temperature in Fahrenheit is " + temp + " degrees.");
		}else {
			System.out.println("The temperature in Celsius is " + temp + " degrees.");
		}
	}
	
	static double getInput(Scanner sc, boolean isF) {
		try {
			if(isF) {
				System.out.print("What is the temperature in Fahrenheit? ");
			}else {
				System.out.print("What is the temperature in Celsius? ");
			}
			return Double.parseDouble(sc.next());
		}catch(Exception e) {
			System.out.print("\nThat was not a valid number. ");
			return getInput(sc, isF);
		}
	}
	
	static boolean getScale(Scanner sc) {
		
		System.out.println("F) Fahrenheit"); 
		System.out.println("C) Celsius\n"); 
		System.out.print("What temperature system are you using: "); 
		
		String choice = sc.next();
		if(choice.toUpperCase().equals("F")) {
			
			return true;
				
		}else if(choice.toUpperCase().equals("C")) {
			
			return false;
			
		}else {
			System.out.println("That was not a valid choice!");
			return getScale(sc);
		}
	}
	
	static double convert(double x, boolean isF) {
		if(isF) {
			return (x - 32) * (((double) 5)/9);
		}else {
			return (x * (((double) 9)/5)) + 32;
		}
	}
	
}
