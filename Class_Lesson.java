// we are learning about class design
import java.util.Scanner;
import java.util.Stack;
import java.io.FilterOutputStream;
//import java.util.Math;

class Fruit{
     // these are the fields of this class
     String name;
     double price;
// rememver when trying to use a class from a different package, esure that you import it from the other class
// when not imported it wont run, this class may belong in a differet packake
     // this is a constructor of this class
     Fruit (String name, double price) {
        this.name = name;
        this.price = price;
     };

}
public class Class_Lesson {
    public static void main (String[]args) {
    Fruit fruit1 = new Fruit("Mango", 45.56);

    System.out.println("The name of the fruit is: " + fruit1.name); // using the constructor this works
}
 // TODO
 // look into packages and how to import classes from another class

// when using classes in a java file, the access modifiers used are package and
//the public
// getters and setters and
// constructor
// from the observation we see that the 
}