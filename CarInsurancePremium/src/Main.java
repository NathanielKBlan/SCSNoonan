import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        info(sc);
    }

    static void info(Scanner sc){
      int age;
      String gender;
      String vehicleType;
      int payment = 0;

      System.out.print("How old is the drive? ");
      age = Integer.parseInt(sc.next());

      System.out.print("\n\nGender\n  a) Male \n  b) Female \nWhat is your gender?");
      if(sc.next().toString().equals("a")){
        gender = "male";
      }else{
        gender = "female";
      }

      System.out.print("\n\nVehicle Type\n  a) Honda \n  b) Ferrari \nWhat is the vehicle type?");
      if(sc.next().toString().equals("a")){
        vehicleType = "Honda";
      }else{
        vehicleType = "Ferrari";
      }

      if(age <= 30 && gender.equals("male") && vehicleType.equals("Ferrari")){
        payment = 1000;
      } else if(age <= 30 && gender.equals("female") && vehicleType.equals("Ferrari")){
        payment = 900;
      } else if(age <= 30 && gender.equals("male") && vehicleType.equals("Honda")){
        payment = 300;
      } else if(age <= 30 && gender.equals("female") && vehicleType.equals("Honda")){
        payment = 200;
      } else if(age < 50 && gender.equals("male") && vehicleType.equals("Ferrari")){
        payment = 700;
      } else if(age < 50 && gender.equals("female") && vehicleType.equals("Ferrari")){
        payment = 500;
      } else if(age < 50 && gender.equals("male") && vehicleType.equals("Honda")){
        payment = 200;
      } else if(age < 50 && gender.equals("female") && vehicleType.equals("Honda")){
        payment = 100;
      } else if(age >= 50 && gender.equals("male") && vehicleType.equals("Ferrari")){
        payment = 600;
      } else if(age >= 50 && gender.equals("female") && vehicleType.equals("Ferrari")){
        payment = 400;
      } else if(age >= 50 && gender.equals("male") && vehicleType.equals("Honda")){
        payment = 150;
      } else if(age >= 50 && gender.equals("female") && vehicleType.equals("Honda")){
        payment = 50;
      }

      System.out.println("The monthly payment for a " + age + " year old " + gender + " driving a " + vehicleType + " is $" + payment + ".");
    }

}
