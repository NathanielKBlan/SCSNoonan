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
      double answerImg = 0;
      boolean imaginary = false;

      System.out.print("Enter the value for a: ");
      a = Dtouble.parseDouble(sc.next());
      System.out.print("Enter the value for b: ");
      b = Double.parseDouble(sc.next());
      System.out.print("Enter the value for c: ");
      c = Double.parseDouble(sc.next());
      sc.close();

      if((b*b) - (4*a*c) < 0){

        answerImg = Math.sqrt(-1*((b*b) - (4*a*c)))/(2*a);
        answerPos = (-1*b)/(2*a);
        answerNeg = (-1*b)/(2*a);
        imaginary = true;

      }else{

        answerPos = ((-1*b) + Math.sqrt((b*b) - (4*a*c)))/(2*a);
        answerNeg = ((-1*b) - Math.sqrt((b*b) - (4*a*c)))/(2*a);

      }


      if(imaginary){
        if(a == 1) {
    			System.out.println("For the equation " + "x^2 + " + b + "x + " + c + ", the solutions are \n" + "x1 = " + answerPos + " + " + answerImg + "i" + " and x2 = " + answerNeg + " + " + answerImg + "i.");
    		}else {
    			System.out.println("For the equation " + a + "x^2 + " + b + "x + " + c + ", the solutions are \n" + "x1 = " + answerPos + " + " + answerImg + "i" + " and x2 = " + answerNeg + " + " + answerImg + "i.");
    		}
      }if(!imaginary && answerPos != answerNeg){
        if(a == 1) {
    			System.out.println("For the equation " + "x^2 + " + b + "x + " + c + ", the solutions are \n"
    					+ "x1 = " + answerPos + " and x2 = " + answerNeg + ".");
    		}else {
    			System.out.println("For the equation " + a + "x^2 + " + b + "x + " + c + ", the solutions are \n"
    					+ "x1 = " + answerPos + " and x2 = " + answerNeg + ".");
    		}
      }if(!imaginary && answerPos == answerNeg){
        System.out.println("For the equation " + "x^2 + " + b + "x + " + c + ", there is only one solution: \n"
            + "x = " + answerPos + ".");
      }

    }
}
