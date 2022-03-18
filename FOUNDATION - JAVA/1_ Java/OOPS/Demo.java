public class Demo {
    public static void main(String[] args) {
        Student student1 = new Student(6828, "Akshit Mangotra", false);
        student1.indentifyMarks(95);
        System.out.println("Student 1 DETAILS: \n - Name = " + student1.getStudentName() + "\n - Id = " + student1.getStudentId() + "\n - Marks = " + student1.getMarks() + "\n - Is Second Chance = " + student1.isSecondChance());

        Student student2 = new Student(2093, "Amisha Sahu", true);
        student2.indentifyMarks(88, 90);
        System.out.println("Student 2 DETAILS: \n - Name = " + student2.getStudentName() + "\n - Id = " + student2.getStudentId() + "\n - Marks = " + student2.getMarks() + "\n - Is Second Chance = " + student2.isSecondChance());
    }
}


class Student{
    private int studentId;
    private String studentName;
    private float marks;
    private boolean secondChance;

    // Method overloading
    public void indentifyMarks(float marks){
        this.marks = marks;
        this.secondChance = false;
    }

    public void indentifyMarks(float marks1, float marks2){
        this.marks = Math.max(marks1, marks2);
        this.secondChance = true;
    }

    //Constructor
    Student(int studentId, String studentName, boolean secondChance) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.secondChance = secondChance;
    }
    // Getters and Setters
    public int getStudentId() {
        return this.studentId;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public float getMarks() {
        return this.marks;
    }

    public boolean isSecondChance() {
        return this.secondChance;
    }

}

