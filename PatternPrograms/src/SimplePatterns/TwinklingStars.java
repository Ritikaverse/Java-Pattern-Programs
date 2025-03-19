package SimplePatterns;

public class TwinklingStars {

	public static void main(String[] args) {
		
        for (int i = 1; i <= 4; i++) {
            if (i == 1 || i == 3) {
                System.out.println("*");
            } else {
                System.out.println("**");
            }
        }
		
	}

}
