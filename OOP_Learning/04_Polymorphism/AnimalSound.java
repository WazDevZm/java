// Polymorphism: a Dog object is treated as an Animal.
// The overridden sound() method in Dog is called at runtime (method overriding).
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

class AnimalSound {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog(); // Dog object stored as Animal type

        myAnimal.sound(); // calls Animal.sound()
        myDog.sound();    // calls Dog.sound() — runtime polymorphism
    }
}
