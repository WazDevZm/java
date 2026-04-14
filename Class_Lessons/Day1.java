/**
 * Day1 — Introduction to classes and objects in Java.
 * 
 * CONCEPTS:
 * • A class is a blueprint for creating objects
 * • An object is an instance of a class
 * • Fields store data for each object
 * • You access fields using the dot notation: object.fieldName
 * 
 * LEARNING: Understand the fundamental class-object relationship.
 */

// ========== SECTION 1: CLASS DEFINITION ==========
// Define a simple class with two fields
class People {
    // Fields: data that each object holds
    String name;    // Reference type (object)
    int age;        // Primitive type
}

// ========== SECTION 2: MAIN CLASS ==========
public class Day1 {
    
    public static void main(String[] args) {
        
        // ========== SECTION 3: OBJECT CREATION ==========
        // Create an instance (object) of the People class
        // 'wazingwa' is a reference variable pointing to a People object
        People wazingwa = new People();
        
        // ========== SECTION 4: FIELD ASSIGNMENT ==========
        // Access the object's field using dot notation and assign a value
        wazingwa.name = "Mugala";
        
        // You could also set age if needed:
        // wazingwa.age = 25;
        
        // ========== SECTION 5: FIELD ACCESS AND OUTPUT ==========
        // Retrieve the field value using dot notation
        System.out.println("Name: " + wazingwa.name);
        
        // ========== SUMMARY ==========
        // This demonstrates:
        // 1. Class definition (People blueprint)
        // 2. Object instantiation (creating wazingwa)
        // 3. Field assignment (setting wazingwa.name)
        // 4. Field access (reading wazingwa.name)
    }
}
