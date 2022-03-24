import java.io.Console;

class Parent {
    public void message() {
        System.out.println("Method of Parent");
    }
}

class Child extends Parent {

    public void message() {
        System.out.println("Method overided and called via Child");
    }

    public int maxx(int a, int b, int c) {
        return (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    }
}

class OverloadAndRide {

    public static void main(String[] args) {
        Child obj1 = new Child();
        // Reading values from console
        Console console = System.console();

        int a = Integer.parseInt(console.readLine("Enter first number: "));
        int b = Integer.parseInt(console.readLine("Enter second number: "));
        int c = Integer.parseInt(console.readLine("Enter third number: "));
        
        obj1.message();
        System.out.println("Max of 3 numbers is = " + obj1.maxx(a, b, c));
    }
}
 