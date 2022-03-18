package package8;
import java.util.Scanner;
import java.util.ArrayList;
class Customer1 {
    private String name;
    private String mobileNo;
    private double feedbackRating;

    public Customer1(String name, String mobileNo, double feedbackRating){
        this.name = name;
        this.mobileNo = mobileNo;
        this.feedbackRating = feedbackRating;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
            this.name = name;
    }
    public String getMobileNo(){
        return mobileNo;
    }
    public void setMobileNo(String mobileNo){
        this.mobileNo = mobileNo;
    }
    public double getFeedbackRating(){
        return feedbackRating;
    }
    public void setFeedbackRating(double feedbackRating){
        this.feedbackRating = feedbackRating;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of customers: ");
        int N = sc.nextInt();

        ArrayList<Customer1> customers = new ArrayList<>(N);
        for(int i = 0; i < N; i++)
        {
            System.out.print("Enter name: ");
            String name = sc.next();
            System.out.print("Enter mobile no: ");
            String mobile = sc.next();
            System.out.print("Enter feedback rating: ");
            double rating = sc.nextDouble();
            Customer1 c1 = new Customer1(name, mobile, rating);
            customers.add(c1);
        }
        sc.close();
        for(Customer1 c: customers){
            System.out.println(c.getName()+": "+ c.getFeedbackRating()+" out of 5");
        }

    }
}