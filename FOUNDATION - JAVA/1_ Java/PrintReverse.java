import java.util.Scanner;
public class PrintReverse {
    
    public static void printReverse(int n){
        int reverse = 0;
        while(n>0){
            reverse = reverse*10 + n%10;
            n = n/10;
        }
        System.out.println(reverse);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printReverse(n);
        sc.close();
    }
}
