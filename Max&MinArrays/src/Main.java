import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[getLength(sc)];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = getInput(sc, i);
		}
		
		System.out.println("The average of your numbers is " + getAverage(nums));
		System.out.println("The maximum of your numbers is " + getMax(nums));
		System.out.println("The minimum of your numbers is " + getMin(nums));
	}
	
	static int getInput(Scanner sc, int n) {
		System.out.print("Enter value #" + (n + 1) + ": ");
		try {
			return Integer.parseInt(sc.next());
		}catch(Exception e) {
			System.out.print("That was not a valid number! ");
			return getInput(sc, n);
		}
	}
	
	static int getLength(Scanner sc) {
		System.out.print("How many numbers are in your list? ");
		try {
			return Integer.parseInt(sc.next());
		}catch(Exception e) {
			System.out.print("That was not a valid number! ");
			return getLength(sc);
		}
	}
	
	static double getAverage(int[] nums) {
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return (double) sum / nums.length;
	}
	
	static double getMin(int[] nums) {
		Arrays.sort(nums);
		return nums[0];
	}
	
	static double getMax(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length - 1];
	}
}
