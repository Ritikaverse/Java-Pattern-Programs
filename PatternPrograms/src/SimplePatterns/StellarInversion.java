package SimplePatterns;

public class StellarInversion {

	public static void main(String[] args) {
		
		// Outer loop controls the number of rows (starting from 5 down to 1)
        for (int i = 5; i >= 1; i--) {  
            
            // Inner loop prints stars and spaces in a specific pattern
            for (int j = 1; j <= 2 * i - 1; j++) {  
                if (j % 2 != 0) {  
                    System.out.print("*"); // Print star at odd positions
                } else {
                    System.out.print(" "); // Print space at even positions
                }
            }    
            
            System.out.println(); // Move to the next line after printing a row
            
            // Inner loop prints leading spaces for alignment
            for (int j = 5; j >= i; j--) {  
                System.out.print(" "); // Add spaces to shift the next row
            }
            
        }
		
	}

}
