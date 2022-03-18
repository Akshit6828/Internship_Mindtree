public class Usn3 {
    static void printRLE(String s) {
        String s1 = s.toLowerCase();
        for (int i = 0; i < s1.length(); i++) {
            int count = 1;
            while (i + 1 < s1.length() && s1.charAt(i) == s1.charAt(i
                    + 1)) {
                i++;
                count++;
            }
            System.out.print(s1.charAt(i) + "" + count + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        printRLE("aAbcccccaaA");
        printRLE("BBBBbbb");
    }

}
