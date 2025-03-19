package SimplePatterns;

public class HollowDiamond {

	public static void main(String[] args) {
		
		// Upper part of the hollow diamond
        for (int i = 1; i <= 5; i++) {
        	// Printing leading spaces
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
         // Printing stars and spaces to form the hollow structure
            for (int j = 1; j <= 2 * i -1; j++) {
                if (j == 1 || j == 2 * i -1) {
                    System.out.print("*");   // Print '*' at the start and end
                } else {
                    System.out.print(" ");   // Print space in between
                }
            } System.out.println();    // Throw cursor to the next line
        }

     // Lower part of the hollow diamond
        for (int i = 4; i >= 1; i--) {
        	// Printing leading spaces
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
         // Printing stars and spaces to form the hollow structure
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");  // Print '*' at the start and end
                } else {
                    System.out.print(" ");  // Print space in between
                }
            } System.out.println();  // Throw cursor to the next line
        }

	}

}
