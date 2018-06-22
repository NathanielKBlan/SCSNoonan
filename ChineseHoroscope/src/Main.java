import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.lang.Exception;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class Main{

  static int year;

  public static void main(String[] args){

    JFrame frame = new JFrame();
    UI ui = new UI();

    int year;
    year = ui.getInput();

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

}
