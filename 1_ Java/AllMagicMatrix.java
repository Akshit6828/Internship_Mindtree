import java.util.Scanner;
public class AllMagicMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of Row's and Column of Matrix:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println(isMagicMatrix(arr, n, m));
    }
    public static boolean isMagicMatrix(int[][] arr, int row, int col) {
        
        if(row != col)
            return false;
        int rowSum = 0;
        int colSum = 0;
        int diagSum = 0;
        int antiDiagSum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                rowSum += arr[i][j];
                colSum += arr[j][i];
            }
            
        }
        for (int i = 0; i < row; i++) {
            diagSum += arr[i][i];
            antiDiagSum += arr[i][col - 1 - i];
        }
        int bothDiagnolSum = diagSum + antiDiagSum;

        return ( rowSum == colSum && rowSum == bothDiagnolSum);
    }

}
