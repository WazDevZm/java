package ARRAYS;

import java.util.ArrayList;

/**
 * Array_List — Demonstrates ArrayList operations and how it differs from fixed arrays.
 * 
 * CONCEPTS:
 * • ArrayList is a dynamic, resizable collection (unlike fixed-size arrays)
 * • Generic type parameter <String> ensures type safety
 * • Key methods: add(), add(index, element), get(), remove(), contains()
 * • ArrayList uses .size() instead of .length (for arrays)
 * • Traversal options: for-each loop, traditional for loop
 * 
 * LEARNING: This teaches dynamic collections and why they're better than fixed arrays.
 */
public class Array_List {
    
    public static void main(String[] args) {
        
        // ========== SECTION 1: ARRAYLIST INITIALIZATION ==========
        // Create a generic ArrayList<String> — the <String> ensures type safety
        // Unlike arrays, ArrayList can grow and shrink dynamically
        ArrayList<String> myList = new ArrayList<>();
        
        // ========== SECTION 2: ADDING ELEMENTS ==========
        // add() appends to the end of the list
        myList.add("James");
        myList.add("Mwape");
        myList.add("Mary");
        
        // ========== SECTION 3: INSERTION AT SPECIFIC INDEX ==========
        // add(index, element) inserts at the given position and shifts remaining elements
        // This inserts "Mark" at position 0, pushing "James" to position 1
        myList.add(0, "Mark");  // Format: (index, element)
        
        // ========== SECTION 4: ACCESSING ELEMENTS BY INDEX ==========
        // get(index) retrieves the element at that position (0-indexed)
        String name = myList.get(0);  // Retrieves "Mark"
        System.out.println("First element: " + name);
        
        // ========== SECTION 5: REMOVING ELEMENTS ==========
        // remove(index) removes the element at that index and shifts remaining elements
        myList.remove(0);  // Removes "Mark", "James" shifts to index 0
        
        // ========== SECTION 6: DISPLAY LIST ==========
        // Printing the list directly calls its toString() method
        System.out.println("List after removal: " + myList);
        
        // ========== SECTION 7: MEMBERSHIP TEST ==========
        // contains(Object) returns true if the element exists in the list
        boolean hasFred = myList.contains("Fred");
        System.out.println("Does list contain 'Fred'? " + hasFred);  // Output: false
        
        // ========== SECTION 8: LIST PROPERTIES ==========
        // .size() returns the number of elements in the list (not .length)
        System.out.println("List size: " + myList.size());
        
        // ========== SECTION 9: TRAVERSAL OPTIONS ==========
        // Option 1: For-each loop (simplest for reading)
        System.out.println("\nTraversing list with for-each:");
        for (String person : myList) {
            System.out.println("  " + person);
        }
        
        // Option 2: Traditional for loop (needed for index-based operations)
        System.out.println("\nTraversing list with traditional for loop:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("  [" + i + "] " + myList.get(i));
        }
    }
}