import java.util.Scanner;

public class BinarySearch {
    private int arr[];
    private int size;
    private int key;

    BinarySearch(int size, int key) {
        this.size = size;
        this.key = key;
        arr = new int[size];
    }

    public boolean binarySearch(int arr[], int n, int key) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key)
                return true;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int key = sn.nextInt();
        BinarySearch b = new BinarySearch(n, key);
        BubbleSort bs = new BubbleSort(n);
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sn.nextInt();
        sn.close();
        bs.bubbleSort(arr, n);
        System.out.println("Performing binary search on array for key: " + key);
        if (b.binarySearch(arr, n, key))
            System.out.println("Key Found");
        else
            System.out.println("Not Found");
    }

}
