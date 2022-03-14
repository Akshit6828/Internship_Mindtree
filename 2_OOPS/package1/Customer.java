package package1;

import java.util.Scanner;

public class Customer{
    private long id;
    private String name;
    private char gender;
    private String email;
    private String contactNumber;

    @Override
    public String toString(){
        return "Customer contact details:" + contactNumber +","+ email;
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
            Customer c1 = new Customer();
            System.out.println("Enter Customer Details:");
            System.out.print("ID : ");
            long id = sc.nextLong();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Gender: ");
            char gender = sc.next().charAt(0);
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Contact Number: ");
            String contactNumber = sc.next();
    
            sc.close();
    
            c1.setId(id);
            c1.setName(name);
            c1.setGender(gender);
            c1.setEmail(email);
            c1.setContactNumber(contactNumber);
    
            System.out.println("Customer Id: " + c1.getId());
            System.out.println("Customer Name: " + c1.getName());
            System.out.println(c1.toString());
    
        }
}

