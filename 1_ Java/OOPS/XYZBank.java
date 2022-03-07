
public class XYZBank {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1001, "Kumar", "Rajajinagar, Banglore - 10");
        Customer customer2 = new Customer(1002, "Raja");
        Customer customer3 = new Customer(1003, "Sthis.hanthi", "Jayanagar, Banglore - 20", "SB", 1500);

        System.out.println("Customer Details are:");
        System.out.println("Customer 1:\n"+ customer1.getDetails());
        System.out.println("Customer 2:\n"+ customer2.getDetails());
        System.out.println("Customer 3:\n"+ customer3.getDetails());
    }
}

class Customer {

    private int custId;
    private String custName, custAddress, accType;
    private double custBalance;

    public String getDetails() {
        return "Customer Id: " + this.custId + ", Customer Name:" + this.custName + ", Customer Address: "
                + this.custAddress + ", Customer Account Type: " + this.accType + ", Customer Balance: "
                + this.custBalance;
    }


    Customer(int custId, String custName, String custAddress, String accType, double custBalance) {
        this.custId = custId;
        this.custName = custName;
        this.custAddress = custAddress;
        this.accType = accType;
        this.custBalance = custBalance;
    }

    Customer(int custId, String custName, String custAddress) {
        this.custId = custId;
        this.custName = custName;
        this.custAddress = custAddress;
    }

    Customer(int custId, String custName) {
        this.custId = custId;
        this.custName = custName;
    }
}
