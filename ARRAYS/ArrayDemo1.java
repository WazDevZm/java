package ARRAYS;

import java.util.Scanner;

/**
 * ArrayDemo1 — Demonstrates reading multiple integers into a fixed-size array.
 * 
 * CONCEPTS:
 * • Fixed-size array declaration and initialization
 * • Index-based array access for assignment and retrieval
 * • Try-with-resources for automatic Scanner cleanup
 * • User input validation via nextInt()
 * • String concatenation for output
 * • printf() for formatted output
 * 
 * LEARNING: This teaches you how to fill an array from user input step-by-step.
 */
public class ArrayDemo1 {
    
    public static void main(String[] args) {
        
        // ========== SECTION 1: ARRAY INITIALIZATION ==========
        // Create a fixed-size integer array with 5 elements (indices 0-4)
        int[] myNumbers = new int[5];
        
        // ========== SECTION 2: USER INPUT WITH TRY-WITH-RESOURCES ==========
        // Try-with-resources automatically closes the Scanner when the try block exits
        try (Scanner input = new Scanner(System.in)) {
            
            // --- Read first three numbers with user prompts ---
            System.out.println("Enter the first number: ");
            myNumbers[0] = input.nextInt();
            
            System.out.println("Enter the second number: ");
            myNumbers[1] = input.nextInt();
            
            System.out.println("Enter the third number: ");
            myNumbers[2] = input.nextInt();
            
            // Intermediate print: show first three numbers entered
            System.out.println("The numbers you have entered are: " + 
                myNumbers[0] + ", " + myNumbers[1] + ", " + myNumbers[2]);
            
            // --- Read final two numbers ---
            System.out.println("Enter the fourth number: ");
            myNumbers[3] = input.nextInt();
            
            System.out.println("Enter the fifth number: ");
            myNumbers[4] = input.nextInt();
        }
        // Scanner is automatically closed here
        
        // ========== SECTION 3: FINAL OUTPUT ==========
        // Display all five numbers using printf for formatted output
        System.out.printf("The numbers you have entered are: %d, %d, %d, %d, %d%n",
            myNumbers[0], myNumbers[1], myNumbers[2], myNumbers[3], myNumbers[4]);
