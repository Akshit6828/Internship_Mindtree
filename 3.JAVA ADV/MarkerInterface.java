import java.lang.Cloneable;

class A implements Cloneable {
    int i;
    String s;

    public A(int i, String s) {
        this.i = i;
        this.s = s;
    }

    // Overriding clone() method by simply calling Object class clone() method.
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class MarkerInterface {
    public static void main(String[] args) throws CloneNotSupportedException {
        
        A a = new A(20, "Akshit");

        // cloning 'a' and holding new cloned object reference in obj
        // down-casting as clone() return type is Object

        A obj = (A) a.clone();

        System.out.println(obj.i);
        System.out.println(obj.s);
    }
}
