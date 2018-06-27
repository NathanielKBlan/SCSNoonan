import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		System.out.println("Starting program.");
		
		for(int i = 1; i <= 10; i++) {
			printName(i, "Hello");
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter principal: ");
		double principal = scan.nextDouble();
		System.out.println("Enter interest rate: ");
		double interestRate = scan.nextDouble();
		System.out.println("Enter number of years: ");
		int years = scan.nextInt();
		double newPrincipal = totalMoney(principal, interestRate, years);
		System.out.println("Holy cow! You have a lot of money - $" + newPrincipal);
		System.out.println("Ending program.");
		
	}
	
	static void printName(int num, String s) {
		System.out.println(num + ". My name is Nathaniel.");
	}
	
	static double totalMoney(double principal, double interestRate, int years) {
		
		for(int i = 0; i < years; i++) {
			principal = principal + (principal * interestRate);
		}
		//System.out.println("You now have $ " + principal);
		return principal;
	}
	
}
