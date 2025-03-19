package SimplePatterns;

public class DiamondOfStars {

	public static void main(String[] args) {
		
		// first outer loop for pattern where stars increment
        for (int i = 1; i <= 5; i++) {
            // inner loop; 4 spaces so j = 2; spaces no. = 5 - current row no. + 1
            for (int j = 2; j <= 5-i+1; j++) {
                // print spaces
                System.out.print(" ");
            }
            // inner loop; print * and space; stars no. increase as per row
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            // send cursor to next line
            } System.out.println();
        }
        // second outer loop for pattern where stars decrement in next 4 rows
        for (int i = 1; i <= 4; i++) {
            // inner loop; spaces no. increase as per the row
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            // inner loop; stars decrease in no.; 5-current row no.+1
            for (int j = 2; j <= 5-i+1; j++) {
                System.out.print("*" + " ");
            }
            // send cursor to next line
            System.out.println();
        }
        
	}

}
