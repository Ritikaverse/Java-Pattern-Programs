package SimplePatterns;

public class HollowSquare {

	public static void main(String[] args) {

		// loop to print stars 5 times in a row
        for (int i = 1; i <= 5; i++) {
            System.out.print("*");
        }
        // moves cursor to next line
        System.out.println();
        // loop to print (stars and spaces) in 3 rows 
        for (int i = 1; i <= 3; i++) {
            System.out.print("*" + "   " + "*");
            // moves cursor to next line after each iteration 
            System.out.println();
        }
        // loop to print 5 stars in last row
        for (int i = 1; i <= 5; i++) {
            System.out.print("*");
        } 

	}

}
