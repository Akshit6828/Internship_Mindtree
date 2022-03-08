import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class StudentMenu {
    public static void main(String[] args) {
        boolean inputAlive = true;
        
        // ArrayList of Student Objects
        
        List<Student> students = new ArrayList<Student>();
        
        while(inputAlive == true){
            System.out.print("Enter:\n1: To add student record.\n2: To display student record in sorted order based on branch (alphabetical order).\n3: Display Student ID in ascending sorted order.\n4 To exit: ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            
            switch(choice){
                case 1:
                    System.out.print("Enter Student Id: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Student Name: ");
                    String name = sc.next();
                    System.out.print("Enter Student Marks: ");
                    int marks = sc.nextInt();
                    System.out.print("Enter Student Branch: ");
                    String branch = sc.next();
                    Student student = new Student(id, name, branch, marks);
                    students.add(student);
                    student.display();
                    break;
                case 2:
                   // Student.displaySortedByBranch(students);
                    break;
                case 3:
                    //displaySortedById(students);
                    break;
                case 4:
                    System.exit(0);
                    inputAlive = false;
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}

class Student{
    int id, marks;
    String name, branch;

    Student(int id, String name, String branch, int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.branch = branch;
    }

    public  void display(){
        System.out.println("Student Details: \n - Name = " + this.name + "\n - Id = " + this.id + "\n - Marks = " + this.marks + "\n - Branch = " + this.branch);
    }
    
    public static void displaySortedByBranch(ArrayList<Student> students){

    }

    public static void displaySortedById(ArrayList<Student> students){

    }
}