import java.util.Arrays;

public class CountTriplets {

    static int count_Triplets(int[] A, int N) {
        int count = 0;
        Arrays.sort(A);
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (A[i] + A[j] == A[k]) {
                        System.out.println(A[i] + "," + A[j] + "," + A[k]);
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int[] A = { 1, 2, 3, 4, 5, 7, 9 };
        int N = A.length;
        System.out.print(count_Triplets(A, N));
    }
}
