class Factorial{
    public static void main(String[] args){
        int n, fact = 1;
        n = Integer.parseInt(System.console().readLine());
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of the given number is " + fact);
    }
}