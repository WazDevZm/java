// Demonstrates calling a method defined inside an inner class
class Outer {
    int x = 10;

    public class Inner {
        public int myMethod() {
            return x;
        }
    }
}

public class InnerClassMethod {
    public static void main(String[] args) {
        Outer myOuter = new Outer();
        Outer.Inner myInner = myOuter.new Inner();
        System.out.println(myInner.myMethod());
    }
}
