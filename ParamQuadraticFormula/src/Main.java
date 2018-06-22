import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

      double a = 0;
      double b = 0;
      double c = 0;

      Scanner sc = new Scanner(System.in);
      calculate(a, b, c, sc);

    }

    static void calculate(double a, double b, double c, Scanner sc){

      double answerPos;
      double answerNeg;

      System.out.print("Enter the value for a: ");
      a = Double.parseDouble(sc.next());
      System.out.print("Enter the value for b: ");
      b = Double.parseDouble(sc.next());
      System.out.print("Enter the value for c: ");
      c = Double.parseDouble(sc.next());
      sc.close();

      answerPos = ((-1*b) + Math.sqrt((b*b) - (4*a*c)))/(2*a);
      System.out.println(answerPos);
      answerNeg = ((-1*b) - Math.sqrt((b*b) - (4*a*c)))/(2*a);

      if(a == 1) {
  			System.out.println("For the equation " + "x^2 + " + b + "x + " + c + ", the solutions are \n"
  					+ "x1 = " + answerPos + " and x2 = " + answerNeg + ".");
  		}else {
  			System.out.println("For the equation " + a + "x^2 + " + b + "x + " + c + ", the solutions are \n"
  					+ "x1 = " + answerPos + " and x2 = " + answerNeg + ".");
  		}
    }
}
