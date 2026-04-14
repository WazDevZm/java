/**
 * InnerClassDemo — Demonstrates member (non-static) inner classes.
 * 
 * CONCEPTS:
 * • Inner class: a class defined inside another class
 * • Member inner class: can access outer class fields
 * • Instantiation: requires an outer instance first
 * • Syntax: OuterClass.InnerClass variableName = outerInstance.new InnerClass()
 * • Inner class can access all members of outer class (even private ones)
 * 
 * LEARNING: Inner classes are useful for grouping related functionality.
 */

// ========== SECTION 1: OUTER CLASS ==========
class OuterClass {
    // Outer class field
    int x = 10;

    // ========== SECTION 2: INNER CLASS ==========
    // Define a member inner class inside OuterClass
    // This inner class can access outer class's x field
    class InnerClass {
        // Inner class field
        int y = 5;
    }
}

// ========== SECTION 3: MAIN CLASS ==========
public class InnerClassDemo {
    
    public static void main(String[] args) {
        
        // ========== SECTION 4: CREATE OUTER INSTANCE ==========
        // First, create an instance of the outer class
        OuterClass outer = new OuterClass();
        
        // ========== SECTION 5: CREATE INNER INSTANCE ==========
        // Inner class requires outer instance to exist
        // Syntax: outerInstance.new InnerClass()
        // This creates an inner object tied to the specific outer object
        OuterClass.InnerClass inner = outer.new InnerClass();
        
        // ========== SECTION 6: ACCESS OUTER FIELD ==========
        // Access field from the outer class
        System.out.println("Outer class field x: " + outer.x);
        // Output: 10
        
        // ========== SECTION 7: ACCESS INNER FIELD ==========
        // Access field from the inner class
        System.out.println("Inner class field y: " + inner.y);
        // Output: 5
        
        // ========== SECTION 8: KEY INSIGHT ==========
        // Inner class has implicit reference to its outer instance.
        // If InnerClass had a method, it could access outer.x directly.
        // This is useful for callbacks, listeners, and related helper classes.
    }
}
