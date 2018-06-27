import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int[] nums;
		Scanner sc = new Scanner(System.in);
		
		nums = getNums(sc);
		System.out.println("Here are 10 random numbers between " + nums[0] + " and " + nums[1] + ": ");
		nums = randomNumbers(nums[0], nums[1]);
		
		for(int i = 0; i < 9; i++) {
			System.out.print(nums[i] + ", ");
		}
		System.out.print(nums[9]);
		
	}
	
	static int getInput(Scanner sc) {
		try {
			return Integer.parseInt(sc.next());
		}catch(Exception e) {
			System.out.print("\nThat was not a valid number. ");
			return getInput(sc);
		}
	}
	
	static int[] getNums(Scanner sc) {
		int[] numbers = new int[2];
		System.out.print("Enter a minimum value: ");
		numbers[0] = getInput(sc);
		System.out.print("Enter a maximum value: ");
		numbers[1] = getInput(sc);
		if(numbers[0] > numbers[1]) {
			System.out.println("The minimum is not smaller than the maximum!");
			return getNums(sc);
		}else {
			return numbers;
		}
	}
	
	static int[] randomNumbers(int min, int max) {
		int[] randNums = new int[10];
		for(int i = 0; i < 10; i++) {
			randNums[i] = ((int) (Math.random() * (max - min))) + min;
		}
		return randNums;
	}
}
