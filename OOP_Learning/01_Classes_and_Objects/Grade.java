import java.util.Scanner;

/**
 * Grade — Demonstrates input validation and conditional logic using if-else chains.
 * 
 * CONCEPTS:
 * • Scanner for user input from console
 * • Input validation using hasNextInt() to check type
 * • if-else chain for multiple conditions (range-based)
 * • Early exit using return statement
 * • Resource cleanup with scanner.close()
 * 
 * LEARNING: Build robust programs that handle invalid user input gracefully.
 */
public class Grade {
    
    public static void main(String[] args) {
        
        // ========== SECTION 1: USER PROMPT ==========
        // Display instruction to the user
        System.out.print("Enter your marks (0-100): ");
        
        // ========== SECTION 2: SCANNER INITIALIZATION ==========
        // Create Scanner to read from standard input (keyboard)
        Scanner scanner = new Scanner(System.in);
        
        // ========== SECTION 3: INPUT VALIDATION ==========
        // Declare variable to hold marks
        int marks;
        
        // Check if the next input is a valid integer
        if (scanner.hasNextInt()) {
            // If valid, read the integer
            marks = scanner.nextInt();
        } else {
            // If invalid (not an integer), show error and exit
            System.out.println("Invalid input. Please enter an integer value for marks.");
            scanner.close();
            return;  // Exit the main method early
        }
        
        // ========== SECTION 4: GRADE ASSIGNMENT (IF-ELSE CHAIN) ==========
        // Use if-else chain to map score ranges to letter grades
        // Each condition checks a specific range
        
        if (marks >= 86 && marks <= 100) {
            System.out.println("Your grade is A");
        } else if (marks >= 76 && marks <= 85) {
            System.out.println("Your grade is B");
        } else if (marks >= 66 && marks <= 75) {
            System.out.println("Your grade is C");
        } else if (marks >= 56 && marks <= 65) {
            System.out.println("Your grade is D");
        } else if (marks >= 0 && marks <= 55) {
            System.out.println("Your grade is F");
        } else {
            // If marks is outside 0-100 range
            System.out.println("Invalid marks entered. Please enter a value between 0 and 100.");
        }
        
        // ========== SECTION 5: RESOURCE CLEANUP ==========
        // Always close Scanner to prevent resource leaks
        scanner.close();
    }
}
