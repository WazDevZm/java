package Hash_Maps;
import java.util.HashMap;
import java.util.Map.Entry;

// Day 1: Test 2 Preparation - HashMap basics
public class hash_maps {

  /*
   * HashMap Notes:
   * 1. HashMap stores data as key-value pairs.
   * 2. Keys are unique; values can be duplicated.
   * 3. HashMap does not maintain insertion order.
   * 4. This example uses wrapper classes (String, Integer) with generics.
   */
  public static void main(String[] args) {
    HashMap<String, Integer> map = new HashMap<>();

    // Add entries: put(key, value)
    map.put("Mango", 45);
    map.put("Banana", 56);
    map.put("Orange", 456);

    // Print full map
    System.out.println(map);
    System.out.println();

    // Access data by key
    System.out.println(map.get("Mango"));

    // View keys, values, and key-value entries
    System.out.println(map.keySet());
    System.out.println(map.values());
    System.out.println(map.entrySet());

    // Remove an entry by key
    map.remove("Mango");

    // Traverse using enhanced for-loop
    for (Entry<String, Integer> item : map.entrySet()) {
      System.out.println(item.getKey() + " " + item.getValue());
    }

    // Traverse using forEach with lambda
    map.forEach((String key, Integer value) -> {
      System.out.println(key + " " + value);
    });
  }
}
