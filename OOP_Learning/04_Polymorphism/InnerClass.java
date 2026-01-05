class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;

    };

};

public class InnerClass{
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();

        System.out.println("Value of x: " + outer.x);
        System.out.println("Value of y: " + inner.y);
    }
}