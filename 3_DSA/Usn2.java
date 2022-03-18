public class Usn2 {
    static String reverseWords(String inputString) {
        String[] words = inputString.split(" ");
        String reverseString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reverseString = reverseString + reverseWord + " ";
        }
        return reverseString;
    }

    public static void main(String[] args) {
        String str1 = "1 cup of hot coffee costs 8.00, whereas cold coffee costs 45.00.";
        System.out.println(reverseWords(str1));
        String str2 = "It Costs 25000rs for 1 LCD Projector.";
        System.out.println(reverseWords(str2));
        String str3 = "8990.33";
        System.out.println(reverseWords(str3));
    }

}
