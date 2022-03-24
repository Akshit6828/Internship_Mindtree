import java.util.Scanner;

// Write a program which accepts string values in it ,use switch statement to match their results(continue & break statements are optional to use )
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter three or two or one to start the rate from instant");
        str = sc.nextLine();
        sc.close();
        switch (str) {
            case "three":
                System.out.print("3.");
            case "two":
                System.out.print("2.");
            case "one":
                System.out.print("1..Start");
                break;
            default:
                System.out.print("Invalid input");
                break;
        }

    }

}