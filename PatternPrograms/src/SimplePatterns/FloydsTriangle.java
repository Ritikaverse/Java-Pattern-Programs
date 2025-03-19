package SimplePatterns;

public class FloydsTriangle {

	public static void main(String[] args) {
		
		int number = 1; // Starting number

        // Outer loop controls the rows
        for (int i = 1; i <= 4; i++) {  
            
            // Inner loop prints numbers in each row
            for (int j = 1; j <= i; j++) {  
                System.out.print(number + " "); // Print the current number with a space
                number++; // Increment the number for the next position
            }
            
            System.out.println(); // Move to the next line after each row
        }
		
	}

}
