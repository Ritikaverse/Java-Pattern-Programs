package NumberManipulationsPrograms;

import java.util.Scanner;    // Import Scanner class for user input
 
public class NumberCheck {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input

		 System.out.print("Enter a number: ");
		 int number = scanner.nextInt(); // Read an integer input from the user

		 // Check if the number is positive, negative, or zero
		 if (number > 0) {
		       System.out.print(number + " is a positive number."); // If the number is greater than 0
		 } else if (number < 0) {
		       System.out.print(number + " is a negative number."); // If the number is less than 0
		 } else { 
		       System.out.print(number + " is zero."); // If the number is exactly 0
		 }
		       scanner.close(); // Close the scanner to prevent memory leaks
     }

}


