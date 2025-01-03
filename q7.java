// package SIR.java;
import java.util.Scanner;
public class q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int number = scanner.nextInt();
        
        // Ensure the number is a three-digit number
        if (number >= 100 && number <= 999) {
            // Extract the middle digit
            int middleDigit = (number / 10) % 10;
            
            // Calculate the square of the middle digit
            int square = middleDigit * middleDigit;
            
            // Print the result
            System.out.println("The square of the middle digit is: " + square);
        } else {
            System.out.println("Please enter a valid three-digit number.");
        }
        scanner.close();   
    }
}
    
