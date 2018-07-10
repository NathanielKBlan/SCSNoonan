import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numOfStrings = getNumInput(sc);
		String[] values = new String[numOfStrings]; 
		
		for(int i = 0; i < values.length; i++) {
			System.out.print("\nEnter value #" + (i + 1) + ": ");
			values[i] = sc.next();
		}
		
		System.out.print("[");
		for(int i = 0; i < values.length - 1; i++) {
			System.out.print(values[i] + ", ");
		}
		System.out.print(values[values.length - 1] + "]");
		
		sortingOption(sc, values);
		sc.close();
		
		System.out.print("[");
		for(int i = 0; i < values.length - 1; i++) {
			System.out.print(values[i] + ", ");
		}
		System.out.print(values[values.length - 1] + "]");
	}
	
	static int getNumInput(Scanner sc) {
		try {
			System.out.print("How many values would you like to enter? ");
			return Integer.parseInt(sc.next());
		}catch(Exception e) {
			System.out.print("That is not a valid input! ");
			return getNumInput(sc);
		}
	}
	
	static void sortingOption(Scanner sc, String[] values) {
		System.out.print("\na) Alphabetically");
		System.out.print("\nb) by length");
		System.out.print("\nHow would you like to sort? (a or b) ");
		String input = sc.next();
		if(input.toUpperCase().equals("A")) {
			sortByAlpha(values);
		}else if(input.toUpperCase().equals("B")) {
			sortByLength(values);
		}else {
			System.out.println("That was not a valid input!");
			sortingOption(sc, values);
		}
	}
	
	static void sortByAlpha(String[] values) {
		for(int i = values.length - 1; i > 1; i--) {
			for(int j = 0; j < i; j++) {
				if(values[j].compareTo(values[j + 1]) > 1){
		            String temp = values[j];
		            values[j] = values[j + 1];
		            values[j + 1] = temp;
		        }
			}
		}
	}
	
	static void sortByLength(String[] values) {
		for(int i = values.length - 1; i > 1; i--) {
			for(int j = 0; j < i; j++) {
				if(values[j].length() > values[j + 1].length()){
		            String temp = values[j];
		            values[j] = values[j + 1];
		            values[j + 1] = temp;
		        }
			}
		}
	}
}

