
public class Main {

	public static void main(String[] args) {
		
		int num1 = 3;
		int num2 = 7;
		int num3 = concat(num1, num2);
		
		String str1 = "hello";
		String str2 = "world";
		String str3 = concat(str1, str2);
		
	}
	
	static int concat(int a, int b) {
		String str = a + "" + b;
		return Integer.parseInt(str);
	}
	
	static String concat(String one, String two) {
		return one + two;
	}
	
}
