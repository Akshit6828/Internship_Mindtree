import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int [] arr = {12,2,23,24,5,64,7,58,9,10};
        // Functions of Array.
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 5));
        System.out.println(Arrays.binarySearch(arr, 20)); // Returns -index where it is supposed to be.
        System.out.println(Arrays.binarySearch(arr, 2, 8, 5));
        
        Arrays.fill(arr,-1);
        System.out.println(Arrays.toString(arr));

        
    }
}
