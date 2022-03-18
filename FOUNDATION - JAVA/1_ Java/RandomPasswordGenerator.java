import java.util.Scanner;
import java.util.Random;
public class RandomPasswordGenerator {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customer name:");
		String name=sc.nextLine();
		System.out.println("Enter customer age:");
		String age=sc.nextLine();
		System.out.println("Enter customer id:");
		String id=sc.nextLine();
		System.out.println("The random passoword generated is : " + String.valueOf( generateRandomPassword(name,age,id)));
		sc.close();

    }

    public static char[] generateRandomPassword(String name, String age, String id) {
        name = name.replaceAll(" ", "");
		
        String mixedCombinedDataString = name + age + id ;

		Random random = new Random();
		char[] password = new char[8];
		password[1] = age.charAt(random.nextInt(age.length()));
		password[0] = name.charAt(random.nextInt(name.length()));
		password[2] = id.charAt(random.nextInt(id.length()));
				

		for (int i = 3; i < 8; i++) {
		    password[i] = mixedCombinedDataString.charAt(random.nextInt(mixedCombinedDataString.length()));
		}
		return password;

    }

}
