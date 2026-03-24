// ABSTRACTION: hide complex implementation details behind a simple interface.
// An abstract class cannot be instantiated — it defines the structure
// that all subclasses must follow by implementing abstract methods.

abstract class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    // Abstract method — no body here, subclasses MUST implement it
    abstract double area();

    // Concrete method — shared logic available to all subclasses
    void displayArea() {
        System.out.printf("%s %s area: %.2f%n", color, getClass().getSimpleName(), area());
    }
}

class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double width, height;

    Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    double area() {
        return width * height;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    double area() {
        return 0.5 * base * height;
    }
}

public class ShapeArea {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle("Red", 5),
            new Rectangle("Blue", 4, 6),
            new Triangle("Green", 3, 8)
        };

        for (Shape s : shapes) {
            s.displayArea();
        }
    }
}
// I am not feleling well today and that...