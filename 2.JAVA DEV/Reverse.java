import java.util.Scanner;
public class Reverse{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] rev = new int[10];
        int i,j;
        System.out.println("Enter 10 numbers");
        for(i=0;i<10;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(i=0,j=9;i<10;i++,j--){
            rev[i] = arr[j];
        }
        System.out.println("The array in reverse order is");
        for(i=0;i<10;i++){
            System.out.print(rev[i] + " ");
        }
    }
}
