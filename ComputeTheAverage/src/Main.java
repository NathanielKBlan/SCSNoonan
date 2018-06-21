import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculate(10, sc);
    }

    static void calculate(int numOfNums, Scanner sc){
      double sum = 0;
      double average;
      double[] numbers = new double[numOfNums];
      for(int i = 0; i < numOfNums; i++){
        System.out.print("Enter #" + (i + 1) + " - ");
        numbers[i] = Double.parseDouble(sc.next());
        sum += numbers[i];
      }
      average = sum / numOfNums;
      System.out.println("\nThe sum is " + sum + ".");
      System.out.println("The average is " + average + ".");
    }
}
