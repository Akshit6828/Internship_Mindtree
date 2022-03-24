import java.util.Scanner;

public class Rating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rating = sc.nextDouble();
        sc.close();
        if (rating < 0.0) {
            System.out.println("Bad rating");
        } else if (rating > 0.0 && rating < 3.0) {
            System.out.println("Average rating");
        } else {
            System.out.println("Good rating");
        }
    }
}
