package SimplePatterns;

public class StarryPath {

	public static void main(String[] args) {
		
		// Use nested for loops to print the given pattern
        for (int i = 1; i <= 5; i++) {
            for (int j = 2; j <= 5-i+1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i==1 || j==1 || j==i || i==5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } 
            System.out.println();
        }
		
	}

}
