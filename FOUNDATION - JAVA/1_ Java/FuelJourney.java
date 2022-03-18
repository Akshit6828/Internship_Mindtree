import java.io.Console;

class FuelJourney{
    public static void main(String args []) {
        int amountFuel = 0;
        Console console = System.console();

        int kilometers = Integer.valueOf(console.readLine("Enter the value of Kilometers"));

        char ch[] = console.readPassword("Enter your Password");
        String password = String.valueOf(ch);
        
        System.out.println("Password: "+ password);
        if(kilometers > 0){
            amountFuel = 100 * kilometers;
            if(amountFuel < 1500)
                amountFuel = 1500;
        }
        System.out.println(amountFuel);

    }
}