import java.util.Scanner;

class Main extends Word{
  static Word w = new Word();
  

  public static void main(String[] args){
	  
	 String str;
	 Scanner s = new Scanner(System.in);
	 String input;
	 String guessedC;
	 int guess = 0;
	 int wrongGuess = 0;
	 int lettersFound = 0;
	 String guessedLetters;
	 String bW = "";
	 boolean letterFound;
	  
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
      letterFound = false;
      input = s.next();
      input = input.toLowerCase();
      guessedC = input;
      guessedLetters = "";
      guessedLetters += guessedC;
      for (int i=0; i < str.length(); i ++)  {
        String currentLetter = str.substring(i, i+1);
        if(currentLetter.toUpperCase().equals(guessedC.toUpperCase())){
          bW = bW.substring(0,i) + guessedC + bW.substring(i + 1);
          System.out.println(bW);
          letterFound = true;
        }
      }

      if(letterFound){
        System.out.println("You are correct!");
        lettersFound++;
        guess++;
      }else{
        System.out.println("You are wrong...");
        wrongGuess++;
      }

      if (wrongGuess >= 1)
        System.out.println("\n");

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
  	  System.out.println("You win!");
    }

  }
}
