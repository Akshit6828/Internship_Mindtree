import java.util.Random;
public class RandomNumbers {
    public static void main(String[] args) {
       
        Random r = new Random();
        int num;
        num = r.nextInt(); // Generates Random in no bound
        System.out.println("Random number in no bound: " + num);
        num = r.nextInt(10); // Generates Random in 0 to 10
        System.out.println("Random number in 0 to 10: " + num);
        num = r.nextInt(10) + 1; // Generates Random in 1 to 10
        System.out.println("Random number in 1 to 10: " + num);
        num = r.nextInt(10) + 10; // Generates Random in 10 to 20
        System.out.println("Random number in 10 to 20: " + num);

    }
    
}
