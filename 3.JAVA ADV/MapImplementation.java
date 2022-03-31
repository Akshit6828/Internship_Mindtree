import java.util.*;

// Readmore about it:  https://www.geeksforgeeks.org/map-interface-java-examples/
public class MapImplementation {
    public static void main(String[] args) {

        System.out.println("\n---------HASH MAP--------------");
// Always stored in sorted order
// HashMap provided the advantage of quick insertion, search, and deletion but it never maintained the track and order of insertion
        Map<String, String> myMap = new HashMap<String, String>(); 
        myMap.put("B", "Ball");
        myMap.put("A", "Apple");
        myMap.put("C", "Cat");
        myMap.put("D", "Dog");

        System.out.println("myMap = " + myMap);

        System.out.println("myMap.get(\"A\") = " + myMap.get("A"));

        System.out.println("myMap.containsKey(\"A\") = " + myMap.containsKey("A"));

        System.out.println("myMap.containsValue(\"Ball\") = " + myMap.containsValue("Ball"));

        System.out.println("myMap.size() = " + myMap.size());

        System.out.println("myMap.isEmpty() = " + myMap.isEmpty());

        System.out.println("myMap.keySet() = " + myMap.keySet()); 
        Set<String> keys = myMap.keySet();
        for (String key : keys) {
            System.out.println(key + " ");
        }
        // returns a set of keys

        System.out.println("myMap.values() = " + myMap.values()); // Returns a collection view of the values contained in this map.
        Collection values = myMap.values();
        for (Object value : values) {
            System.out.println(value + " ");
        }
        
        System.out.println("\n---------LINKED HASH MAP--------------");
// Use LinkedHashMap for a map that maintains the order of insertion.
//LinkedHashMap provides where the elements can be accessed in their insertion order
        Map<String, String> myLinkedMap = new LinkedHashMap<String, String>();
        myLinkedMap.put("B", "Ball");
        myLinkedMap.put("A", "Apple");
        myLinkedMap.put("C", "Cat");
        myLinkedMap.put("D", "Dog");

        System.out.println("myLinkedMap = " + myLinkedMap);

        System.out.println("myLinkedMap.get(\"A\") = " + myLinkedMap.get("A"));

        System.out.println("myLinkedMap.containsKey(\"A\") = " + myLinkedMap.containsKey("A"));

        System.out.println("myLinkedMap.containsValue(\"Ball\") = " + myLinkedMap.containsValue("Ball"));

        System.out.println("myLinkedMap.size() = " + myLinkedMap.size());

        System.out.println("myLinkedMap.isEmpty() = " + myLinkedMap.isEmpty());

        System.out.println("myLinkedMap.keySet() = " + myLinkedMap.keySet()); 
        Set<String> keys2 = myLinkedMap.keySet();
        for (String key : keys2) {
            System.out.println(key + " ");
        }
        // returns a set of keys

        System.out.println("myLinkedMap.values() = " + myLinkedMap.values()); // Returns a collection view of the values contained in this map.
        Collection values2 = myLinkedMap.values();
        for (Object value : values2) {
            System.out.println(value + " ");
        }



// Use TreeMap for a map that is sorted according to the natural ordering of its keys.
// The map is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time, depending on which constructor is used
        System.out.println("\n------TREE MAP ---------------");
        Map<String, String> myTreeMap = new TreeMap<String, String>();
        myTreeMap.put("B", "Ball");
        myTreeMap.put("A", "Apple");
        myTreeMap.put("C", "Cat");
        myTreeMap.put("D", "Dog");

        System.out.println("myTreeMap = " + myTreeMap);

        System.out.println("myTreeMap.get(\"A\") = " + myTreeMap.get("A"));

        System.out.println("myTreeMap.containsKey(\"A\") = " + myTreeMap.containsKey("A"));


        System.out.println("myTreeMap.containsValue(\"Ball\") = " + myTreeMap.containsValue("Ball"));

        System.out.println("myTreeMap.size() = " + myTreeMap.size());

        System.out.println("myTreeMap.isEmpty() = " + myTreeMap.isEmpty());

        System.out.println("myTreeMap.keySet() = " + myTreeMap.keySet());

        Set<String> keys3 = myTreeMap.keySet();
        for (String key : keys3) {
            System.out.println(key + " ");
        }

        System.out.println("myTreeMap.values() = " + myTreeMap.values()); // Returns a collection view of the values contained in this map.

        Collection values3 = myTreeMap.values();
        for (Object value : values3) {
            System.out.println(value + " ");
        }


    }
}
