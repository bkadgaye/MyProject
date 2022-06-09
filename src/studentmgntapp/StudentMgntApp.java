package studentmgntapp;

import java.util.Scanner;

public class StudentMgntApp {
public static void main (String [] args) { 
	
	
	
	// ask how many new  user we  want to add 
	
	System.out.println(" Enter number of new student to Enroll: ");
	Scanner in = new Scanner(System.in);
	int numOfStudents =in.nextInt();
	Student[] students = new Student [ numOfStudents];
	
	// create n number of new students  
	for ( int n=0; n<numOfStudents;n++) {
		students[n] = new Student();
		students[n].enroll();	
		students[n].paytuition();
		 System.out.println(students[n].toString());
	}
  }
}
