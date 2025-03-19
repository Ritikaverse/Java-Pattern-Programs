package NumberManipulationsPrograms;

public class SumOfSquares {
    public static void main(String[] args) {
        System.out.print("The sum of the squares of the first 20 natural numbers is: ");
        
        int sum = 0;
        
        // Loop through the first 20 natural numbers (1 to 20)
        for (int i = 1; i <= 20; i++) {
            sum += i * i; // Adding the square of the number to sum
        }
        
        // Print the final sum
        System.out.println(sum + ".");
    }
}
