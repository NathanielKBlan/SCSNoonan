import java.util.Scanner;

public class Main {

	public void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		sc.next();
		printTaxes(sc);
		
	}
	
	static double getTaxLiability(double grossPay, double taxRate, Scanner sc) {
		
		return grossPay * taxRate;
		
	}
	
	static double getGrossPay(double hourlyRate, double numHours) {
		return hourlyRate * numHours;
	}
	
	static void printTaxes(Scanner sc) {
		
		double grossPay = getGrossPay(getHourlyRate(sc), getHoursWorked(sc));
		double fedTax = getFederalRate(sc);
		double stateTax = getStateRate(sc);
		
		System.out.println("Gross Pay: $" + grossPay);
		System.out.println("  Federal Tax Liability at " + fedTax + "%: $" + (grossPay * fedTax));
		System.out.println("  State Tax Liability at " + stateTax + "%: $" + (grossPay * stateTax));
		System.out.println("\nTotal Tax Liability: $" + (((grossPay * fedTax) + (grossPay * stateTax))*100)/100);
		System.out.println("Net Pay: $" + ((grossPay) - (((grossPay * fedTax) + (grossPay * stateTax))*100)/100));
	}
	
    static double getHourlyRate(Scanner sc) {
		
		double num;
		
		try {
			
			System.out.print("Enter hourly rate in $: ");
			num = Double.parseDouble(sc.next());
			return num;
			
		} catch(Exception e) {
			System.out.println("Please enter a valid hourly rate.\n");
			return getHourlyRate(sc);
		}
		
		
	}
    
    static double getHoursWorked(Scanner sc) {
		
		double num;
		
		try {
			
			System.out.print("Enter number of hours worked: ");
			num = Double.parseDouble(sc.next());
			return num;
			
		} catch(Exception e) {
			System.out.println("Please enter a valid number of hours.\n");
			return getHoursWorked(sc);
		}
		
		
	}
    
    static double getFederalRate(Scanner sc) {
		
		double num;
		
		try {
			
			System.out.print("Enter federal tax rate: ");
			num = Double.parseDouble(sc.next());
			return num;
			
		} catch(Exception e) {
			System.out.println("Please enter a valid rate.\n");
			return getFederalRate(sc);
		}
		
		
	}
    
    static double getStateRate(Scanner sc) {
		
		double num;
		
		try {
			
			System.out.print("Enter state tax rate: ");
			num = Double.parseDouble(sc.next());
			return num;
			
		} catch(Exception e) {
			System.out.println("Please enter a valid rate.\n");
			return getHourlyRate(sc);
		}
		
		
	}
}
