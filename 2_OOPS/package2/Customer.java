package package2;

import java.util.Scanner;

public class Customer {
    private long id;
    private String name;
    private char gender;
    private String email;
    private String contactNumber;

    // Constructors
    public Customer() {
    }

    public Customer(long id, String name, char gender, String email, String contactNumber) {
        this.contactNumber = contactNumber;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }

        /*
         * Check if o is an instance of Customer or not "null instanceof [type]" also
         * returns false
         */
        if (!(o instanceof Customer)) {
            return false;
        }

        // Typecast o to Complex so that we can compare data members
        Customer c = (Customer) o;

        // Compare the data members and return accordingly
        return email.equals(c.email) && contactNumber.equals(c.contactNumber);
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return this.contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customer[] customers = new Customer[2];
        for (int i = 0; i < customers.length; i++) {
            customers[i] = new Customer();
            System.out.println("Enter Customer" + (i + 1) + " Details:");
            System.out.print("ID : ");
            customers[i].setId(sc.nextLong());
            System.out.print("Name : ");
            customers[i].setName(sc.nextLine());
            sc.nextLine();
            System.out.print("Gender : ");
            customers[i].setGender(sc.next().charAt(0));
            System.out.print("Email : ");
            customers[i].setEmail(sc.nextLine());
            sc.nextLine();
            System.out.print("Contact Number : ");
            customers[i].setContactNumber(sc.nextLine());
        }
        sc.close();
        Customer c1 = customers[0];
        Customer c2 = customers[1];

        if (c1.equals(c2)) {
            System.out.println("Both Customers are same");
        } else {
            System.out.println("Customer 1  and Customer 2 are different");
        }
    }
}



