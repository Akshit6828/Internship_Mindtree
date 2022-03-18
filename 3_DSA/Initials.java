import java.util.*;

class Initials {
    static void printInitials(String name) {
        if (name.length() == 0)
            return;
        String words[] = name.split(" ");

        if (words.length == 1) { // For Case: AkshitMangotra
            for (int i = 0; i < words[0].length(); i++) {
                if (words[0].charAt(i) >= 'A' && words[0].charAt(i) <= 'Z') {
                    System.out.print(words[0].charAt(i));
                }
            }
        } else { // For case: Akshit Mangotra
            for (String word : words) {
                System.out.print(Character.toUpperCase(word.charAt(0)));
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        printInitials(name);
        sc.close();
    }
}
