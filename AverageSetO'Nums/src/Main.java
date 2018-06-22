import java.util.Scanner;

public class Main {
	
	static double average = 0;
	static int numberOfNums = 0;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			average += getNumber(sc);
			numberOfNums++;
		}
	}
	
	static double getNumber(Scanner sc) {
		System.out.print("Enter a number (x to stop): ");
		try {
			String input = sc.next();
			if(input.equals("x")) {
				if(numberOfNums == 0)
					average = 0;
				else
					average /= numberOfNums;
				System.out.println("The average of those " + numberOfNums + " numbers is " + average);
				System.exit(0);
				return 0;
			}else {
				double num = Double.parseDouble(input);
				return num;
			}
		}catch(Exception e) {
			System.out.println("That was not a valid input!");
			return getNumber(sc);
		}
	}

}
