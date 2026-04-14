/**
 * InterfaceDemo — Demonstrates interfaces and multiple interface implementation.
 * 
 * CONCEPTS:
 * • Interface: defines a contract (set of methods) classes must implement
 * • A class can implement MULTIPLE interfaces (but extend only ONE class)
 * • All interface methods are implicitly public and abstract
 * • Interfaces enable flexible, loosely-coupled design
 * • Enables polymorphism without inheritance hierarchy
 * 
 * LEARNING: Interfaces are powerful for defining reusable contracts.
 */

// ========== SECTION 1: INTERFACE DEFINITIONS ==========
/**
 * Drawable interface: contract for drawable objects.
 * Any class implementing this must provide draw() method.
 */
interface Drawable {
    // Methods in an interface are implicitly public and abstract
    // No implementation provided; subclasses must implement
    void draw();
}

/**
 * Resizable interface: contract for resizable objects.
 * Any class implementing this must provide resize() method.
 */
interface Resizable {
    /**
     * Resize the object by a scaling factor.
     * @param factor the scaling factor (e.g., 2.0 = double the size)
     */
    void resize(double factor);
}

// ========== SECTION 2: CLASS IMPLEMENTING MULTIPLE INTERFACES ==========
/**
 * Square implements both Drawable and Resizable.
 * Notice the 'implements' keyword followed by comma-separated interface names.
 */
class Square implements Drawable, Resizable {
    double side;

    /**
     * Square constructor.
     * @param side the length of the square's side
     */
    Square(double side) {
        this.side = side;
    }

    // ========== SECTION 3: IMPLEMENT DRAWABLE INTERFACE ==========
    /**
     * Draw the square.
     * This is required by the Drawable interface.
     */
    @Override
    public void draw() {
        System.out.println("Drawing a square with side: " + side);
    }

    // ========== SECTION 4: IMPLEMENT RESIZABLE INTERFACE ==========
    /**
     * Resize the square by a scaling factor.
     * This is required by the Resizable interface.
     * @param factor the scaling factor
     */
    @Override
    public void resize(double factor) {
        side *= factor;
        System.out.println("Square resized. New side: " + side);
    }
}

// ========== SECTION 5: CLASS IMPLEMENTING ONE INTERFACE ==========
/**
 * Circle implements only Drawable interface.
 * It does not need to implement Resizable.
 */
class Circle implements Drawable {
    double radius;

    /**
     * Circle constructor.
     * @param radius the radius of the circle
     */
    Circle(double radius) {
        this.radius = radius;
    }

    // ========== SECTION 6: IMPLEMENT DRAWABLE INTERFACE ==========
    /**
     * Draw the circle.
     * This is required by the Drawable interface.
     */
    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius: " + radius);
    }
}

// ========== SECTION 7: MAIN DEMONSTRATION ==========
public class InterfaceDemo {
    
    public static void main(String[] args) {
        
        // ========== SECTION 8: SQUARE TEST (MULTIPLE INTERFACES) ==========
        System.out.println("--- Square (Drawable + Resizable) ---\n");
        Square sq = new Square(5);
        
        // Call Drawable interface method
        sq.draw();
        // Output: Drawing a square with side: 5
        
        // Call Resizable interface method
        sq.resize(2);
        // Output: Square resized. New side: 10
        
        // Draw again to show new size
        sq.draw();
        // Output: Drawing a square with side: 10
        
        System.out.println();
        
        // ========== SECTION 9: CIRCLE TEST (SINGLE INTERFACE) ==========
        System.out.println("--- Circle (Drawable only) ---\n");
        Circle c = new Circle(3);
        
        // Call Drawable interface method
        c.draw();
        // Output: Drawing a circle with radius: 3
        
        // Circle does not have resize() because it doesn't implement Resizable
        // c.resize(2);  // ERROR: Circle doesn't have this method
        
        // ========== SECTION 10: KEY INSIGHTS ==========
        // 1. Square implements BOTH interfaces (Drawable and Resizable)
        // 2. Circle implements only Drawable
        // 3. Multiple interface implementation enables flexible design
        // 4. Unlike classes (can extend only one), a class can implement many interfaces
        // 5. Interfaces define a contract: if you claim to implement Drawable,
        //    you MUST provide a draw() method
    }
}
