package package3;

import java.util.Scanner;

public class Car {
    private String licencenumber;
    private String model;
    private double currentMilege;
    private int enginesize;

    public String getLicencenumber() {
        return this.licencenumber;
    }

    public void setLicencenumber(String licencenumber) {
        this.licencenumber = licencenumber;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCurrentMilege() {
        return this.currentMilege;
    }

    public void setCurrentMilege(double currentMilege) {
        this.currentMilege = currentMilege;
    }

    public int getEnginesize() {
        return this.enginesize;
    }

    public void setEnginesize(int enginesize) {
        this.enginesize = enginesize;
    }

    public void printCar() {
        System.out.println("Licence number: " + licencenumber);
        System.out.println("Model: " + model);
        System.out.println("Current mileage: " + currentMilege);
        System.out.println("Engine size: " + enginesize);
    }
}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of cars");
        int n = sc.nextInt();
        Car[] cars = new Car[n];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
            System.out.println("Enter Car" + (i + 1) + " Details:");
            System.out.print("Model : ");
            cars[i].setModel(sc.next());
            sc.nextLine();
            System.out.print("Current Milage : ");
            cars[i].setCurrentMilege(sc.nextDouble());
            System.out.print("Engine Size : ");
            cars[i].setEnginesize(sc.nextInt());
            System.out.print("License No : ");
            cars[i].setLicencenumber(sc.next());
            
        }
        sc.close();
        for (int i = 0; i < cars.length; i++) {
            System.out.println("\n---------------------------------");
            System.out.println("\n\nCar " + (i + 1) + " Details are:");
            cars[i].printCar();
            System.out.println("---------------------------------");
        }
    }

}
