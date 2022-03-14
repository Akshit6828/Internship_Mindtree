public class SavingsAccount{
    double balance;
    int interestRate;
    int accountNo;

    public SavingsAccount(){}
    public SavingsAccount(double balance, int interestRate, int accountNo){
        this.balance = balance;
        this.interestRate = interestRate;
        this.accountNo = accountNo;
    }

    void withdraw(double amount){
        if(balance - amount < 0){
            System.out.println("Insufficient funds");
        }
        else{
            balance -= amount;
            System.out.println("Withdrawal successful");
        }
        
    }

    void calculateInterest(){
        System.out.println("Interest rate: " + interestRate + "%");
        balance += (balance * interestRate / 100);
        System.out.println("New balance: " + balance);
    }

    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount(1000, 5, 12345);
        SavingsAccount s2 = new SavingsAccount(2000, 10, 23456);
        SavingsAccount s3 = new SavingsAccount(3000, 15, 34567);
    
        s1.withdraw(100);
        s2.withdraw(3000);
        s3.withdraw(300);
    
        s1.calculateInterest();
        s2.calculateInterest();
        s3.calculateInterest();
    
        System.out.println("Account No.\tBalance\tInterest Rate");
        System.out.println(s1.accountNo + "\t\t" + s1.balance + "\t\t" + s1.interestRate);
        System.out.println(s2.accountNo + "\t\t" + s2.balance + "\t\t" + s2.interestRate);
        System.out.println(s3.accountNo + "\t\t" + s3.balance + "\t\t" + s3.interestRate);    
    }
}

