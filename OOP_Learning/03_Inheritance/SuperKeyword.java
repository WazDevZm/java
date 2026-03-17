// Demonstrates the super keyword accessing a parent class field
// that is shadowed by a field with the same name in the child class.
class Animal {
    String color = "white";
}

class Dog extends Animal {
    String color = "black";

    void printColor() {
        System.out.println(color);       // Dog's color
        System.out.println(super.color); // Animal's color via super
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();
    }
}
