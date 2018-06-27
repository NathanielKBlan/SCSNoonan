import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		findSum(sc);
		
		sc.close();
	}
	
	static int returnSum(int low, int high) {
		int sum = 0;
		for(int i = low; i <= high; i++) {
			sum += i;
		}
		System.out.println("The sum from " + low + " to " + high + " is " + sum + ".");
		return sum;
	}
	
	static int findSum(Scanner sc) {
		
		System.out.print("\nEnter the lower value: ");
		int numLow = getInput(sc);
		
		System.out.print("Enter the higher value: ");
		int numHigh = getInput(sc);
		
		if(numHigh > numLow) {
			return returnSum(numLow, numHigh);
		}else {
			System.out.print("\nThe lower value is not less than the higher value. ");
			return findSum(sc);
		}
		
	}
	
	static int getInput(Scanner sc) {
		  try {
			  return Integer.parseInt(sc.next());
		  }catch(Exception e) {
			  System.out.print("That was not a valid input.");
			  return getInput(sc);
		  }
	 }
}
