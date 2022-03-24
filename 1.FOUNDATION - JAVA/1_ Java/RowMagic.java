import java.util.Scanner;
public class RowMagic {

    private static boolean rowMagic(int[][] arr1,int row,int col) {
        int sum = 0;
        int res[] = new int[row];
        for(int i= 0;i< row;i++){
            for(int j=0;j<col;j++){
                sum+=arr1[i][j];
            }
            res[i]=sum;
        }
        for(int i=0;i<row-1;i++){
            if(res[i]!=res[i+1]){
                return false;
            } 
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(rowMagic(arr,row,col));
        sc.close();

    }
}
