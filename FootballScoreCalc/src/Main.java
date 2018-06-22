import java.util.Scanner;

public class Main{

    static int safeties = 0;
    static int fGoals = 0;
    static int touchdowns = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int scoreOne;
        int scoreTwo;

        System.out.println("Team #1\n-------");
        getSFT(sc);
        scoreOne = getScore(safeties, fGoals, touchdowns);

        System.out.println("Team #2\n-------");
        getSFT(sc);
        scoreTwo = getScore(safeties, fGoals, touchdowns);

        System.out.println("Team #1 Score - " + scoreOne);
        System.out.println("Team #2 Score - " + scoreTwo);
    }

    static void getSFT(Scanner sc){
      System.out.print("Please input the number of safeties: ");
      safeties = Integer.parseInt(sc.next());
      System.out.print("Please input the number of field goals: ");
      fGoals = Integer.parseInt(sc.next());
      System.out.print("Please input the number of touchdowns: ");
      touchdowns = Integer.parseInt(sc.next());
      System.out.println();
    }

    static int getScore(int s, int f, int t){
      return (s * 2) + (f * 3) + (t * 7);
    }
}
