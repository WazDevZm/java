// STATIC MEMBERS: belong to the class itself, not to any individual instance.
// All objects share the same static field.
// Static methods can be called without creating an object.

public class StaticDemo {
    // Static field — shared across ALL instances
    static int instanceCount = 0;

    String name;

    StaticDemo(String name) {
        this.name = name;
        instanceCount++; // every new object increments the shared counter
    }

    // Static method — belongs to the class, not an instance
    static void showCount() {
        System.out.println("Total objects created: " + instanceCount);
    }

    // Static utility method — no object needed to call this
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        StaticDemo.showCount(); // 0 — no objects yet

        StaticDemo a = new StaticDemo("Alice");
        StaticDemo b = new StaticDemo("Bob");
        StaticDemo c = new StaticDemo("Carol");

        StaticDemo.showCount(); // 3

        // Static method called on the class, not an instance
        System.out.println("5 + 3 = " + StaticDemo.add(5, 3));
    }
}
