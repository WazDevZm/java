// Introduction to classes and objects in Java.
// A class is a blueprint; an object is an instance of that blueprint.
class People {
    String name;
    int age;
}

public class Day1 {
    public static void main(String[] args) {
        People wazingwa = new People();
        wazingwa.name = "Mugala";
        System.out.println(wazingwa.name);
    }
}
