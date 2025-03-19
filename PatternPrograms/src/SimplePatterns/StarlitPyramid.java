package SimplePatterns;

public class StarlitPyramid {

	public static void main(String[] args) {
		
		 // Outer loop controls the number of rows (height of the pyramid)
        for (int i = 1; i <= 5; i++) {
            
            // Inner loop prints leading spaces for alignment
            for (int j = 2; j <= 5 - i + 1; j++) {  
                System.out.print(" ");
            }
            
            // Inner loop prints stars to form the pyramid shape
            for (int j = 1; j <= 2 * i - 1; j++) {  
                System.out.print("*");
            }
            
            // Move to the next line after printing each row
            System.out.println();
        }

	}

}
