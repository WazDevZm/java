// INHERITANCE: a subclass inherits all fields and methods from its superclass.
// Use `extends` to inherit. Use `super()` to call the parent constructor.
// Use `super.method()` to call an overridden parent method.

class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void describe() {
        System.out.println(brand + " travels at " + speed + " km/h.");
    }
}

class Car extends Vehicle {
    int doors;

    Car(String brand, int speed, int doors) {
        super(brand, speed); // must call parent constructor first
        this.doors = doors;
    }

    void describe() {
        super.describe();   // reuse parent output
        System.out.println("It has " + doors + " doors.");
    }
}

class ElectricCar extends Car {
    int batteryRange;

    ElectricCar(String brand, int speed, int doors, int batteryRange) {
        super(brand, speed, doors);
        this.batteryRange = batteryRange;
    }

    void describe() {
        super.describe();
        System.out.println("Battery range: " + batteryRange + " km.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Generic", 100);
        Car c = new Car("Toyota", 180, 4);
        ElectricCar e = new ElectricCar("Tesla", 250, 4, 500);

        System.out.println("--- Vehicle ---");
        v.describe();

        System.out.println("\n--- Car ---");
        c.describe();

        System.out.println("\n--- ElectricCar ---");
        e.describe();
    }
}
