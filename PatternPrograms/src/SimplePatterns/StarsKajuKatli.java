package SimplePatterns;

public class StarsKajuKatli {

	public static void main(String[] args) {
		
		// upper half part of pattern in 5 rows; outer loop
        for (int i = 1; i <= 5; i++) {
            // inner loop for spaces
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            // inner loop for stars; 1,3,5,7,9; 2 * current row no. - 1
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            } 
            // throws cursor to next line
            System.out.println();
        }

        // outer loop for lower half pattern; in 4 rows 
        for (int i = 4; i >= 1; i--) {
            // inner loop for spaces
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            } 
            // inner loop for stars; 7,5,3,1; 2 * current row no. - 1
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            } 
            // sends cursor to next line
            System.out.println();
        }        
		
	}

}
