import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.lang.Exception;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class UI{

  public UI(){

  }

  public int getInput(){

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    String birthYear;
    int year;

    try{
      birthYear = JOptionPane.showInputDialog("Enter the year of your birth.");
      if(birthYear == null){
        System.exit(0);
      }
      year = Integer.parseInt(birthYear);
      return year;
    }catch(Exception e){
      JOptionPane.showMessageDialog(frame, "That was not a valid year number.");
      return getInput();
    }


  }
}
