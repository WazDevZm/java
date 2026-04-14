/**
 * StaticDemo — Demonstrates static fields and methods.
 * 
 * CONCEPTS:
 * • Static field: shared by ALL instances of a class (not per-object)
 * • Static method: belongs to the class, not to any instance
 * • Static methods can be called without creating an object (e.g., Math.max())
 * • Static field increments track total object creation
 * • Accessed via ClassName.staticMember (not objectName.staticMember)
 * 
 * LEARNING: Static members represent class-level data and behavior.
 */
public class StaticDemo {
    
    // ========== SECTION 1: STATIC FIELD ==========
    /**
     * Static field: shared by all instances of StaticDemo.
     * When a new object is created, this counter increments.
     * All objects share the same counter value.
     */
    static int instanceCount = 0;
    
    // ========== SECTION 2: INSTANCE FIELD ==========
    /**
     * Instance field: each object has its own copy.
     * Different from static; every StaticDemo object has its own name.
     */
    String name;

    // ========== SECTION 3: CONSTRUCTOR ==========
    /**
     * Constructor: initializes instance field and increments static counter.
     * @param name the name to assign to this instance
     */
    StaticDemo(String name) {
        this.name = name;
        instanceCount++;  // Increment shared static field
    }

    // ========== SECTION 4: STATIC METHOD ==========
    /**
     * Static method: called on the CLASS, not on an instance.
     * Can only access static fields and other static methods.
     * Displays the total number of objects created.
     */
    static void showCount() {
        // Static methods have access only to static members
        System.out.println("Total objects created: " + instanceCount);
    }

    // ========== SECTION 5: STATIC UTILITY METHOD ==========
    /**
     * Static utility method: performs a calculation.
     * Useful for operations that don't need object state.
     * @param a first number
     * @param b second number
     * @return the sum of a and b
     */
    static int add(int a, int b) {
        return a + b;
    }

    // ========== SECTION 6: MAIN DEMONSTRATION ==========
    public static void main(String[] args) {
        
        // ========== SECTION 7: CHECK COUNT BEFORE CREATION ==========
        // Call static method on CLASS (not on an instance)
        System.out.println("--- Before creating objects ---");
        StaticDemo.showCount();  // 0 objects created yet
        // Output: Total objects created: 0
        
        // ========== SECTION 8: CREATE OBJECTS ==========
        System.out.println("\n--- Creating objects ---");
        // Each 'new' calls the constructor, which increments instanceCount
        StaticDemo a = new StaticDemo("Alice");
        System.out.println("Created: " + a.name);
        
        StaticDemo b = new StaticDemo("Bob");
        System.out.println("Created: " + b.name);
        
        StaticDemo c = new StaticDemo("Carol");
        System.out.println("Created: " + c.name);
        
        // ========== SECTION 9: CHECK COUNT AFTER CREATION ==========
        System.out.println("\n--- After creating objects ---");
        StaticDemo.showCount();  // 3 objects created
        // Output: Total objects created: 3
        
        // ========== SECTION 10: CALL STATIC UTILITY METHOD ==========
        System.out.println("\n--- Static utility method ---");
        // Call static method directly on class
        int result = StaticDemo.add(5, 3);
        System.out.println("5 + 3 = " + result);
        // Output: 5 + 3 = 8
        
        // ========== SECTION 11: KEY INSIGHTS ==========
        // 1. instanceCount is the SAME for all objects
        //    If we checked a.instanceCount, b.instanceCount, c.instanceCount,
        //    they'd all be 3 (they share the same static field)
        // 2. Each object (a, b, c) has its own 'name' field
        //    a.name = "Alice", b.name = "Bob", c.name = "Carol"
        // 3. Static methods are called on the class: StaticDemo.add()
        // 4. Static methods cannot access instance fields like 'name'
        //    Only static members are accessible in static methods
    }
}
