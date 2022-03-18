import java.util.*;

public class SwapNames {

    public static void swapLastNames(String person1, String person2){
        String[] name1 = person1.split(" ");
        String[] name2 = person2.split(" ");
        String temp1 = name1[name1.length - 1];
        String temp2 = name2[name2.length - 1];

        if(!temp1.equals(temp2)){
            System.out.println("The last names are the same! Sorry Cant Marry");
            name2[name2.length-1] = temp1;
            name1[name1.length-1] = temp2;
        }
        System.out.println("The new names are: ");
        System.out.println(name1[0] + " " + name1[1]);
        System.out.println(name2[0] + " " + name2[1]);
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();
        swapLastNames(name1, name2);
        sc.close();

    }
}
