import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Tell me your name: ");
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println("Hello, " + s + ".");

        System.out.println("Tell me a number: ");
        System.out.println(sc.nextInt());
        sc.close();
    }

}
