
public class Main {

	public static void main(String[] args) {
		
		int val = 10;
		System.out.println("val = " + val);
		int n = foo(val);
		System.out.println("val = " + val);
		
		String str = "Noonan";
		System.out.println(str);
		char ch = str.charAt(3);
		System.out.println(ch);
		int size = str.length();
		System.out.println("size  = " + size);
		for(int i = 0; i < size; i++) {
			System.out.println("index " + i + " has character " + str.charAt(i));
		}
	}
	
	static int foo(int num) {
		num += 7;
		return num;
	}
}
