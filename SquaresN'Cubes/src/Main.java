/* Created on: 06/19/18
 * Author: Nathaniel Kristopher Blanquel
 * Purpose: To print out the powers of numbers.
 */

public class Main {

	public static void main(String[] args) {
		int power = 8;
		System.out.println("\t            Power");
		for(int i = 0; i <= power; i++) {
			System.out.print("     " + i + "    ");
		}
		System.out.print("\n");
		for(int i = 0; i <= power; i++) {
			System.out.print("    " + "---" + "   ");
		}
		System.out.print("\n");
		for(int i = 0; i <= 4; i++) {
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
			printPowers(i, power);
			System.out.print("\n");
		}
	}
	
	static void printPowers(int x, int y) {
		for(int i = 0; i < y; i++) {
			int temp = x;
			if(i == 0 && x != 0) {
				System.out.print(" " + 1);
			}
			if(i == 0 && x == 0) {
				System.out.print("id");
			}
			for(int t = 0; t < i; t++) {
				temp *= x;
			}
			
			System.out.print(spacing(temp) + temp);
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
			return "        ";
		}
		if (s.length() == 1){
			return "         ";
		}
		return "";
	}
	
}
