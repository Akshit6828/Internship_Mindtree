public class ImplementInterface implements SampleInterface {

    public void printMessage() {
        System.out.println("Hey There! I am a method coming from interface");
    }

    public static void main(String[] args) {
        ImplementInterface obj = new ImplementInterface();
        obj.printMessage();
    }
}
