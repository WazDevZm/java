class Demo{
    int x;
    Demo(){
        x=10;
    }
}

class Main {
    public static void main (String[] args) {
        Demo t1  = new Demo();
        System.out.println(t1.x);
    }
}