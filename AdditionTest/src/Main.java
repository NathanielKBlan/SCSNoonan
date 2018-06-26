import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int totalCorrect = 0;
		int totalIncorrect = 0;
		
		System.out.print("How many addition problems would you like? ");
		int problems = getInput(sc);
		
		for(int i = 1; i <= problems; i++) {
			
			int answer = generateProblem(i);
			if(getInput(sc) == answer) {
				System.out.println("That is correct!");
				totalCorrect++;
			}else {
				System.out.println("That is incorrect.");
				totalIncorrect++;
			}
			
		}
		
		System.out.println("\nTotal number correct: " + totalCorrect);
		System.out.println("Total number incorrect: " + totalIncorrect);
	}
	
	static int generateProblem(int n) {
		
		int x = (int) Math.round(Math.random() * 100) + 1;
		int y = (int) Math.round(Math.random() * 100) + 1;
		
		System.out.print("\nProblem #" + n + "\n" + x + " + " + y + " = ");
		return x+y;
	}
	
	static int getInput(Scanner sc) {
		try {
			return Integer.parseInt(sc.next());
		}catch(Exception e) {
			System.out.print("\nThat was not a valid number. ");
			return getInput(sc);
		}
	}
}
