package NumberManipulationsPrograms;

import java.util.Scanner;

public class firstNEvenNos {
    public static void main(String[] args) {
        // Use Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Print the first n even numbers
        System.out.println("The first " + n + " even numbers are:");
        for (int i = 1; i <= n; i++) {
             System.out.println(i*2);
        }
    
        scanner.close();
    }
    
}