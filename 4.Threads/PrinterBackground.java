class Printer{
    void printDocuments(String author, int noOfCopies){
        Thread obj = Thread.currentThread();
        for(int i = 0; i < noOfCopies; i++){
            System.out.println("Printing Copy no: " + (i + 1) + " of Author: " + author);
            System.out.println("Current Thread in printingDocuments() is = " + obj.getName());
        }
    }
}

class ThreadManager extends Thread{
    Printer mRef;

    ThreadManager(Printer p){
        mRef = p;
    }

    public void run(){
        // This run() is called by Main thread
        // and this further calls the Printer printDocuments thread in the background from another Thread.
        Thread obj = Thread.currentThread();
        System.out.println("Current Thread in run() = " + obj.getName());
        mRef.printDocuments("Akshit", 10); 
    }

}

public class PrinterBackground {
    public static void main(String[] args) {
        System.out.println(" ----- App Started ---- "); 
        Thread objT = Thread.currentThread();
        System.out.println("Current Thread in MAIN() = " + objT.getName());
       // Calling Printer in the background to print copies:
       Printer objP = new Printer();
       ThreadManager obj = new ThreadManager(objP);
       obj.start();

       System.out.println(" ---- App Finished ---- ");
    }
}
