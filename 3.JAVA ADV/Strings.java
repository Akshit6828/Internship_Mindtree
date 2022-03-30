public class Strings {
    public static void main(String[] args) {
        String s1 = "java program";
        StringBuilder sb = new StringBuilder(s1);
        System.out.println("Length of s1: " + s1.length());
        System.out.println("Length of sb: " + sb.length());
        System.out.println("Substring from 2 to 5 is: " + s1.substring(2, 5));
        System.out.println("Substring from 2 to 5 is: " + sb.substring(2, 5));
    }
}
 