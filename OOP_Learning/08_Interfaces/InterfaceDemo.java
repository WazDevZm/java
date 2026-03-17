// INTERFACES: define a contract — a set of methods a class MUST implement.
// Key difference from abstract classes: a class can implement MULTIPLE interfaces,
// but can only extend ONE class. Interfaces enable flexible, modular design.

interface Drawable {
    void draw(); // implicitly public and abstract
}

interface Resizable {
    void resize(double factor);
}

// A class can implement multiple interfaces at once
class Square implements Drawable, Resizable {
    double side;

    Square(double side) {
        this.side = side;
    }

    public void draw() {
        System.out.println("Drawing a square with side: " + side);
    }

    public void resize(double factor) {
        side *= factor;
        System.out.println("Square resized. New side: " + side);
    }
}

class Circle implements Drawable {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing a circle with radius: " + radius);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Square sq = new Square(5);
        sq.draw();
        sq.resize(2);
        sq.draw();

        System.out.println();

        Circle c = new Circle(3);
        c.draw();
    }
}
