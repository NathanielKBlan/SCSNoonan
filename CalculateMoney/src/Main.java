import java.util.Scanner;

public class Main {

	static String input = "a";
	static String type = "unknown";
	
	public static void main(String[] args) {
		
		double amnt = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to money counter.");
		
		String[] types = {"pennies", "nickels", "dimes", "quarters", "half-dollars", "$1 bills", "$5 bills", "$10 bills", "$20 bills", "$50 bills", "$100 bills"};
		
		for(String type: types) {
			amnt += getValue(sc, type);
		}
		
		System.out.println("You have " + amnt + " in cash in your jar.");
	}
	
	static int getAmountOf(Scanner sc, String type) {
		int times;
		System.out.print("How many of " + type + "do you have? " );
		return times = Integer.parseInt(getInput(sc));
	}
	
	static double getValue(Scanner sc, String type) {
		
		
		
		switch(type){
		case "penies":
			return .01 * getAmountOf(sc, type);
		case "nickles":
			return .05 * getAmountOf(sc, type);
		case "dimes":
			return .10 * getAmountOf(sc, type);
		case "quarters":
			return .25 * getAmountOf(sc, type);
		case "half-dollars":
			return .50 * getAmountOf(sc, type);
		case "$1 bills":
			return 1.00 * getAmountOf(sc, type);
		case "$5 bills":
			return 5.00 * getAmountOf(sc, type);
		case "$10 bills":
			return 10.00 * getAmountOf(sc, type);
		case "$20 bills":
			return 20.00 * getAmountOf(sc, type);
		case "$50 bills":
			return 50.00 * getAmountOf(sc, type);
		case "$100 bills":
			return 100.00 * getAmountOf(sc, type);
		}
		
		return 0;
	}
	
	static String getInput(Scanner sc) {
		return sc.next();
	}
	
}
