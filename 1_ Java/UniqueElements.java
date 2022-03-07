import java.util.ArrayList;
import java.util.Scanner;
public class UniqueElements {
    
    public static ArrayList<Integer> uniqElements(int[] array1, int[] array2) {
        
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < array1.length; i++) {
            if (!result.contains(array1[i])) {
                result.add(array1[i]);
            }
        }
        for (int i = 0; i < array2.length; i++) {
            if (!result.contains(array2[i])) {
                result.add(array2[i]);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array1 = new int[n];
        for (int i = 0; i < n; i++) {
            array1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] array2 = new int[m];
        for (int i = 0; i < m; i++) {
            array2[i] = sc.nextInt();
        }
        sc.close();
        ArrayList<Integer> result = uniqElements(array1, array2);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}
