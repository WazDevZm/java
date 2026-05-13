package Hash_Maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class task_1 {
    public static void main (String[] args){
        String [] fruits = {
            "Mango",
            "Banana",
            "Orange",
            "Lemon",
            "Grapes",
            "Pineapple",
            "Strawberry",
            "Watermelon",
            "Blueberry",
            "Peach",
            "Cherry",
            "Pear",
            "Kiwi",
            "Papaya",
            "Kiwi"
        };

        // which fruit was the best seller? susing th Hasm map
        HashMap<String, Integer> map = new HashMap<>();
        for (String fruit : fruits) {
            map.put(fruit, map.getOrDefault(fruit, 0) + 1);
        }

        // Find the fruit with the highest sales
        String bestSeller = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("Best seller: " + bestSeller);

    }
    
}// using of the Hash maos to find the most common item in.  lsit of items in the hasbh a mas llist
// using a for each loop and traversiiong through the system in the site of the work and th full work and the full 
// frojr rin tuh the fllyer in the vlass in teh full styanec of the best sellter code, usit very simple/.....
//usng the has map to get the mmoneth that we nned to eget the code running in the terminal as wee as the man feat we nned to oush to the cloud