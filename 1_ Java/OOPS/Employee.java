package OOPS;

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
            System.out.println("Name cannot be Null");        
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
        this.empDept = empDept;
    }

    public String getempDesig() {
        return empDesig;
    }

    public void setempDesig(String empDesig) {
        this.empDesig = empDesig;
    }

    public Employee() {
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();
        e.setempName("AKKI");
       /* e.setempId(1074);
        e.setempDept("IT");
        e.setempDesig("SDE");
        System.out.println(e.getempName());
        System.out.println(e.getempId());
        System.out.println(e.getempDept());
        System.out.println(e.getempDesig());*/
        sc.close();
    }
}
