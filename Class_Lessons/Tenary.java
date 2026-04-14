/**
 * Tenary — Demonstrates the ternary operator for conditional value assignment.
 * 
 * CONCEPTS:
 * • Ternary operator: (condition) ? valueIfTrue : valueIfFalse
 * • Returns a value (unlike if/else which runs code blocks)
 * • Compact alternative to if/else for simple decisions
 * • Type of both branches must match the variable type
 * 
 * LEARNING: Use ternary operator to make concise conditional assignments.
 */
public class Tenary {
    
    public static void main(String[] args) {
        
        // ========== SECTION 1: SETUP ==========
        // Define a time value (hour on 24-hour clock)
        int time = 20;  // 8 PM
        
        // ========== SECTION 2: TERNARY OPERATOR ==========
        // Syntax: (condition) ? valueIfTrue : valueIfFalse
        // This assigns "Good day." if time < 18, otherwise "Good evening."
        String result = (time < 18) ? "Good day." : "Good evening.";
        
        // ========== SECTION 3: OUTPUT ==========
        // Since time=20 and 20 < 18 is false, result will be "Good evening."
        System.out.println(result);
        
        // ========== SECTION 4: EQUIVALENT IF-ELSE ==========
        // The above ternary operator is equivalent to:
        // if (time < 18) {
        //     result = "Good day.";
        // } else {
        //     result = "Good evening.";
        // }
        // The ternary operator is more concise when assigning a value.
        
        // ========== SECTION 5: MORE EXAMPLES ==========
        System.out.println("\n--- Additional Examples ---");
        
        // Example 1: Age check
        int age = 25;
        String ageCategory = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Age " + age + ": " + ageCategory);
        
        // Example 2: Number check
        int num = 12;
        String evenOdd = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number " + num + ": " + evenOdd);
    }
}