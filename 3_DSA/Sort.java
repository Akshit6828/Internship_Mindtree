import java.util.*;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strArr = new String[n];
        for (int i = 0; i < n; i++) {
            String input = sc.next();
            strArr[i] = input;
        }
        sc.close();
        bubbleSort(strArr);
        insertionSort(strArr);
    }

    public static void bubbleSort(String[] strArr) {
        String temp;
        for (int i = 0; i < strArr.length - 1; i++) {
            for (int j = i + 1; j < strArr.length; j++) {
                if (strArr[j].compareTo(strArr[i]) < 0) {
                    temp = strArr[j];
                    strArr[j] = strArr[i];
                    strArr[i] = temp;
                }
            }
        }

        System.out.println("Array after Bubble Sort is : ");
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }
    }

    public static void insertionSort(String[] strArr) {
        System.out.println("Array after Insertion Sort is : ");
        for (int i = 1; i < strArr.length; i++) {
            String temp = strArr[i];
            int j = i - 1;
            while (j >= 0) {
                if (temp.compareTo(strArr[j]) > 0) {
                    break;
                }
                strArr[j + 1] = strArr[j];
                j--;
            }
            strArr[j + 1] = temp;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(strArr[i]);
        }
    }

}
