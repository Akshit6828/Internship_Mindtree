import java.util.Scanner;

class StaticImplementation {

    static int counter = -1;
    int value;
    static {
        counter++;
        System.out.println("Counter incremented to " + counter + " in static block");
    }

    StaticImplementation(int value) {
        this.value = value;
        counter++;
        System.out.println("Counter incremented to " + counter + " in constructor");
    }

    void display() {
        System.out.println("Value = " + this.value);
    }
}

public class StaticBlockAndUse {
    public static void main(String[] args) {
        StaticImplementation[] arr = new StaticImplementation[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 integers:");
        for (int i = 0; i < arr.length; i++) {
            int value = sc.nextInt();
            arr[i] = new StaticImplementation(value);
        }
        
        sc.close();
        System.out.println("Displaying values using this keyword:");
        for (int i = 0; i < arr.length; i++) {
            arr[i].display();
        }
    }
}
