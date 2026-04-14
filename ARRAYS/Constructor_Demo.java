package ARRAYS;

/**
 * Constructor_Demo — Demonstrates constructor chaining in inheritance.
 * 
 * CONCEPTS:
 * • Constructors are called when an object is created
 * • When a child class instantiates, its constructor runs
 * • Child constructors implicitly call the parent constructor first
 * • Constructor output shows the execution order
 * 
 * LEARNING: You learn that parent construction happens before child construction.
 */

// ========== PARENT CLASS ==========
// A basic parent class with a constructor
class SuperClass {
    /**
     * Constructor for SuperClass.
     * This prints when any SuperClass object (or subclass object) is created.
     */
    public SuperClass() {
        System.out.println("SuperClass Constructor executed");
    }
}

// ========== CHILD CLASS ==========
// A child class that extends SuperClass
class SubClass extends SuperClass {
    /**
     * Constructor for SubClass.
     * When this runs, SuperClass() is implicitly called first (constructor chaining).
     */
    public SubClass() {
        System.out.println("SubClass Constructor executed");
    }
}

// ========== MAIN METHOD ==========
public class Constructor_Demo {
    
    public static void main(String[] args) {
        
        // ========== SECTION 1: INSTANTIATION ==========
        // Create a SubClass object
        // Expected output:
        //   1. SuperClass Constructor executed (implicit parent call)
        //   2. SubClass Constructor executed (child constructor body)
        SubClass sub = new SubClass();
        
        // ========== SECTION 2: VERIFICATION ==========
        // The object 'sub' is now created and ready to use
        System.out.println("\nObject creation complete. SubClass instance exists.");
    }
}
