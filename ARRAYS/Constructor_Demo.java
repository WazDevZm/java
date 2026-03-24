package ARRAYS;


// creating a SuperClass here:

class superClass {
    public superClass() {
        System.out.println("This is the Super Class Constructor");  
}

}

class subClass extends superClass {
    public subClass() {
        System.out.println("This is the Sub Class Constructor");
    }
}

public class Constructor_Demo {
    public static void main (String args []){
        subClass sub = new subClass();

    };
    
};
