import java.util.Scanner;

public class Main {

	static boolean rect = false;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] dimension;
		
		dimension = getChoiceAndDim(sc);
		if(rect) {
			printRectangle(dimension[0], dimension[1]);
		}else {
			printTriangle(dimension[0]);
		}
	}
	
	static void printRectangle(int length, int width) {
		
		System.out.print(" ");
		for(int i = 1; i <= width; i++) {
			System.out.print("_");
		}
		System.out.println();
		for(int i = 1; i < length; i++) {
			System.out.print("|");
			for(int j = 1; j <= width; j++) {
				System.out.print(" ");
			}
			System.out.print("|");
			System.out.println();
		}
		
		
		System.out.print("|");
		for(int j = 1; j <= width; j++) {
			System.out.print("-");
		}
		System.out.print("|");
		
		
		
	}
	
	static void printTriangle(int base) {
		
		
		for(int j = 1; j <= base; j++) {
			System.out.print("  ");
		}
		System.out.println("  /\\");
		for(int j = 1; j <= base; j++) {
			System.out.print("  ");
		}
		for(int i = 1; i < base / 2; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			System.out.print("/");
			for(int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			System.out.print("\\" + "\n");
		}
		
		for(int j = 1; j <= base; j++) {
			System.out.print("  ");
		}
		System.out.print(" ");
		for(int i = 1; i <= base; i++) {
			System.out.print("-");
		}
		
	}
	
	static int getInput(Scanner sc) {
		try {
			return Integer.parseInt(sc.next());
		}catch(Exception e) {
			System.out.print("\nThat was not a valid number. ");
			return getInput(sc);
		}
	}
	
	static int[] getChoiceAndDim(Scanner sc) {
		int[] dim = new int[2];
		System.out.println("r) Rectangle"); 
		System.out.println("t) Triangle\n"); 
		System.out.print("Which would you like to print: "); 
		
		String choice = sc.next();
		if(choice.toUpperCase().equals("R")) {
			
			rect = true;
			
			System.out.print("Length: ");
			dim[0] = getInput(sc);
			System.out.print("Width: ");
			dim[1] = getInput(sc);
			return dim;
			
		}else if(choice.toUpperCase().equals("T")) {
			
			System.out.print("Base: ");
			dim[0] = getInput(sc);
			dim[1] = dim[0];
			return dim;
			
		}else {
			return getChoiceAndDim(sc);
		}
	}
}
