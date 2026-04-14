package Hash_Maps;
import java.text.ListFormat.Style;
import java.util.HashMap;
// DAY ONE OF TEST 2 PREP
public class hash_maps {
    // this is an Array List and it very dynamic and the other DS that is used to store items is called the Hash Map
    // A hash map is a map nas fthtere is no indexing of this list and all the itemes akk , having a key and a value, use the and ste them using key vlaue paies, suppky them
    // using the key and need to retried the key to get the values iusing the key valeu pairs and a For each looop to trvaese a ,map. Array list i a class you us to dreives the list
    // list is sis a super class aof the List,\
    // Hash mao is a sub class of the map, this isn ans Abrsrtact, they are not intianiseted,
    // thi sis a raw has map and tis has not intisliation jsujyst the declaration but indicate they key and thw value of thi slesit

  public static void main (String[] args) {
    HashMap <String, Integer> map = new HashMap<>(); // this is raw, when that is placed the delcation is vry complet and is cnsodeses complete
/// we are using thr Wrapper classes in 
    map.put("Mango", 45);
    map.put("Banana", 56);
    map.put("Orange", 456); // no ingherent order in this map, Brrerrt, thi sis becuase there is no indexinf of the postion this is a hashed map, with Key clase mamwlpemes
    System.out.println(map);

    System.out.println();

    // this is the methi ussed to get the item or the objectfrom the String
    // this will return the value being attached to the key
    System.out.println(map.get("Mango"));
  }

    
    
}
