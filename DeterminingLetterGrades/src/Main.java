import java.util.Scanner;
import java.lang.Exception;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a percentage: ");
        determineGrade(getInput(sc));

        sc.close();

    }

    static void determineGrade(double percent){
      if(percent < 60)
        System.out.println(percent + "% is a F.");
      if(percent < 70 && percent >= 60)
        System.out.println(percent + "% is a D.");
      if(percent < 80 && percent >= 70)
        System.out.println(percent + "% is a C.");
      if(percent < 90 && percent >= 80)
        System.out.println(percent + "% is a B.");
      if(percent >= 90)
        System.out.println(percent + "% is an A.");
    }

    static double getInput(Scanner sc){

      try{
        return Double.parseDouble(sc.next());
      }catch(Exception e){
        System.out.print("That was not a percentage! Please input a percentage: ");
        return getInput(sc);
      }

    }
}
