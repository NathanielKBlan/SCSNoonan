/* Created on: 06/24/18
 * Author: Nathaniel Kristopher Blanquel
 * Purpose: It's a guessing game. Can you guess the number?
 */

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Main {

	static int myNumber = (int) Math.round(Math.random() * 100);
	static JFrame frame = new JFrame();

	  public static void main(String[] args){
		  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    int x = getInput();
	    
	    while(x != myNumber){
	    	
	      if(x > myNumber){
	    	JOptionPane.showMessageDialog(frame, "Your number is too big. Try smaller.");
	        x = getInput();
	      }
	      
	      if(x < myNumber){
	    	JOptionPane.showMessageDialog(frame, "Your number is too small. Try larger.");
	        x = getInput();
	      }
	      
	    }
	    JOptionPane.showMessageDialog(frame, "You are correct");
	    System.exit(0);
	  }
	
	  static int getInput() {
		  try {
			  String returnValue = JOptionPane.showInputDialog(frame, "Type in a number.");
			  if (returnValue == null) {
				  System.exit(0);
			  }
			  return Integer.parseInt(returnValue);
		  }catch(Exception e) {
			  JOptionPane.showMessageDialog(frame, "That was not a valid reponse.");
			  return getInput();
		  }
	  }
}
