import java.util.*;
public class Compare implements Comparator<Compare> {
    String name;
    String city;

    public Compare() {}
    public Compare(String name, String city) {
        this.name = name;
        this.city = city;
    }
    public int compare(Compare a, Compare b){
        if(a.city.compareTo(b.city) >= 0)
            return 1;
        return -1;
    }
    public static void main(String[] args) {
    
        ArrayList<Compare> arr = new ArrayList<>();
        arr.add( new Compare("Akshit", "Bathinda"));
        arr.add( new Compare("Monty", "Ludhiana"));
        arr.add( new Compare("Amisha", "Jaunpur"));
        arr.add( new Compare("Kamal", "Malout"));
        arr.add( new Compare("Bhupinder", "Goniana"));
        arr.add( new Compare("Manpreet", "Giddarbaha"));
        
        System.out.println("---- BEFORE SORTING ----");
        for(Compare a : arr)
            System.out.println(a.name + " - " + a.city);
        Compare obj = new Compare();
        arr.sort(obj);

        System.out.println("---- AFTER SORTING BY THEIR CITY NAMES ----");
        for(Compare student : arr){
            System.out.println(student.name + " - " + student.city);
        }
    }
}

