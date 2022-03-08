import java.util.*;
public class MaximumMarks {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Student student1 = new Student(1, "Akshit", "CSE", 90);
        students.add(student1);
        Student student2 = new Student(2, "Montek", "EC", 85);
        students.add(student2);
        Student student3 = new Student(3, "Amisha", "IT", 89);
        students.add(student3);
        Student student4 = new Student(4, "Kamal", "ME", 78);
        students.add(student4);

        Student topperStudent = getMaximumMarks(students);
        System.out.println("Topper Student Marks = " + topperStudent.displayMarks());
    }

    public static Student getMaximumMarks(ArrayList<Student> students) {
        // Sorts students in descending order based on marks.
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.marks - o1.marks;
            }
      });
      return students.get(0);
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

    public int displayMarks(){
        return marks;
    }
    
    
}