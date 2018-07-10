import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Word{

  public Word() {
	  
  }
  
  String[] words = new String[1];
  int element;
  String sW;

  public String getRandomWord(){
	readFile();
    element = new Random().nextInt(words.length);
    return sW = words[element];
  }
  
  public void readFile() {
	  Scanner sc = new Scanner(System.in);
	  String filePath = "/Users/nathaniel_k_blanquel/Desktop/my-workspace/Hangman/src/";
	  String filename = "hangmanwords.txt";
		
		
		try {
			FileReader fr = new FileReader(filePath + filename);
			BufferedReader br  = new BufferedReader(fr);
			String line;
			line = br.readLine();
			
			int counter = 0;
			while(line != null) {
				if(counter == 0) {
					String word = line;
					counter++;
					String[] wS = new String[counter];
					wS[counter - 1] = word;
					words = wS;
					line = br.readLine();
				}else {
					String word = line;
					counter++;
					String[] wS = new String[counter];
					for(int i = 0; i < words.length; i++) {
						wS[i] = words[i];
					}
					wS[counter - 1] = word;
					words = wS;
					line = br.readLine();
				}
				
			}
			
		}catch(FileNotFoundException e) {
			System.out.println("The required source file \"hangmanwords.txt\" wasn't found.");
		}catch(IOException e) {
			System.out.println("The required source file \\\"hangmanwords.txt\\\" can't be read.");
		}
  }
}
