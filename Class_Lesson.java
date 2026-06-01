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
// creatting a new class called Student
class Student {
     String name;
     int age;
     String grade;

     // i will try to create a construtors for this class using the
     
}
public class Class_Lesson {
     static String Student = "Wazingwa";
     public static void main (String[]args) {
          Fruit fruit1 = new Fruit("Mango", 45.56);

          System.out.println("The name of the fruit is: " + fruit1.name); // using the constructor this works
          System.out.println(Student);
     }
// TODO
// look into packages and how to import classes from another class
// local variable cannot be static and the other this is hat it alays has to be intialasized before it is used.
// when using classes in a java file, the access modifiers used are package and
//the public
// getters and setters and
// constructor
// from the observation we see that the 
// this is a qualifier name, is only for the object, we only use it on the name and not on the static variable
}