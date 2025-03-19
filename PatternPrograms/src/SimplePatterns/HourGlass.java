package SimplePatterns;

public class HourGlass {

	public static void main(String[] args) {
		
		// outer loop for upper diamond pattern in 5 rows from top
        for (int i = 5; i >= 1; i--) {
            // inner loop for printing spaces; space start from 2nd row; j=2
            for (int j = 2; j <= 5-i+1; j++) {
                System.out.print(" ");
            }
            // inner loop for printing stars; 2 * current row number - 1 (i=5)
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            } 
            // throws cursor to next line
            System.out.println();
        }

        // outer loop for lower diamond pattern in 4 rows from top; i=2 not i=1
        for (int i = 2; i <= 5; i++) {
            //innner loop to print spaces; 5 - current row no. + 1; j=2 since in upper part also
            for (int j = 2; j <= 5-i+1; j++) {
                System.out.print(" ");
            }
            //inner loop for stars; 2 * current row number + 1
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            } 
            // throws cursor to next line
            System.out.println();
        }       

	}

}
