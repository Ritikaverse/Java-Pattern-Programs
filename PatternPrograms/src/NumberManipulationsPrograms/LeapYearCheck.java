package NumberManipulationsPrograms;

import java.util.Scanner; // Import Scanner class for user input

public class LeapYearCheck {
    public static void main(String[] args) {
        // Use Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = scanner.nextInt(); // Read an integer input from the user

        // Check if the year is a leap year using the correct conditions
        String leapYear = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) 
                          ? year + " is a leap year." 
                          : year + " is not a leap year.";

        System.out.println(leapYear); // Print the result
        
        scanner.close(); // Close the scanner to prevent memory leaks
    }
}

