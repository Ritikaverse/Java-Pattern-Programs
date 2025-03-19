package SimplePatterns;

public class StarryAlternations {

	public static void main(String[] args) {
		
		 // Outer loop controls the number of rows (total 6 rows)
        for (int i = 1; i <= 6; i++) {  
            
            // Inner loop controls the number of columns (prints 6 stars in each row)
            for (int j = 1; j <= 6; j++) {  
                System.out.print("* "); // Print star followed by a space
            }
            
            System.out.println(); // Move to the next line after printing one row
            System.out.println(); // Extra line for spacing between rows
        }
		
	}

}
