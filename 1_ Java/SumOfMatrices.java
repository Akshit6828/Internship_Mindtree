import java.util.Scanner;
public class SumOfMatrices {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of Row's and Column of Matrix:");
        int row=sc.nextInt();
        int column=sc.nextInt();
        int matrix1[][] = new int[row][column];
        int matrix2[][] = new int[row][column];
        int result[][] =  new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                result[i][j] = matrix1[i][j]+matrix2[i][j];
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
        

        sc.close();

    }
}
