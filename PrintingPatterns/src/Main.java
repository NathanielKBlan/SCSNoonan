
public class Main {
	
	public static void main(String[] args) {
		//increasingTriangle(5);
		//specialTriangle(5);
		
		wannaBePascalTriangle(5);
	}
	
	static void increasingTriangle(int row) {
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	static void specialTriangle(int row) {
		for(int i = 1; i <= row; i++) {
			for(int j = i; j >= 1; j--) {
				if(i == 1)
					System.out.print(i);
				else
					System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	static void wannaBePascalTriangle(int r) {
		System.out.println("             1");
		for(int row = 1; row <= r - 1; row++) {
			System.out.print("\t  ");
			for(int i = 0; i < row; i++) {
				System.out.print(" " + (int) Math.pow(2, i));
			}
			for(int j = row; j >= 0; j--) {
				System.out.print(" " + (int) Math.pow(2, j));
			}
			System.out.println();
		}
	}
	
	static String spacing(int t) {
		String s = "";
		for(int i = 1; i <= t; i++) {
			s += "";
		}
		return s;
	}
	
}
