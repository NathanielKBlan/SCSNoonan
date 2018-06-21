import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.lang.Exception;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class Main{

  static int year;

  public static void main(String[] args){

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.addWindowListener(new WindowAdapter(){
      @Override
      public void windowClosing(WindowEvent e){
          System.exit(0);
      }
    });

    int year;
    year = getInput(frame);

    String message = "You are a ";

    switch (year % 12) {
      case 4:
      message = message + "rat!";
      break;
      case 5:
      message = "You are an ox!";
      break;
      case 6:
      message = message + "tiger!";
      break;
      case 7:
      message = message + "rabbit!";
      break;
      case 8:
      message = message + "dragon!";
      break;
      case 9:
      message = message + "snake!";
      break;
      case 10:
      message = message + "horse!";
      break;
      case 11:
      message = message + "goat!";
      break;
      case 0:
      message = message + "monkey!";
      break;
      case 1:
      message = message + "rooster!";
      break;
      case 2:
      message = message + "dog!";
      break;
      case 3:
      message = message + "pig!";
      break;
    }

    JOptionPane.showMessageDialog(frame, message);
    System.exit(0);
  }

  static int getInput(JFrame frame){

    String birthYear;
    int year;

    try{
      birthYear = JOptionPane.showInputDialog("Enter the year of your birth.");
      year = Integer.parseInt(birthYear);
      return year;
    }catch(Exception e){
      JOptionPane.showMessageDialog(frame, "That was not a valid year number.");
      return getInput(frame);
    }

  }
}
