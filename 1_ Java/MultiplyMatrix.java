import java.util.Scanner;
public class MultiplyMatrix {
    public static void main(String[] args) {
        int row1, col1, row2, col2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the first matrix");
        row1 = sc.nextInt();
        col1 = sc.nextInt();
        int[][] matrix1 = new int[row1][col1];
        System.out.println("Enter the elements of the first matrix");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the number of rows and columns of the second matrix");
        row2 = sc.nextInt();
        col2 = sc.nextInt();
        int[][] matrix2 = new int[row2][col2];
        System.out.println("Enter the elements of the second matrix");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        if (col1 != row2) {
            System.out.println("The matrices cannot be multiplied");
        } else {
            int[][] result = multiply(matrix1, matrix2);
            System.out.println("The result of the multiplication is");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
    
    public static int[][] multiply(int[][] a, int[][] b) {
        int[][] mul = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return mul;
    }
}
