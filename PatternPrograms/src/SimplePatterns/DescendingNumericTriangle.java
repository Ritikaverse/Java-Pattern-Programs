package SimplePatterns;

public class DescendingNumericTriangle {

	public static void main(String[] args) {
		
		// Outer loop controls the number of rows (from 1 to 5)
        for (int i = 1; i <= 5; i++) {  
            
            // Inner loop prints numbers in decreasing order from 5
            for (int j = 5; j >= 6 - i; j--) {  
                System.out.print(j + " "); // Print the current value of j
            }
            
            System.out.println(); // Move to the next line after printing one row
        }
        
	}

}
