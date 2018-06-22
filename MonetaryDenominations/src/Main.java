import java.util.Scanner;

public class Main {
	
	static String input = "a";
	static String type = "unknown";
	
	public static void main(String[] args) {
		
		int amnt = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(!input.equals("x")) {
			
			amnt += getValue(sc);
			
		}
		
		
		System.out.println("You have " + amnt + " cents in your pocket.");
	}
	
	static int getAmountOf(Scanner sc) {
		int times;
		System.out.print("Number of " + type + ": " );
		return times = Integer.parseInt(sc.next());
	}
	
	static int getValue(Scanner sc) {
		
		System.out.print("p) Pennies \nn) Nickels\nd) Dimes\nq) Quarters\nh) Half-Dollars\n$) Dollar Coins\nx) No more coins\nInput: ");
		getInput(sc);
		
		switch(input){
		case "p":
			type = "penies";
			return 1 * getAmountOf(sc);
		case "n":
			type = "nickles";
			return 5 * getAmountOf(sc);
		case "d":
			type = "dimes";
			return 10 * getAmountOf(sc);
		case "q":
			type = "quarters";
			return 25 * getAmountOf(sc);
		case "h":
			type = "half-dollars";
			return 50 * getAmountOf(sc);
		case "$":
			type = "dollar coins";
			return 100 * getAmountOf(sc);
		case "x":
			type = "x";
			return 0;
		default:
			getValue(sc);
		}
		
		return getValue(sc);
	}
	
	static void getInput(Scanner sc) {
		input = sc.next();
	}
}
