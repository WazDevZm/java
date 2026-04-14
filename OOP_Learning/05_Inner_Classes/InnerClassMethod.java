/**
 * InnerClassMethod — Demonstrates methods defined in inner classes.
 * 
 * CONCEPTS:
 * • Inner class can define methods
 * • Inner class methods can access outer class fields
 * • Inner class methods return values computed from outer state
 * • Useful pattern: inner class provides encapsulated behavior
 * 
 * LEARNING: Inner classes can provide specialized methods with outer class access.
 */

// ========== SECTION 1: OUTER CLASS ==========
class Outer {
    // Outer class field
    int x = 10;

    // ========== SECTION 2: INNER CLASS WITH METHOD ==========
    // Inner class defines a method that accesses outer field x
    public class Inner {
        /**
         * Method defined in inner class.
         * This method can access all members of the outer class.
         * @return the value of outer class field x
         */
        public int myMethod() {
            // Inner class method accessing outer class field
            return x;  // Returns the value of outer.x
        }
    }
}

// ========== SECTION 3: MAIN CLASS ==========
public class InnerClassMethod {
    
    public static void main(String[] args) {
        
        // ========== SECTION 4: CREATE OUTER INSTANCE ==========
        Outer myOuter = new Outer();
        
        // ========== SECTION 5: CREATE INNER INSTANCE ==========
        // Inner class must be instantiated relative to an outer instance
        Outer.Inner myInner = myOuter.new Inner();
        
        // ========== SECTION 6: CALL INNER METHOD ==========
        // Call the inner class method
        int result = myInner.myMethod();
        System.out.println("Result from inner method: " + result);
        // Output: 10
        
        // ========== SECTION 7: KEY INSIGHT ==========
        // The inner method has implicit access to the outer instance,
        // so it can return outer.x without explicitly passing it.
        // This is powerful for creating helper methods that naturally
        // work with the containing class's state.
    }
}
