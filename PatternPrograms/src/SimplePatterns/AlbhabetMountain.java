package SimplePatterns;

public class AlbhabetMountain {

	public static void main(String[] args) {
		
		
		   int alphabet = 65; // ASCII value of 'A'

		   // Upper half of the pattern
		   for (int i = 1; i <= 4; i++) {  // Controls the rows
		       for (int j = 1; j <= i; j++) {  // Prints the same alphabet in the row
		            System.out.print((char) (alphabet)); // Convert ASCII to character and print
		       }
		       
		        alphabet++; // Move to the next alphabet (B, C, D...)
		        System.out.println(); // Move to the next line
		        
		       }

		        // Adjust alphabet value for lower half
		        alphabet--; // Move back one step (D)
		        alphabet--; // Move back one more step (C)

		        // Lower half of the pattern
		    for (int i = 1; i <= 3; i++) {  // Controls the rows
		        for (int j = 3; j >= i; j--) {  // Prints the same alphabet decreasingly
		            System.out.print((char) (alphabet)); // Print current alphabet
		        } 
		         
		        alphabet--; // Move to the previous alphabet (B, A...)
		        System.out.println(); // Move to the next line
		        
		 }
		        
	}
	
}


