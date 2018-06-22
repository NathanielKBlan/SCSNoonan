import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double x;
        double y;
        double answer;

        System.out.println("Please input your numbers in the format x^y.");
        String input = sc.nextLine();
        x = Double.parseDouble(input.substring(0, input.indexOf("^")));
        y = Double.parseDouble(input.substring(input.indexOf("^") + 1, input.length()));

        answer = Math.pow(x, y);

        System.out.println(input + " = " + answer);
        sc.close();
    }

}
