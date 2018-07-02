import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean cont = true;
		
		while(cont) {
			System.out.print("Enter a word: ");
			String word = sc.next();
			char c = getChar(sc);
			if(word.contains(Character.toString(c))){
				System.out.println(c + "is in " + word);
			}else {
				System.out.println(c + "is not in " + word);
			}
			getContInput(sc);
		}
	}
	
	
	static boolean getContInput(Scanner sc) {
		
			System.out.print("Would you like to try another word: (Y or N) ");
			String decision = sc.next();
			if(!(decision.toUpperCase().equals("Y")) || !(decision.toUpperCase().equals("N"))) {
				System.out.println("Please enter a valid input.\n");
				return getContInput(sc);
			}else {
				if(decision.toUpperCase().equals("Y")){
					return true;
				}else {
					return false;
				}
			}
	}
	
	static char getChar(Scanner sc) {
	
		char c = 'c';
		
		try {
			
			System.out.print("Enter a character: ");
			c = sc.next().charAt(0);
			return c;
			
		} catch(Exception e) {
			System.out.println("Please enter a valid character.\n");
			return getChar(sc);
		}
		
		
	}
}
