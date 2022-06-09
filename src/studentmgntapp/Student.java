package studentmgntapp;

import java.util.Scanner;

public class Student {  
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String  studentId;
	private String courses= null;
	private int tuitionbalence;
	private int costOfCourse = 600;
	private static int id = 1000;
	
	
	//  constructor : prompt user to enter a students name and year 
	public Student() {
		 Scanner in = new Scanner(System.in);
		 System.out.print("Enter a student first name");
		 this.firstName = in.nextLine();
		 
		 System.out.print("Enter a student last name");
		 this.lastName = in.nextLine();
		 
		 System.out.print("1- freshman \n2 - sophmore \n3 - junior \n4 - senior \nEnter a student class level");
		 this.gradeYear =  in.nextInt();
		 
		 setStudentId();
	     
	}

	// Generate an ID 
	private void setStudentId() {
		// Grade level + Id
	id++;
	 this.studentId = gradeYear + " "+ id; 
		
	}
	// enroll in courses 
	      public void enroll() { 
		// Get inside a loop user hits 
	    	  
	    do { 	  
		      System.out.println(" enter a course to enroll (0 to quite):");
		      Scanner in = new Scanner(System.in);
		      String course = in.nextLine();
		   if ( !course.equals("Q")) { 
			  courses = courses  + "\n "+ course;
			  tuitionbalence = tuitionbalence + costOfCourse; 
		}
		   else { 
			    System.out.println("BREAK!");
		   }
		   break;
		 
	  }  while(1 !=0); 	   
		
	
	}
	
	// View a balence  
	public void viewBalence() {
		System.out.println( " your balence is: $" + tuitionbalence);
	}
	// pay tuition  
	public void paytuition() { 
		 viewBalence();
		 System.out.print("Enter your payment: $");
		 Scanner in = new Scanner(System.in);
		 int payment = in.nextInt();
		tuitionbalence= tuitionbalence - payment ;
		System.out.println(" thank you for your payment of $ " + payment);
		viewBalence();
	}
	// show status 
//	         // String toString() {
//		      return "Name: " +  firstName + " " + lastName + 
//		    		  "\nGrade level: " + gradeYear
//		    		  "\nstudent Id:" + studentId
//		    		  "\nCourses Enrolled" + courses + 
//		    		  "\nBalence: $" + tuitionbalence;
//	}

}
