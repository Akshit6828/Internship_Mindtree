import java.util.Scanner;
import java.util.*;

class Hashset {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Stores in a random order.
        // Duplicates are not allowed.
        // HashSet is not synchronized.
        HashSet<String> set = new HashSet<String>();
        System.out.println("Enter 5 names to be added: ");
        for (int i = 0; i < 5; i++) {
            set.add(sc.nextLine());
        }
        sc.close();
        
        Iterator<String> it = set.iterator();
        System.out.println("The elements of Set : ");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
