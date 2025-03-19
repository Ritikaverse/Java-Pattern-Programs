package SimplePatterns;

public class AscendingAlphabetTriangle {

	public static void main(String[] args) {
		
		// Outer loop controls the number of rows (from 1 to 5)
		for (int i = 1; i <= 5; i++) {  
		    
		    // Inner loop prints 'A' characters in each row
		    for (int j = 1; j <= i; j++) {  
		        System.out.print("A"); // Print 'A' without a new line
		    }
		    
		    System.out.println(); // Move to the next line after printing one row
		}

	}

}
