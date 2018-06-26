
public class Main {

	public static void main(String[] args) {
		
		int num = 20;
		boolean inside = false;
		
		while(num <= 10 || !inside) {
			System.out.println(num);
			inside = true;
			num++;
		}
		
		do {
			System.out.println(num);
			num++;
		}while(num < 11);
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
	
}
