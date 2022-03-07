import java.util.ArrayList;
import java.util.Scanner;
public class PrimesBetweenRange {

    public static boolean isPrime(long n) {
        if(n<=1) return false;
        if(n == 2 || n == 3) return true;
        if(n%2 == 0 || n%3 == 0) return false;

        for(int i=5;i<=Math.sqrt(n);i+=6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> generatePrimeList(int init, int end ){
        ArrayList<Integer> primes = new ArrayList<>();
        
        for(int i = init; i<=end; i++){
            if(isPrime(i)){
                primes.add(i);
            }
        }
        return primes;
    }

    public static void printList(ArrayList<Integer> list){
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i) + ",");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1  = sc.nextInt();
        int val2 = sc.nextInt();
        ArrayList<Integer> primesList = generatePrimeList(val1, val2);
        sc.close();
        printList(primesList);
        
    }

}
