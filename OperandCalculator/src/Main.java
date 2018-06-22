import java.lang.Exception;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double numOne = getNumber(sc);
		String op = getOperand(sc); 
		double numTwo = getNumber(sc);
		double result = 0;
		
		switch(op) {
		case "+":
			result = numOne + numTwo;
			break;
		case "-":
			result = numOne - numTwo;
			break;
		case "x":
			result = numOne * numTwo;
			break;
		case "/":
			result = numOne / numTwo;
			break;
		case "%":
			result = (int) numOne % (int) numTwo;
			break;
		default:
			result = 25;
			break;
		}
		
		System.out.println(numOne + " " + op + " " + numTwo + " = " + result);
		sc.close();
	}
	
	static double getNumber(Scanner sc) {
		try {
			System.out.print("Enter a number: ");
			double num = Double.parseDouble(sc.next());
			return num;
		}catch(Exception e) {
			System.out.println("That was not a number!");
			getNumber(sc);
		}
		return 0;
	}
	
	static String getOperand(Scanner sc) {

		System.out.print("Enter an operand (+, -, x, /, %): ");
		switch(sc.next()) {
		case "+":
			return "+";
		case "-":
			return "-";
		case "x":
			return "x";
		case "/":
			return "/";
		case "%":
			return "%";
		default:
			return getOperand(sc);	
		}	

	}
}
