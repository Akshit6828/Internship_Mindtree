// Scenerio is : Multiple Threads(Employees) Working on Same Printer Objects.
// Result:It makes a problem because of Ambigious Printer Object, thus it makes
class Printer{
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
        mRef.printDocuments("Akshit", 10);
    }

}

class Emp2 extends Thread{
    Printer mRef;

    Emp2(Printer p){
        mRef = p;
    }

    public void run(){
        mRef.printDocuments("Amisha", 10);
    }
}

public class AmbigiousPrinter{
    public static void main(String[] args) {
       System.out.println(" ----- App Started ---- "); 

       // Calling Printer in the background to print copies:
       
       
       Printer printer = new Printer();
       Emp1 obj = new Emp1(printer);
       obj.start();


       Emp2 obj2 = new Emp2(printer); // Emp2 using the same printer.
         obj2.start();
       
       System.out.println(" ---- App Finished ---- ");
    }
}