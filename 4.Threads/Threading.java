public class Threading extends Thread { 

    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Threading " + i);
        }
    }
    public static void main(String[] args) {
        
        System.out.println("Main thread");
        Threading t = new Threading();
        t.start();
        for(int i = 0; i < 10; i++) {
            System.out.println("Main " + i);
        }
    }
}