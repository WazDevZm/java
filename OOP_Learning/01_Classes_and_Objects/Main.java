class OuterClass{
    int x = 10;
    public class InnerClass {
        public int myMethod(){
            return x;
        }
    }
}

public class Main{
    public static void main(String[] args){
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.myMethod());
    }
}
// some of the code showing that we can have inner classes within outer classes 