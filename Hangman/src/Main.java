import java.util.Scanner;

class Main extends Word{

  public static void main(String[] args){
	  
	 Word w = new Word();
	 String str;
	 Scanner s = new Scanner(System.in);
	 String guessedC;
	 int guess = 0;
	 int wrongGuess = 0;
	 int lettersFound = 0;
	 String guessedLetters = "";
	 String bW = "";
	 int letterFound;
	  
    for(int i = 0; i < bW.length(); i++){
      System.out.print(bW.substring(i,i+1) + " " );
      System.out.print("\n");
    }
    str = w.getRandomWord();
    System.out.println("Welcome to the hanging of the man! (Not associated w/ violence.)");
    System.out.println("The word has " + str.length() + " letters.");
    for(int i = 0; i < str.length(); i++){
      bW += "_";
    }
    while(guess < str.length() && lettersFound < str.length()){
      letterFound = 0;
      guessedC = s.next().toLowerCase();
      while(guessedLetters.contains(guessedC)) {
    	  System.out.println("You already used that letter");
    	  guessedC = s.next().toLowerCase();
      }
      guessedLetters += guessedC;
      for (int i=0; i < str.length(); i ++)  {
        String currentLetter = str.substring(i, i+1);
        if(currentLetter.toUpperCase().equals(guessedC.toUpperCase())){
          bW = bW.substring(0,i) + guessedC + bW.substring(i + 1);
          System.out.println(bW);
          letterFound += 1;
        }
      }

      if(letterFound >= 1){
        System.out.println("You are correct!");
        lettersFound += letterFound;
        guess++;
      }else{
        System.out.println("You are wrong...");
        wrongGuess++;
      }

      if (wrongGuess == 1 && letterFound == 0)
        System.out.println("\nThe person has been found guilty and scentenced to death by grand jury.");
      if (wrongGuess >= 2)
        System.out.println("----|");
      if (wrongGuess >= 3)
        System.out.println("|    o");
      if (wrongGuess >= 4)
        System.out.println("|    /|\\");
      if (wrongGuess >= 5){
        System.out.println("|    / \\");
        System.out.println("You lost");
        guess += 100;
      }
    }
    
    if(lettersFound == str.length()) {
      s.close();
  	  System.out.println("You win!");
  	  System.exit(0);
    }

  }
}
