import java.util.Scanner;

// Program which accepts 4 values for the variables ,use Logical operators to print their results And arithmetic operators for addition subtraction ,multiplication and the division with their respective results each on new line using functions.
class Operations{

    // Add 4 variables and print their results
    public static void add(int a, int b, int c, int d){
        System.out.println("Addition of " + a + " + " + b + " + " + c + " + " + d + " = " + (a + b + c + d));
    }
    // Subtract 4 variables and print their results
    public static void subtract(int a, int b, int c, int d){
        System.out.println("Subtraction of " + a + " - " + b + " - " + c + " - " + d + " = " + (a - b - c - d));
    }
    // Multiply 4 variables and print their results
    public static void multiply(int a, int b, int c, int d){
        System.out.println("Multiplication of " + a + " * " + b + " * " + c + " * " + d + " = " + (a * b * c * d));
    }
    // Divide 4 variables and print their results
    public static void divide(int a, int b, int c, int d){
        System.out.println("Division of " + a + " / " + b + " / " + c + " / " + d + " = " + (a / b / c / d));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, num4;
        System.out.println("Enter 4 numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        num4 = sc.nextInt();
        sc.close();
        add(num1, num2, num3, num4);
        subtract(num1, num2, num3, num4);
        multiply(num1, num2, num3, num4);
        divide(num1, num2, num3, num4);

    }
}

