public class Table {
    public static void main(String[] args) {
        int n, result = 1;
        n = Integer.parseInt(System.console().readLine());
        for (int i = 1; i <= 12; i++) {
            result = i * n;
            System.out.println(n + " x " + i + " = " + result);
        }
    }    
}
