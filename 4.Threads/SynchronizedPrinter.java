// Scenerio is : Multiple Threads(Employees) Working on Same Printer Objects.
// Result:It makes a problem because of Ambigious Printer Object, thus it makes
class Printer{
    // Synchronized method: Makes lock on object of printer
    // 1) --> synchronized void printDocuments(String author, int noOfCopies){
    void printDocuments(String author, int noOfCopies){
        for(int i = 0; i < noOfCopies; i++){
            System.out.println("Printing Copy no: " + (i + 1) + " of Author: " + author);
        }
    }
}

class Emp1 extends Thread{
    Printer mRef;

    Emp1(Printer p){
        mRef = p;
    }

    public void run(){
        // 2--> Synchronized block: Makes lock on object of printer
        synchronized(mRef){
        mRef.printDocuments("Akshit", 10);
        }
    }

}

class Emp2 extends Thread{
    Printer mRef;

    Emp2(Printer p){
        mRef = p;
    }

    public void run(){
        // 2--> Synchronized block: Makes lock on object of printer
        synchronized(mRef){
        mRef.printDocuments("Amisha Sahu", 10);
        }
    }
}

public class SynchronizedPrinter{
    public static void main(String[] args) {
       System.out.println(" ----- App Started ---- "); 

       // Calling Printer in the background to print copies:
       
       
       Printer printer = new Printer();
       Emp1 obj = new Emp1(printer);
       obj.start();
       
       // Solution 1: Using join() method before starting Emp2 so it will wait for Emp1 to finish:
       // Drawback: we cannot put join on each method if there are many Emp's to finish.
       
       /*
       try{
       obj.join(); // Waiting for Emp1 to finish
       }
       catch(Exception e){
              System.out.println(e);
       }
       */
       Emp2 obj2 = new Emp2(printer); // Emp2 using the same printer.
       obj2.start();

       // Solution 2: Using synchronized keyword on Printer class method:
       // By this: it acquires an intrisic lock on the Printer object. 
       // So no other thread can acquire the lock on the same object.
       // This is called as a "Synchronized Method".

       System.out.println(" ---- App Finished ---- ");
    }
}
