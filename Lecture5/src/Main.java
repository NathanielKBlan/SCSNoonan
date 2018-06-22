import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		/*System.out.println(ran.nextFloat());
		System.out.println(ran.nextFloat());
		System.out.println(ran.nextFloat());*/
		
		float x = ran.nextFloat();
		for(int k = 5; k <2500; k++) {
			//x = ran.nextFloat();
			System.out.println(k);
		}
		System.out.println("Done!");
		
		/*int k = 5;
		while(k < 25) {
			x = ran.nextFloat();
			System.out.println(x);
			k++;
		}*/
		
		/*int m = ran.nextInt(12) + 1;
		
		System.out.println(m);
		
		String month = "December";
		
		switch(m) {
		case 1: 
			month = "January";
			break;
		case 2: 
			month = "February";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "December";
			break;
			
		default:
			break;
		}
		
		System.out.println(month);*/
	}
	
}
