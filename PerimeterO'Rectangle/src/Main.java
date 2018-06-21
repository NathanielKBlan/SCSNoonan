import java.util.Scanner;

public class Main{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    double l;
    double w;
    double perim;

    System.out.println("Input the length: ");
    l = sc.nextDouble();
    System.out.println("Input the width: ");
    w = sc.nextDouble();

    perim = (2*l) + (2*w);
    System.out.println("The rectangle with length " + l + " and width " + w + " has a perimeter of " + perim + ".");
  }
}
