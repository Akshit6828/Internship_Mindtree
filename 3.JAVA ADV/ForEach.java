import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.forEach(ind -> System.out.println(ind+10));

        // Lambas with forEach and long logic.
        list.forEach(ind -> 
        {
            if(ind%2 == 0) 
                System.out.println(ind+10);
        }
        );
    }
}
