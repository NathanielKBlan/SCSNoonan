
public class Main {

	public static void main(String[] args) {
		
		//Start timing of prime algorithm
		long startTime = System.nanoTime();
		
		for(int n = 1; n < 100000; n++) {
			if(isPrime(n)) {
				System.out.println(n);
			}
		}
		
		//End timing of prime algorithm
		long endTime = System.nanoTime();
	    System.out.println("Selection Sort Time: " + (double) (endTime - startTime)/1000000 + " ms" );
		
	}
	
	static boolean isPrime(int n) {
		for(int i = 1; i <= n/2; i++) {
			if(n % i == 0 && i != 1) {
				return false;
			}
		}
		return true;
	}
	
}
