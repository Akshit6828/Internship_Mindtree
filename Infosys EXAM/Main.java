
public class Main{
    
    
}


/*
    String[] values = {"9a4b x", "3a z", "a","1a2b3c "};
        int c = 0;
        for(String value : values){
            if(value.matches("(\\d[a-z])+\\s\\w?")){
                c++;
            }
        }
        System.out.println(c);

----------------------------------------------------------------
FileOutputStream fos = new FileOutputStream("D:/output.txt");
        String data = "Learning";
        fos.write(data.getBytes());
        fos.close();
        fos = new FileOutputStream("D:/output.txt");
        data = "Java is really fun!";
        fos.write(data.getBytes());
        fos.close();     

----------------------------------------------------------------

class MyThread implements Runnable{

    public MyThread() {
       System.out.println("New Thread is Created");
    }

    @Override
    public void run() {
        try {
            System.out.println("Am from MyThread...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}


    ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            MyThread t1 = new MyThread();
            executor.execute(t1);
        }

        System.out.println("Maximum threads inside pool " + executor.getMaximumPoolSize());
        executor.shutdown();

----------------------------------------------------------------
class SynchronizedExample extends Thread{
    synchronized public void run(){
        System.out.println("Start");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End");
    }
}

     new SynchronizedExample().start();
    new SynchronizedExample().start();

----------------------------------------------------------------

class Product implements Comparable<Product> {
    String id;
    double price;

    Product(){}
    
    Product(String n, double a) {
        id = n;
        price = a;
    }

    public int compareTo(Product p) {
        if (this.price  ==  p.price) {
            return 0;
        } else if (this.price > p.price) {
            return 1;
        } else {
            return -1;
        }
    }

}
 List<Product> list = new ArrayList<Product>();
       list.add(new Product("Shawl",300.00));
       list.add(new Product("Linen",255.00));
       list.add(new Product("Roger",100.00));
       list.add(new Product("Tommy",450.00));
       list.add(new Product("Tammy",175.00));

       Collections.sort(list);
        for(Product p : list){
            System.out.println(p.id + " " + p.price+",");
        }

----------------------------------------------------------------
Pattern p = Pattern.compile("M+",5);
      Matcher m = p.matcher("M Merit Match MM m mM");
        while(m.find()){
            System.out.print(m.group() + " ");
        }

----------------------------------------------------------------
class Employee{
    String name;
}
int salary;

    Main(int salary, String name){
        super.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) throws IOException{
        Main cemp = new Main(1000,"Sam");
        FileOutputStream fos = new FileOutputStream("D:/serial.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(cemp);

        FileInputStream fis = new FileInputStream("D:/serial.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        cemp = (Main) ois.readObject();
        System.out.println(cemp);
 
    }

    public String toString(){
        return super.name+" Salary: "+salary;
    }
 */