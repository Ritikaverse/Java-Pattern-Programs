package SimplePatterns;

public class DescendingAlphabetTriangle {

	public static void main(String[] args) {
		
		// Outer loop controls the number of rows (from 5 to 1)
		for (int i = 5; i >= 1; i--) {  
		    
		    // Inner loop prints 'A' characters in each row
		    for (int j = 1; j <= i; j++) {  
		        System.out.print("A"); // Print 'A' without moving to a new line
		    }
		    
		    System.out.println(); // Move to the next line after printing one row
		}

	}

}
