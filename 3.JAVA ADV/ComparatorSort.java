import java.util.ArrayList;
import java.util.Collections;
public class ComparatorSort implements Comparable<ComparatorSort>{

    String name;
    int rollNo;
    public ComparatorSort(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    public int compareTo(ComparatorSort o){
        if(this.name.compareTo(o.name) > 0)
            return 1;
        else if(this.name.compareTo(o.name) ==  0)
            return 0;
        else
            return -1;
    }
    public static void main(String[] args) {
        ArrayList<ComparatorSort> students = new ArrayList<>();
        students.add(new ComparatorSort(001, "Montek"));
        students.add(new ComparatorSort(002, "Kamal"));
        students.add(new ComparatorSort(003, "Akshit"));
        students.add(new ComparatorSort(004, "Amisha"));
        students.add(new ComparatorSort(005, "Bhupinder"));
        students.add(new ComparatorSort(006, "Manpreet"));

        // Sorting ArrayList using Comparator
        Collections.sort(students);

        System.out.println("Sorted ArrayList using Comparator according to their Names");
        for(ComparatorSort student : students){
            System.out.println(student.rollNo + " " + student.name);
        }
    }
}
