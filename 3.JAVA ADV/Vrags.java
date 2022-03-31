import java.util.*;
public class Vrags {
    
    public static void fun1(int... vrags){ // int... is of type array
        System.out.println(Arrays.toString(vrags));
    }

    // Vrags must be placed at the end of the parameter list.
    public static void fun2(String callerName, String... vrags){ // String... is of type array
        System.out.print("Caller Name = " + callerName);
        System.out.println(" :-> Caller list  = " + Arrays.toString(vrags));
    }
    public static void main(String[] args) {
        fun1(1,2,3,4);
        fun1(1,2,3,4,5,6);

        fun2("Akshit", "Amisha", "Bhupi", "Monty", "Kamal");
        fun2("Akshit", "Amisha", "Bhupi", "Monty", "Kamal", "Manpreet", "Shyna");
    }
}
