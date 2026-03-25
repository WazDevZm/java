package ARRAYS;
// making the packeages in the classses and the subfolders


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
        // we are having a yellow line because the sub is not used yet.

    };
    
};
