import java.util.ArrayList;
import java.util.Scanner;

public class Classroom {
	
	ArrayList<Student> students = new ArrayList<Student>();
	
	public Classroom() {
		
	}
	
	public void addStudent(Scanner sc) {
		System.out.print("What is the student's first name? ");
		String fname = sc.next(); 
		System.out.print("What is the student's last name? ");
		String lname = sc.next(); 
		students.add(new Student(fname, lname));
	}
	
	public void removeStudent(Scanner sc) {
		int foundMatch = 0;
		Student[] commonNamedStudents = new Student[students.size()];
		System.out.print("What is the first name of the student? ");
		String firstName = sc.next();
		for(Student s: students) {
			if(s.getFirstName().equals(firstName)) {
				commonNamedStudents[foundMatch] = s;
				foundMatch++;
			}
		}
		if(foundMatch > 1) {
			boolean found = false;
			System.out.print("What is the last name of the student? ");
			String lastName = sc.next();
			for(int i = 0; i < foundMatch; i++) {
				if(commonNamedStudents[i].getLastName().equals(lastName)) {
					found = true;
					students.remove(commonNamedStudents[i]);
				}
			}
			if(!found) {
				System.out.println("That student is not in the roster.");
			}
		}else {
			students.remove(commonNamedStudents[0]);
		}
		
	}
	
	public void printRoster() {
		for(Student s: students) {
			System.out.println(s.getFirstName() + " " + s.getLastName());
		}
	}
	
	public void changeGradeBook(Scanner sc) {
		System.out.print("What is the first name of the student being graded? ");
		int foundMatch = 0;
		int stuIndex = 0;

		String firstName = sc.next();
		for(int i = 0; i < students.size(); i++) {
			if(students.get(i).getFirstName().equals(firstName)) {
				foundMatch++;
				stuIndex = i;
			}
		}
		if(foundMatch > 1) {
			boolean foundLast = false;
			System.out.print("What is the last name of the student? ");
			String lastName = sc.next();
			for(int i = 0; i < students.size(); i++) {
				if(students.get(i).getLastName().equals(lastName) && students.get(i).getFirstName().equals(firstName)) {
					foundLast = true;
					stuIndex = i;
				}
			}
			if(!foundLast) {
				System.out.println("That student is not in the roster.");
			}
		}
		if(foundMatch == 0) {
			System.out.println("That student is not in the roster.");
		}
		else {
			students.get(stuIndex).addGrade(sc);
		}
	}
	
	public void alphabeticalSelectionSort() {
		for(int i = 0; i < students.size(); i++) {
			int min = i;
			
			for(int j = min; j < students.size(); j++) {
				if(students.get(min).getLastName().compareToIgnoreCase(students.get(j).getLastName()) > 0) {
					min = j;
				}
			}
			
			Student temp = students.get(i);
			students.set(i, students.get(min));
			students.set(min, temp);
		}
	}
	
	public void gpaSelectionSort() {
		for(int i = 0; i < students.size(); i++) {
			int min = i;
			
			for(int j = min; j < students.size(); j++) {
				if(students.get(min).average < students.get(j).average) {
					min = j;
				}
			}
			
			Student temp = students.get(i);
			students.set(i, students.get(min));
			students.set(min, temp);
		}
	}
	
	public void sort(Scanner sc) {
		System.out.print("Would you like to sort by GPA or alphabetically? (G or A) ");
		String response = sc.next();
		if(response.toUpperCase().equals("G")) {
			gpaSelectionSort();
		}else if(response.toUpperCase().equals("A")) {
			alphabeticalSelectionSort();
		}else {
			System.out.println("That was not a valid response.");
			sort(sc);
		}
	}
}
