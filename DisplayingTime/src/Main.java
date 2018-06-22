import java.util.Scanner;

public class Main{

  public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int secondsInput;
      int seconds;
      int minutes;
      int hours;

      System.out.println("How many seconds?");
      secondsInput = sc.nextInt();
      sc.close();

      hours = secondsInput / 3600;
      minutes = (secondsInput / 60) - (60 * hours);
      seconds = secondsInput % 60;

      if(hours == 0){
        System.out.println(secondsInput + " seconds equals: " + minutes + " minutes, " + seconds + " seconds.");
      }
      if(hours == 0 && minutes == 0){
        System.out.println(secondsInput + " seconds equals: " + seconds + " seconds.");
      }else{
        System.out.println(secondsInput + " seconds equals: " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds.");
      }

  }

}
