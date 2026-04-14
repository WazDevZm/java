/**
 * AccessDemo — Demonstrates Java access modifiers (public, protected, private).
 * 
 * CONCEPTS:
 * • public: accessible from anywhere
 * • protected: accessible in same package and in subclasses
 * • private: accessible ONLY within the same class
 * • default (no keyword): accessible only in same package
 * • Getters/setters control access to private fields
 * • Setters can enforce validation
 * 
 * LEARNING: Access modifiers enforce encapsulation and data protection.
 */

// ========== SECTION 1: PARENT CLASS WITH DIFFERENT ACCESS LEVELS ==========
/**
 * Person class demonstrates all access modifier levels.
 */
class Person {
    // ========== SECTION 2: PUBLIC FIELD ==========
    // Anyone can read/write this field directly
    public String name;        // Accessible from anywhere
    
    // ========== SECTION 3: PROTECTED FIELD ==========
    // Accessible in same package AND in subclasses (even different packages)
    protected String email;    // Accessible in subclasses
    
    // ========== SECTION 4: PRIVATE FIELD ==========
    // ONLY this class's methods can directly access this
    private int age;           // Hidden from outside code

    // ========== SECTION 5: CONSTRUCTOR ==========
    /**
     * Initialize a Person with all three fields.
     * @param name person's name
     * @param age person's age
     * @param email person's email
     */
    Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // ========== SECTION 6: PUBLIC GETTER FOR PRIVATE FIELD ==========
    /**
     * Getter for private 'age' field.
     * Provides read-only access to private data.
     * @return the person's age
     */
    public int getAge() {
        return age;
    }

    // ========== SECTION 7: PUBLIC SETTER WITH VALIDATION ==========
    /**
     * Setter for private 'age' field.
     * Validates that age is in a reasonable range.
     * Prevents direct manipulation of sensitive data.
     * @param age the age to set
     */
    public void setAge(int age) {
        // Validation: age must be between 0 and 130
        if (age > 0 && age < 130) {
            this.age = age;
        } else {
            System.out.println("Invalid age: " + age);
        }
    }
}

// ========== SECTION 8: SUBCLASS DEMONSTRATING ACCESS RULES ==========
/**
 * Employee extends Person and demonstrates access modifier rules in inheritance.
 */
class Employee extends Person {
    String department;

    /**
     * Employee constructor.
     * @param name person's name
     * @param age person's age
     * @param email person's email
     * @param department employee's department
     */
    Employee(String name, int age, String email, String department) {
        super(name, age, email);  // Call parent constructor
        this.department = department;
    }

    /**
     * Display all employee information.
     * Demonstrates what access is allowed in subclasses.
     */
    void display() {
        System.out.println("Name:       " + name);          // public — OK
        System.out.println("Email:      " + email);         // protected — OK in subclass
        System.out.println("Age:        " + getAge());      // private — accessed via getter
        System.out.println("Department: " + department);
        
        // ERROR (commented out): would not compile
        // System.out.println(age);  // COMPILE ERROR: age is private to Person
        //                           // Must use getAge() to access
    }
}

// ========== SECTION 9: MAIN DEMONSTRATION ==========
public class AccessDemo {
    
    public static void main(String[] args) {
        
        // ========== SECTION 10: CREATE EMPLOYEE OBJECT ==========
        Employee emp = new Employee("John", 30, "john@example.com", "Engineering");
        
        // ========== SECTION 11: ACCESS PUBLIC FIELD ==========
        System.out.println("--- Accessing public field ---");
        System.out.println("Can directly access name: " + emp.name);
        // Output: Can directly access name: John
        
        // ========== SECTION 12: ACCESS PROTECTED FIELD (FROM SUBCLASS) ==========
        // Note: If this code were in Employee class, we could access email directly
        // But from AccessDemo (not a subclass), we cannot access protected email
        // System.out.println(emp.email);  // ERROR: email is protected
        
        // ========== SECTION 13: PRIVATE FIELD VIA GETTER ==========
        System.out.println("\n--- Accessing private field via getter ---");
        System.out.println("Age via getter: " + emp.getAge());
        // Output: Age via getter: 30
        
        // System.out.println(emp.age);  // ERROR: age is private
        
        // ========== SECTION 14: DISPLAY SUBCLASS METHOD ==========
        System.out.println("\n--- Employee information ---");
        emp.display();
        // Output shows:
        //   Name: John
        //   Email: john@example.com
        //   Age: 30
        //   Department: Engineering
        
        // ========== SECTION 15: SETTER WITH VALIDATION (VALID) ==========
        System.out.println("\n--- Valid age update ---");
        emp.setAge(31);  // Valid age
        System.out.println("Updated age: " + emp.getAge());
        // Output: Updated age: 31
        
        // ========== SECTION 16: SETTER WITH VALIDATION (INVALID) ==========
        System.out.println("\n--- Invalid age update ---");
        emp.setAge(500);  // Invalid age (> 130)
        System.out.println("Age after invalid update: " + emp.getAge());
        // Output:
        //   Invalid age: 500
        //   Age after invalid update: 31 (unchanged)
        
        // ========== SECTION 17: KEY INSIGHTS ==========
        // 1. 'name' is public: anyone can read/write it directly
        // 2. 'email' is protected: subclasses can access it directly
        // 3. 'age' is private: ONLY Person methods can access it directly
        //    - We use getAge() to read
        //    - We use setAge() to write (with validation)
        // 4. This is encapsulation: hiding internal data behind methods
        // 5. Validation in setAge() prevents invalid data (age = 500)
    }
}
