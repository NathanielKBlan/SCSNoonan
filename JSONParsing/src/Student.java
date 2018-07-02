import java.util.Scanner;

public class Student {

	Name name;
	double average;
	int numGrades;
	
	public Student(String fname, String lname, int average, int numGrades) {
		this.average = average;
		this.numGrades = numGrades;
		name = new Name(fname, lname);
	}
	
	public Student(String fname, String lname) {
		name = new Name(fname, lname);
		average = 0;
		numGrades = 0;
	}
	
	public String getFirstName() {
		return name.fname;
	}
	
	public String getLastName() {
		return name.lname;
	}
	
	public void addGrade(Scanner sc) {
		System.out.print("Please enter a new score: ");
		try {
			double score = sc.nextDouble();
			numGrades++;
			average = (score + average) / numGrades;
			System.out.println(getLastName() + ", " + getFirstName() + " " + average);
		}catch(Exception e) {
			System.out.println("That was not a valid score");
			addGrade(sc);
		}
	}
}