import java.util.*;

public class usn {

    public static boolean isValidUSN(char[] ch) {
        int l = ch.length;
        if (l == 10 && (ch[0] >= 48 && ch[0] <= 57 &&
                (ch[0] == '1' || ch[0] == '2') &&
                Character.isUpperCase(ch[1]) && Character.isUpperCase(ch[2]) &&
                ch[3] >= '0' && ch[3] <= '9' && ch[4] >= '0' && ch[4] <= '9' &&
                Character.isUpperCase(ch[5]) && Character.isUpperCase(ch[6]) &&
                (ch[5] == 'C' && ch[6] == 'S') && ch[7] >= '0' && ch[7] <= '9' &&
                ch[8] >= '0' && ch[8] <= '9' && ch[9] >= '0' && ch[9] <= '9'))

            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        int l = s.length();
        char[] ch = new char[l];
        for (int i = 0; i < l; i++) {
            ch[i] = s.charAt(i);
        }
        if(isValidUSN(ch){
            System.out.println("Succes");
        } else {
            System.out.println("Failure");
        }
    }
}
