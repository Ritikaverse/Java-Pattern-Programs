package SimplePatterns;

public class SpacedStarPyramid {

	public static void main(String[] args) {
		
		// outer loop for printitng pattern
        for (int i = 1; i <= 5; i++) {
            // inner loop to print spaces;no. of spaces = 5 - current row no. - 1 
            for (int j = 2; j <= 5-i+1; j++ ) {
                System.out.print(" ");
            }
            // inner loop to print stars; no. of stars increases as per row  
            for (int j = 1; j <= i; j++) {
                // print star and concat with space
                System.out.print("*" + " ");
            } 
            // send cursor to next line
            System.out.println();
        }
        
	}

}
