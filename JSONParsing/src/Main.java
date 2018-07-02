import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;

public class Main {

	static String fileInUse = "";
	static boolean changesInFile = false;
	
	static boolean quit = false;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Gson gs = new Gson();
		Classroom cs = new Classroom();
		
		cs = readFile(sc, gs);
		
		while(!quit) {
			printMenu();
			excecuteOptions(sc, cs, gs);
		}
		
		System.out.println("Thank you for using my program!");
		sc.close();
	}
	
	
	//This method gets the file and puts it into a reader for conversion from json to java objects
	static JsonReader getFile(Scanner sc, Gson gs) {
		
		//In order for this to work you need to set the file path accordingly to where you have your json file.
		String filePath = "/Users/nathaniel_k_blanquel/Desktop/my-workspace/JSONParsing/src/";
		
		System.out.print("What is the name of the input file? ");
		String fileName = sc.next();
		fileInUse = filePath + fileName;
		
		try {
			
			JsonReader reader = new JsonReader(new FileReader(fileInUse));
			return reader;
			
		}catch(FileNotFoundException e) {
			
			System.out.println("That file could not be found.");
			return getFile(sc, gs);
			
		}
		
	}
	
	//This method creates the objects listed in the json file
	static Classroom readFile(Scanner sc, Gson gs) {
		try {
			return gs.fromJson(getFile(sc, gs), Classroom.class);
		}catch(JsonSyntaxException e) {
			System.out.println(e);
			return readFile(sc, gs);
		}
	}
	
	//This method prints out the program's menu
	static void printMenu() {
		
		System.out.println();
		System.out.println("1) Display Roster");
		System.out.println("2) Add Student");
		System.out.println("3) Remove Student");
		System.out.println("4) Add Grade");
		System.out.println("5) Sort Roster");
		System.out.println("6) Write File");
		System.out.println("7) Exit");
		
	}
	
	static void excecuteOptions(Scanner sc, Classroom cs, Gson gs) {
		
		System.out.print("What would you like to do? ");
		String response = sc.next();
		switch(response) {
		case "1":
			cs.printRoster();
			break;
		case "2":
			cs.addStudent(sc);
			changesInFile = true;
			break;
		case "3":
			cs.removeStudent(sc);
			changesInFile = true;
			break;
		case "4":
			cs.changeGradeBook(sc);
			changesInFile = true;
			break;
		case "5":
			cs.sort(sc);
			changesInFile = true;
			break;
		case "6":
			saveChanges(gs, sc, cs);
			break;
		case "7":
			quit = true;
			break;
		}
	}
	
	static void saveChanges(Gson gs, Scanner sc, Classroom cs) {
		if(changesInFile) {
			System.out.print("Changes have been made to the file, would you like to save them? (Y or N) ");
			String response = sc.next();
			if(response.toUpperCase().equals("Y")) {
				try {
					Writer w = new FileWriter(fileInUse); 
					gs.toJson(cs, w) ;
					w.flush();
					w.close();
				}catch(Exception e) {
					
				}
				System.out.println("Changes have been saved");
			}else if(response.toUpperCase().equals("N")) {
				
			}else {
				System.out.println("That was not a valid response. ");
				saveChanges(gs, sc, cs);
			}
		}else {
			System.out.println("There have been no chnages made to the file.");
		}	
	}
	
}