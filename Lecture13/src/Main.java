import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

//For file sorting. This program also implements the idea of an expanding array.
public class Main {

	public static void main(String[] args) {
		
		int[] arr = new int[1];
		Scanner sc = new Scanner(System.in);
		
		//Required in every file related program I make, blame eclipse for this.
		String filePath = "/Users/nathaniel_k_blanquel/Desktop/my-workspace/Lecture13/src/";
		
		System.out.print("Enter name of input file: ");
		String filename = sc.nextLine();
		
		
		try {
			FileReader fr = new FileReader(filePath + filename);
			BufferedReader br  = new BufferedReader(fr);
			String line;
			line = br.readLine();
			
			int counter = 0;
			while(line != null) {
				if(counter == 0) {
					int num = Integer.parseInt(line);
					counter++;
					int[] nums = new int[counter];
					nums[counter - 1] = num;
					arr = nums;
					line = br.readLine();
				}else {
					int num = Integer.parseInt(line);
					counter++;
					int[] nums = new int[counter];
					for(int i = 0; i < arr.length; i++) {
						nums[i] = arr[i];
					}
					nums[counter - 1] = num;
					arr = nums;
					line = br.readLine();
				}
				
			}
			
		}catch(FileNotFoundException e) {
			System.out.println("Can't find the file.");
		}catch(IOException e) {
			System.out.println("Can't read file.");
		}
		
		printSortedArray(arr);
		sc.close();
	}
	
	static void printSortedArray(int[] arr) {
		Arrays.sort(arr);
		
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length - 1) {
				System.out.print(arr[i]);
			}else {
				System.out.print(arr[i] + ", ");
			}
		}
		System.out.println("]");
	}

}
