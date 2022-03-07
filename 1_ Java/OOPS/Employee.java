import java.util.Scanner;


public class Employee {

    public String empName;
    public int empId;
    public String empDept;
    public String empDesig;

    public Employee(int empId, String empName, String empDept, String empDesig) {
        this.empName = empName;
        this.empId = empId;
        this.empDept = empDept;
        this.empDesig = empDesig;
    }

    public String getempName() {
        return empName;
    }

    public void setempName(String empName) {
        if(empName == null)
            System.out.println("Name cannot be NULL. Invalid Input!");
        else
        this.empName = empName;
    }

    public int getempId() {
        return empId;
    }

    public void setempId(int empId) {
        this.empId = empId;
    }

    public String getempDept() {
        return empDept;
    }

    public void setempDept(String empDept) {
        if(empDept !=null && ( empDept.equals("TTH") || empDept.equals("RCM") || empDept.equals("DevOps") || empDept.equals("Digital") ))
            this.empDept = empDept;
        else
            System.out.println("Invalid Department!");
    }

    public String getempDesig() {
        return empDesig;
    }

    public void setempDesig(String empDesig) {
        if(empDesig!=null && (empDesig.equals("Lead") || empDesig.equals("Manager") || empDesig.equals("Developer") || empDesig.equals("Tester") ))
            this.empDesig = empDesig;
        else
            System.out.println("Invalid Designation!");

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee(6828, "Akshit", "Digital" , "Lead");
        if(e1 ==null)
            System.out.println("Employee object is null. Cannot set name for it");
        else{
        System.out.println(e1.getempName());
        System.out.println(e1.getempId());
        System.out.println(e1.getempDept());
        System.out.println(e1.getempDesig());
        }
        sc.close();
    }
}
