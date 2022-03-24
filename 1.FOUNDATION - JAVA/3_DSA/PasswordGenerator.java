import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        String n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your full name:");
        n = sc.nextLine();
        System.out.print("Enter your age:");
        int age = sc.nextInt();
        String[] t = n.split(" ");
        int l = t.length;
        System.out.print("Your password is:");
        for (int i = 0; i < l - 1; i++) {
            System.out.print(t[i].charAt(0) + "#");
        }
        System.out.print(t[l - 1] + "^" + age);
    }
}
