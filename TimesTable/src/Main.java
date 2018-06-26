import java.util.Scanner;

/* Created on: 06/25/18
 * Author: Nathaniel Kristopher Blanquel
 * Purpose: To print out a times table
 */

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How large do you want your multiplication table to be? ");
		int maxColumnAndRow = getInput(sc);
		
		System.out.println("\t                  Times Table");
		for(int i = 0; i <= maxColumnAndRow; i++) {
			System.out.print("     " + i + "    ");
		}
		System.out.print("\n");
		for(int i = 0; i <= maxColumnAndRow; i++) {
			System.out.print("    " + "---" + "   ");
		}
		System.out.print("\n");
		for(int i = 0; i <= maxColumnAndRow; i++) {
			if(i == 0 || i % 6 == 0) {
				System.out.print("N " + i + " ");
			}
			if(i % 6 == 1) {
				System.out.print("u " + i + " ");
			}
			if(i % 6 == 2) {
				System.out.print("m " + i + " ");
			}
			if(i % 6 == 3) {
				System.out.print("b " + i + " ");
			}
			if(i % 6 == 4) {
				System.out.print("e " + i + " ");
			}
			if(i % 6 == 5) {
				System.out.print("r " + i + " ");
			}
			printTimes(i, maxColumnAndRow);
			System.out.print("\n");
		}
		
	}
	
	static void printTimes(int x, int y) {
		
		for(int i = 0; i <= y; i++) {
			
			int temp = x;
			
			temp *= i;
			
			System.out.print(" " + temp + spacing(temp));
		}
	}
	
	static String spacing(int a) {
		String s = "" + a;
		if (s.length() == 8) {
			return "   ";
		}
		if (s.length() == 7) {
			return "    ";
		}
		if (s.length() == 6) {
			return "     ";
		}
		if (s.length() == 5) {
			return "      ";
		}
		if (s.length() == 4) {
			return "       ";
		}
		if (s.length() == 3) {
			return "       ";
		}
		if (s.length() == 2) {
			return "       ";
		}
		if (s.length() == 1){
			return "        ";
		}
		return "";
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
