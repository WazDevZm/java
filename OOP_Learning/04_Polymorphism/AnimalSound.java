/**
 * AnimalSound — Demonstrates runtime polymorphism (method overriding).
 * 
 * CONCEPTS:
 * • Polymorphism: "many forms" — same method name, different behaviors
 * • Method overriding: child class redefines parent method with same signature
 * • Runtime polymorphism: which method runs is determined by the ACTUAL object type
 * • Parent reference can point to child object
 * • Calling overridden method on parent reference executes child version
 * 
 * LEARNING: Polymorphism enables flexible, reusable code design.
 */

// ========== SECTION 1: PARENT CLASS ==========
// Animal parent class with default sound() method
class Animal {
    // Parent method: defines generic animal sound behavior
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// ========== SECTION 2: CHILD CLASS ==========
// Dog child class overrides sound() with specific behavior
class Dog extends Animal {
    // Child method: overrides parent's sound() method
    @Override  // Optional annotation, indicates intentional override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// ========== SECTION 3: MAIN CLASS ==========
public class AnimalSound {
    
    public static void main(String[] args) {
        
        // ========== SECTION 4: OBJECT CREATION ==========
        // Method 1: Create Animal object with Animal reference
        Animal myAnimal = new Animal();
        
        // Method 2: Create Dog object BUT store it as Animal reference
        // This is polymorphism in action:
        // - Reference type is Animal (parent)
        // - Actual object type is Dog (child)
        Animal myDog = new Dog();
        
        // ========== SECTION 5: METHOD CALLS ==========
        System.out.println("--- Calling sound() ---\n");
        
        // Call 1: Animal reference, Animal object
        // Executes: Animal.sound()
        System.out.print("myAnimal.sound(): ");
        myAnimal.sound();
        // Output: Animal makes a sound
        
        // Call 2: Animal reference, Dog object
        // IMPORTANT: Which method runs is determined by ACTUAL object type (Dog)
        // Executes: Dog.sound() not Animal.sound()
        System.out.print("myDog.sound(): ");
        myDog.sound();
        // Output: Dog barks
        
        // ========== SECTION 6: KEY INSIGHT ==========
        // Even though myDog is declared as Animal type,
        // the actual object is Dog, so Dog.sound() is called.
        // This is RUNTIME polymorphism — the runtime system checks
        // what the object actually is, not what the reference type says.
        
        // ========== SECTION 7: BENEFITS ==========
        // You can write methods that accept Animal references,
        // but the specific behavior depends on the actual object:
        // Example:
        // void makeAnimalSound(Animal a) {
        //     a.sound();  // Calls the right method based on actual object
        // }
        // makeAnimalSound(new Animal()); // Outputs: Animal makes a sound
        // makeAnimalSound(new Dog());    // Outputs: Dog barks
    }
}
