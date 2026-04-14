/**
 * ConstructorDemo — Demonstrates how constructors initialize object state.
 * 
 * CONCEPTS:
 * • Constructor is called automatically when an object is created (with 'new')
 * • Constructor name matches the class name
 * • Constructors initialize field values
 * • Constructor code runs before the object is returned to the caller
 * • Without a constructor, fields have default values (0 for int, null for objects)
 * 
 * LEARNING: Constructors set up the initial state of objects.
 */

// ========== SECTION 1: DEMO CLASS WITH CONSTRUCTOR ==========
// A simple class with one field and a constructor
class Demo {
    // Field to store integer value
    int x;

    // ========== SECTION 2: CONSTRUCTOR DEFINITION ==========
    // Constructor (matches class name, no return type)
    // This runs when 'new Demo()' is called
    Demo() {
        // Initialize field x to 10
        x = 10;
    }
}

// ========== SECTION 3: MAIN CLASS ==========
public class ConstructorDemo {
    
    public static void main(String[] args) {
        
        // ========== SECTION 4: OBJECT CREATION ==========
        // Create an instance of Demo
        // This automatically calls Demo() constructor
        // After creation, x is initialized to 10
        Demo t1 = new Demo();
        
        // ========== SECTION 5: VERIFICATION ==========
        // Print the initialized value
        System.out.println("Demo object created.");
        System.out.println("Value of x after construction: " + t1.x);
        // Output: 10
        
        // ========== SECTION 6: SUMMARY ==========
        // Without the constructor, x would default to 0
        // The constructor ensures x starts at a meaningful value (10)
    }
}
