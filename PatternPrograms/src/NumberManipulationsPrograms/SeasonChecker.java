package NumberManipulationsPrograms;

//Import the Scanner class to take user input
import java.util.Scanner;

public class SeasonChecker {
 public static void main(String[] args) {
     // Use Scanner to take user input
     Scanner scanner = new Scanner(System.in);
     
     System.out.print("Enter a month number (1-12): ");
     int month = scanner.nextInt(); // Read user input
     
     int check = checkMonth(month); // Call the method to check the season
     System.out.println("You entered month number: " + check);
     
     scanner.close();
 }     

 // Method to determine and print the season based on the month number
 static int checkMonth(int month) {
     switch (month) {
         // Winter months
         case 1: 
         case 2: 
         case 12: 
             System.out.println("The month number " + month + " corresponds to Winter.");
             break;
         
         // Spring months
         case 3: 
         case 4: 
         case 5: 
             System.out.println("The month number " + month + " corresponds to Spring.");
             break;
         
         // Summer months
         case 6: 
         case 7: 
         case 8: 
             System.out.println("The month number " + month + " corresponds to Summer.");
             break;
         
         // Fall months
         case 9: 
         case 10: 
         case 11: 
             System.out.println("The month number " + month + " corresponds to Fall.");
             break;
         
         // If the user enters a number outside the valid range (1-12)
         default: 
             System.out.println("The month number " + month + " is invalid.");
                       
     }
	return month;
     
   }
 
}
