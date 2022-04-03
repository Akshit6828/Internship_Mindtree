class Threading implements Runnable{
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Threading " + i);
        }
    }
}

public class InterfaceRunnable {
    public static void main(String[] args) {
        Runnable t = new Threading();
        Thread thread1 = new Thread(t);
        thread1.start();
        
        for(int i = 0; i < 10; i++) {
            System.out.println("Main " + i);
        }
    }
}
