/**
 * SuperKeyword — Demonstrates the 'super' keyword accessing parent class members.
 * 
 * CONCEPTS:
 * • Field shadowing: child declares a field with same name as parent
 * • 'super.fieldName' accesses the parent version when shadowed
 * • Without 'super', accessing the field name gets the child version
 * • Demonstrated with color field in both Animal and Dog
 * 
 * LEARNING: Understand how 'super' disambiguates shadowed member names.
 */

// ========== SECTION 1: PARENT CLASS ==========
// Animal parent class with a color field
class Animal {
    // Parent field: default color
    String color = "white";
}

// ========== SECTION 2: CHILD CLASS WITH SHADOWING ==========
// Dog child class redefines 'color' (shadows the parent field)
class Dog extends Animal {
    // Child field: shadows the parent's color field
    // This is NOT inheritance; it's a separate field with the same name
    String color = "black";

    // ========== SECTION 3: METHOD USING SUPER ==========
    void printColor() {
        // Without 'super': accesses Dog's color (child version)
        System.out.println("Dog's color: " + color);       // Output: black
        
        // With 'super': accesses Animal's color (parent version)
        System.out.println("Animal's color: " + super.color); // Output: white
    }
}

// ========== SECTION 4: MAIN DEMONSTRATION ==========
public class SuperKeyword {
    
    public static void main(String[] args) {
        
        // ========== SECTION 5: CREATE DOG OBJECT ==========
        Dog d = new Dog();
        
        // ========== SECTION 6: CALL METHOD WITH SUPER ==========
        d.printColor();
        // Output:
        //   Dog's color: black
        //   Animal's color: white
        
        // ========== SECTION 7: EXPLANATION ==========
        // Dog has two 'color' fields:
        // 1. Dog.color = "black" (defined in Dog class)
        // 2. Animal.color = "white" (inherited from Animal, but shadowed)
        //
        // 'super.color' specifically refers to the parent's field,
        // even though the child declares a field with the same name.
        // This is field shadowing, and 'super' is the way to access hidden parent fields.
    }
}
