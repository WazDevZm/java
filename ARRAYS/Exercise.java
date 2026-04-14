package ARRAYS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Exercise — User interaction with ArrayList: display fruits and add new ones.
 * 
 * CONCEPTS:
 * • Initialize ArrayList with List.of() factory method
 * • Prompt user for string input (not integer)
 * • Add new element to dynamic list
 * • Display updated list
 * 
 * LEARNING: This is a practical exercise combining ArrayList, user input, and output.
 */
public class Exercise {
    
    public static void main(String[] args) {
        
        // ========== SECTION 1: INITIALIZE FRUIT LIST ==========
        // Create ArrayList with initial fruits using List.of() factory method
        // List.of() is a convenient way to create an immutable list from values
        ArrayList<String> list = new ArrayList<>(
            List.of("Mango", "Orange", "Lemon", "Guava")
        );
        
        // ========== SECTION 2: DISPLAY INITIAL LIST ==========
        // Print current fruits in the list
        System.out.println("\n--- Current Fruits ---");
        System.out.println(list);
        
        // ========== SECTION 3: USER INPUT FOR NEW FRUIT ==========
        // Prompt user to enter a fruit name (STRING input, not integer)
        System.out.print("Please enter the name of your fruit: ");
        
        // Create Scanner to read from console
        Scanner input = new Scanner(System.in);
        
        // Read the next line of text (fruit name)
        // NOTE: nextLine() reads the entire line as a String
        // Use nextInt() only for integer input; nextLine() for text
        String newFruit = input.nextLine();
        
        // ========== SECTION 4: ADD NEW FRUIT TO LIST ==========
        // Add the new fruit to the ArrayList
        list.add(newFruit);
        
        // ========== SECTION 5: DISPLAY UPDATED LIST ==========
        // Print the updated list with the newly added fruit
        System.out.println("\n--- Updated Fruits List ---");
        System.out.println(list);
        
        // ========== SECTION 6: CLEANUP ==========
        // Close the Scanner to prevent resource leak
        input.close();
    }
}