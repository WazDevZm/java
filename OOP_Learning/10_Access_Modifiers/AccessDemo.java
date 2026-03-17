// ACCESS MODIFIERS: control who can read or change a class member.
//
//  public    — accessible from anywhere
//  private   — accessible only within the same class
//  protected — accessible within the same package AND in subclasses
//  (default) — accessible only within the same package (no keyword needed)

class Person {
    public String name;        // anyone can read/write
    protected String email;    // subclasses and same package can access
    private int age;           // only Person methods can touch this

    Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Public getter gives controlled, read-only access to private age
    public int getAge() {
        return age;
    }

    // Public setter lets us add validation before changing age
    public void setAge(int age) {
        if (age > 0 && age < 130) {
            this.age = age;
        } else {
            System.out.println("Invalid age: " + age);
        }
    }
}

class Employee extends Person {
    String department;

    Employee(String name, int age, String email, String department) {
        super(name, age, email);
        this.department = department;
    }

    void display() {
        System.out.println("Name:       " + name);          // public — OK
        System.out.println("Email:      " + email);         // protected — OK in subclass
        System.out.println("Age:        " + getAge());      // private — accessed via getter
        System.out.println("Department: " + department);
        // System.out.println(age); // COMPILE ERROR: age is private to Person
    }
}

public class AccessDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("John", 30, "john@example.com", "Engineering");
        emp.display();

        System.out.println();

        emp.setAge(31);                      // valid
        emp.setAge(500);                     // rejected by validation
        System.out.println("Updated age: " + emp.getAge());
    }
}
