class Hailstone{
    public static void main(String[] args){
        int n = Integer.parseInt(System.console().readLine());
        int count = 0;
        while(n != 1){
            if(n % 2 == 0){
                System.out.print(n + " is even, so i take half: " + n/2 + "\n");
                n = n / 2;
            }
            else{
                System.out.print(n + " is odd, so i make 3n + 1: " + (3*n + 1) + "\n");
                n = 3 * n + 1;
            }
            count++;
        }
        System.out.println("There are total " + count + " steps to reach 1");
    }
}