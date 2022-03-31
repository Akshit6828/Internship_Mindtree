import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<Integer>();
        for(int i = 0; i < 10; i++)
            list.add(i);
        
        System.out.println("Intial List = " + list);   
        
        System.out.println("List.isEmpt() = " + list.isEmpty());
        
        System.out.println("list.remove(2): remove element and index 2 from list");
        list.remove(2); // Removes the element at index 2

        System.out.println("list.remove(new Integer(5): Removes the element 5 in list");
        list.remove(new Integer(5)); // Removes the element 5
        

        System.out.println("List  = " + list);

        Iterator<Integer> it = list.iterator();
        //ListIterator<Integer> it = list.listIterator();

        // This may lead to ConcurrentModificationException  
        //When iterating over elements, it is recommended to use Iterator.remove() method. 
        
        while(it.hasNext()) { // Returns true if there is a next element
            int i = (int)it.next();
            if(i == 3) {
                    it.remove();
            }            
        }

        list.set(6, 60); // Replaces the element at index 6 with 60
        System.out.println("List  = " + list);

        Integer arr[] = new Integer[list.size()]; 
        arr = list.toArray(arr);

        System.out.println("Array  =" + Arrays.toString(arr));
      //  System.out.println("Array  =" + arr); - prints reference to first index

      ListIterator<Integer> listItr = list.listIterator(); // List iterator has next and previous methods too.
    // More functions like: hasNext(), hasPrevious(), next(), previous(), nextIndex(), previousIndex()
      while(listItr.hasNext()){
            System.out.println("ListIterator = " + listItr.next());
            System.out.println("ListIterator = " + listItr.nextIndex());
      }
    }

}
