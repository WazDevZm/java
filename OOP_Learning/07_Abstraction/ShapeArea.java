/**
 * ShapeArea — Demonstrates abstract classes and polymorphic shape area calculation.
 * 
 * CONCEPTS:
 * • Abstract class: cannot be instantiated, serves as a blueprint
 * • Abstract method: declares required behavior without implementation
 * • Subclasses MUST implement abstract methods
 * • Concrete methods in abstract classes are inherited and reused
 * • Polymorphism: process different shapes the same way through common interface
 * 
 * LEARNING: Abstract classes define contracts that subclasses must fulfill.
 */

// ========== SECTION 1: ABSTRACT CLASS DEFINITION ==========
/**
 * Shape is an abstract class that defines the structure for all shapes.
 * Subclasses must provide area calculation; display is shared.
 */
abstract class Shape {
    // Field shared by all shapes
    String color;

    // ========== SECTION 2: ABSTRACT CONSTRUCTOR ==========
    /**
     * Constructor for Shape.
     * Called by subclass constructors via super().
     * @param color the color of the shape
     */
    Shape(String color) {
        this.color = color;
    }

    // ========== SECTION 3: ABSTRACT METHOD ==========
    /**
     * Abstract method: subclasses MUST implement this.
     * Each shape calculates area differently.
     * @return the area of this shape
     */
    abstract double area();

    // ========== SECTION 4: CONCRETE METHOD ==========
    /**
     * Concrete method: shared implementation for all shapes.
     * Uses the shape's color and area() method (which subclasses implement).
     * Note: getClass().getSimpleName() returns the subclass name (Circle, Rectangle, etc.)
     */
    void displayArea() {
        System.out.printf("%s %s area: %.2f%n", color, getClass().getSimpleName(), area());
    }
}

// ========== SECTION 5: CONCRETE CIRCLE CLASS ==========
/**
 * Circle extends Shape and implements abstract area() method.
 */
class Circle extends Shape {
    double radius;

    /**
     * Circle constructor.
     * @param color the color of the circle
     * @param radius the radius of the circle
     */
    Circle(String color, double radius) {
        super(color);  // Call parent constructor
        this.radius = radius;
    }

    /**
     * Implement area calculation for circle.
     * Formula: area = π * r²
     */
    double area() {
        return Math.PI * radius * radius;
    }
}

// ========== SECTION 6: CONCRETE RECTANGLE CLASS ==========
/**
 * Rectangle extends Shape and implements abstract area() method.
 */
class Rectangle extends Shape {
    double width, height;

    /**
     * Rectangle constructor.
     * @param color the color of the rectangle
     * @param width the width of the rectangle
     * @param height the height of the rectangle
     */
    Rectangle(String color, double width, double height) {
        super(color);  // Call parent constructor
        this.width = width;
        this.height = height;
    }

    /**
     * Implement area calculation for rectangle.
     * Formula: area = width * height
     */
    double area() {
        return width * height;
    }
}

// ========== SECTION 7: CONCRETE TRIANGLE CLASS ==========
/**
 * Triangle extends Shape and implements abstract area() method.
 */
class Triangle extends Shape {
    double base, height;

    /**
     * Triangle constructor.
     * @param color the color of the triangle
     * @param base the base of the triangle
     * @param height the height of the triangle
     */
    Triangle(String color, double base, double height) {
        super(color);  // Call parent constructor
        this.base = base;
        this.height = height;
    }

    /**
     * Implement area calculation for triangle.
     * Formula: area = 0.5 * base * height
     */
    double area() {
        return 0.5 * base * height;
    }
}

// ========== SECTION 8: MAIN DEMONSTRATION ==========
public class ShapeArea {
    
    public static void main(String[] args) {
        
        // ========== SECTION 9: CREATE SHAPE OBJECTS ==========
        // Array of Shape references pointing to different shape objects
        Shape[] shapes = {
            new Circle("Red", 5),
            new Rectangle("Blue", 4, 6),
            new Triangle("Green", 3, 8)
        };
        
        // ========== SECTION 10: POLYMORPHIC ITERATION ==========
        // For each shape, call displayArea() (inherited from Shape)
        // But area() is called from the specific subclass
        System.out.println("--- Shape Areas ---\n");
        for (Shape s : shapes) {
            // displayArea() is called from Shape (inherited by all shapes)
            // But area() calls the specific implementation in each subclass
            s.displayArea();
        }
        
        // Output:
        // Red Circle area: 78.50
        // Blue Rectangle area: 24.00
        // Green Triangle area: 12.00
        
        // ========== SECTION 11: KEY INSIGHTS ==========
        // 1. Shape cannot be instantiated: new Shape() would be illegal
        // 2. Subclasses implement area() as required by the abstract method
        // 3. displayArea() is inherited and reused (not overridden)
        // 4. Polymorphism allows one loop to handle all shape types
        // 5. Each shape's area() is called correctly at runtime
    }
}