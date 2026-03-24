package ARRAYS;
//import java.text.ListFormat.Style;
import java.util.ArrayList;

public class Array_List {
    public static void main (String args [] ){
        // we are looking at Array Lists
        // the data type should be in object form and it should be declared in. <>
        // no primitve types ar used in this case -- each primittive type has a wrapper class, int -- integer
        // learn hoe to use the wrppaer clas and the fload and the Float
        // Double with Double with vaptial D
        //Bloolean with captial Bolean, this are Wrapper classes that contain these primitves.


        ArrayList <String> myList = new ArrayList<>(); // Raw Array list becuase the kind of data is not known.
        myList.add("James");
        myList.add("Mwape");
        myList.add("Mary");


        // this adds at a postition
        myList.add(0, "Mark"); // (index, element) , e,g (1, "Wazingwa");

        // String is not a prirmitve type because it has an S=assoicated class.
        // list. add ();
        

        // Getting an item
        String name = myList.get(0);
        System.out.print(name);


        // Remove by Object
        myList.remove(0); // it removes the first item and maintains the rest

     //   System.out.print(myList);

        System.out.print(myList);


        // Contains

        System.out.print(myList.contains("Fred"));

        // you can add at position and that the
        // Array Indexing starts at 0

        //Changing



        //Clear all. this prints all-- using list size, lenght is for arrays lol


        //clearing all 

        // When traversing the Array list you can use a for loop or a for each loop

    }
    
}
// a array list can grow and shrink at any time, a class that is derived from another class called list.


// Recommeded Books: Starting out with Java and How to Program in Java pdf books