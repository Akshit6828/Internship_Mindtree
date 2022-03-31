import java.util.*;
public class Sets {
    public static void main(String[] args) {
        // Set: Interface
        // HashSet: Implementation
        // TreeSet: Implementation

        // Properties of Hashset:
        // 1. No duplicate elements
        // 2. No order
        // 3. No index
        // 4. No null elements
        // 5. No random access
        // 6. Not sorted

        // Properties of TreeSet:
        // 1. No duplicate elements
        // 2. No order
        // 3. No index
        // 4. No null elements
        // 5. No random access
        // 6. Sorted


        // HashSet is a collection that does not allow duplicates.
        // Elements are stored in the order in which they are added.
        // HashSet is not synchronized.

        System.out.println("\n---------HASH SET--------------");

        Set<Integer> myHashSet = new HashSet<>();
        myHashSet.add(20);
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(6);
        myHashSet.add(1);

        Iterator<Integer> it = myHashSet.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        System.out.println("HashSet.contains(1): " + myHashSet.contains(1));
        System.out.println("HashSet.isEmpty(): " + myHashSet.isEmpty());
        System.out.println("HashSet.size(): " + myHashSet.size());
        System.out.println("Hashset.remove(1): " + myHashSet.remove(1));
        System.out.println("HashSet.size(): " + myHashSet.size());

        System.out.println();
        // Tree set is a set that sorts the elements.
        // It uses a binary search tree.
        // It is a good choice for sets that need to be sorted.

        System.out.println("\n---------TREE SET--------------");
        Set<Integer> myTreeSet = new TreeSet<>();
        myTreeSet.add(20);
        myTreeSet.add(1);
        myTreeSet.add(2);
        myTreeSet.add(6);
        myTreeSet.add(1);

        for(int i: myTreeSet)
            System.out.print(i+" ");

    }
}
