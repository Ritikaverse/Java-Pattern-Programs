package NumberManipulationsPrograms;

import java.util.Scanner;

public class CharacterChecker {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single character: ");
        
        // Take input as a string to allow checking length
        String input = scanner.next();
        
        // Get the first character from input
        char ch = input.charAt(0);

        // Check for vowels (both uppercase & lowercase)
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel.");
        }
        // Check for consonants
        else if (Character.isLetter(ch)) {
            System.out.println(ch + " is a consonant.");
        }
        // Check for digits
        else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit.");
        }
        // If it's not a letter or digit, it's a special character
        else {
            System.out.println(ch + " is a special character.");
        }

        // Close the scanner
        scanner.close();
    }
}

