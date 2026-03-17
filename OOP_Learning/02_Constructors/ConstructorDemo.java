// Demonstrates how a constructor initializes object fields when an object is created
class Demo {
    int x;

    Demo() {
        x = 10;
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Demo t1 = new Demo();
        System.out.println(t1.x);
    }
}
