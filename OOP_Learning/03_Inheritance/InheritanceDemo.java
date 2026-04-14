/**
 * InheritanceDemo — Demonstrates multi-level inheritance and method overriding.
 * 
 * CONCEPTS:
 * • 'extends' allows a class to inherit from a parent class
 * • Child classes inherit all fields and methods from parent
 * • Child constructor MUST call super() to initialize parent state
 * • Method overriding: child redefines parent method with same signature
 * • super.method() calls the parent version of an overridden method
 * • Multi-level inheritance: ElectricCar extends Car extends Vehicle
 * 
 * LEARNING: Build class hierarchies where specialized classes extend general ones.
 */

// ========== SECTION 1: PARENT CLASS (BASE) ==========
// Vehicle is the top-level parent class
class Vehicle {
    // Fields shared by all vehicles
    String brand;
    int speed;

    // Constructor requiring brand and speed
    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method describing the vehicle
    void describe() {
        System.out.println(brand + " travels at " + speed + " km/h.");
    }
}

// ========== SECTION 2: CHILD CLASS (FIRST LEVEL) ==========
// Car extends Vehicle and adds a field specific to cars
class Car extends Vehicle {
    // Additional field for cars
    int doors;

    // Constructor must initialize parent fields via super()
    Car(String brand, int speed, int doors) {
        super(brand, speed);  // CRITICAL: Call parent constructor first
        this.doors = doors;
    }

    // Override parent describe() to add car-specific info
    void describe() {
        super.describe();   // Call parent version first
        System.out.println("It has " + doors + " doors.");
    }
}

// ========== SECTION 3: GRANDCHILD CLASS (SECOND LEVEL) ==========
// ElectricCar extends Car and adds an additional field
class ElectricCar extends Car {
    // Additional field for electric vehicles
    int batteryRange;

    // Constructor initializes parent (Car) via super()
    ElectricCar(String brand, int speed, int doors, int batteryRange) {
        super(brand, speed, doors);  // Call parent constructor
        this.batteryRange = batteryRange;
    }

    // Override describe() to add electric car specifics
    void describe() {
        super.describe();   // Call parent (Car) describe()
        System.out.println("Battery range: " + batteryRange + " km.");
    }
}

// ========== SECTION 4: MAIN DEMONSTRATION ==========
public class InheritanceDemo {
    
    public static void main(String[] args) {
        
        // ========== SECTION 5: CREATE OBJECTS ==========
        // Create one object at each level of the hierarchy
        Vehicle v = new Vehicle("Generic", 100);
        Car c = new Car("Toyota", 180, 4);
        ElectricCar e = new ElectricCar("Tesla", 250, 4, 500);

        // ========== SECTION 6: DEMONSTRATE POLYMORPHISM ==========
        System.out.println("--- Vehicle ---");
        v.describe();
        // Output:
        //   Generic travels at 100 km/h.

        System.out.println("\n--- Car ---");
        c.describe();
        // Output:
        //   Toyota travels at 180 km/h.
        //   It has 4 doors.

        System.out.println("\n--- ElectricCar ---");
        e.describe();
        // Output:
        //   Tesla travels at 250 km/h.
        //   It has 4 doors.
        //   Battery range: 500 km.
        
        // ========== SECTION 7: KEY INSIGHTS ==========
        // Each level builds on the previous:
        // - ElectricCar.describe() calls super.describe() (Car's version)
        // - Car.describe() calls super.describe() (Vehicle's version)
        // - Vehicle.describe() does its own work
        // This creates layered behavior and code reuse.
    }
}
