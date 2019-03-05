import java.util.Scanner; // Scanner Importations

/*
 Assignment Name: Git and GitHub Extra Credit

 Instructor: Dr.Cheng Thao. 

 Written By: Mohamed Mohamed.

 Course: CSC 422 Software Engineering
 
 Written: 3/5/2019.

*/


   // Area of Rectangle class

   public class Rectangle {

	 
	// Main Method in java
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in); // Reads from keyboard
		
		// Finding the Length of Rectangle
		
		System.out.println("Please enter the length of the rectangle: ");
		
		// Obtains the double value for length
		
		  double length = input.nextDouble(); 
		
	      System.out.println("Please enter the width of the rectangle: ");
		
		// Obtains the double value for width
		  double width= input.nextDouble(); 
		  
		  // Formula for area of rectangle
		  double area = length * width;
		  
		  System.out.println("The area of rectangle:" + area); // Displays output of the formula
	}

}
