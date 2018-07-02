import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String cardNum = getInput(sc);
		int[] nums = splitNums(cardNum);
		int[] doubled = new int[8];
		int singleDigitSum = 0;
		int oddSum = 0;
		
		for(int i = 0; i < nums.length; i+=2) {
			for(int j = 0; j < doubled.length; j++) {
				doubled[j] = nums[i] * 2;
				if(doubled[j] >= 10) {
					int[] twoDigit = new int[2];
					String s = "" + doubled[j];
					twoDigit = splitNums(s);
					doubled[j] = twoDigit[0] + twoDigit[1];
				}
				singleDigitSum += doubled[j];
			}
		}
		
		for(int i = 0; i < nums.length; i+=2) {
			oddSum += nums[i];
		}
		int megaSum = singleDigitSum + oddSum;
		
		if(megaSum % 10 == 0) {
			System.out.println("This IS a valid card number.");
		}else {
			System.out.println("This is NOT a valid card number.");
		}
	}
	
	static int[] splitNums(String numbers) {
		int[] nums = new int[numbers.length()];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(numbers.substring(i, i + 1));
		}
		return nums;
	}
	
	static String getInput(Scanner sc) {
		
			String num = "";
		
			System.out.print("Enter a credit card number: ");
			num = sc.next();
			
			if(num.length() == 16) {
				return num;
			}else {
				System.out.println("Please enter a valid credit card number.\n");
				return getInput(sc);
			}
			
		
		
	}
	
}
