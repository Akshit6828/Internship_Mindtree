import java.util.*;
public class Gretting {

    public static void greetPerson(String name) {
        System.out.println("Hello, " + name + "!");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        greetPerson(name);
        sc.close();
        
    }
}
