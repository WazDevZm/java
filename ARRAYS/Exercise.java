package ARRAYS;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise {
    // private static final Readable String = null;

    public static void main (String args []) {
        // Quick WORK
        ArrayList <String> list = new ArrayList<>(
                List.of("Mango", "Orange","Lemon", "Guava")
            );
             // Lising the Elements of the Array list
             // Add a fruit to the Array List
            // Displaying the list
            System.out.println(list);

            //Ask the User to enter a fruit in the list
            System.out.print("Please enter the name of your fruit: ");
            //Scanner fruit = new Scanner(String);

            Scanner fruit = new Scanner(System.in);


    }

    
}
