import java.io.Console;
public class MaxOfThree {
    
    public static int maxOfThree(int val1, int val2, int val3) {
        return (val1 > val2) ? ((val1 > val3) ? val1 : val3) : ((val2 > val3) ? val2 : val3);
    }
    public static void main(String[] args){
        Console console = System.console();
        int val1 = Integer.valueOf(console.readLine());
        int val2 = Integer.valueOf(console.readLine());
        int val3 = Integer.valueOf(console.readLine());
        System.out.println(maxOfThree(val1, val2, val3));
    }
}
