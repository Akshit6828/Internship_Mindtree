package package5;

import java.util.ArrayList;
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

    // Function to sort array of cars by model
    public static Car[] sortByModel(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getModel().compareTo(cars[j].getModel()) > 0) {
                    Car temp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = temp;
                }
            }
        }
        return cars;
    }
}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of cars: ");
        int n = sc.nextInt();
        Car[] cars = new Car[n];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
            System.out.println("Enter Car" + (i + 1) + " Model, CurrentMilage, Engine Size, License No:");
            cars[i].setModel(sc.next());
            cars[i].setCurrentMilege(sc.nextDouble());
            cars[i].setEnginesize(sc.nextInt());
            cars[i].setLicencenumber(sc.next());
            
        }
        
        Car[] resulantCars = Car.sortByModel(cars);
        sc.close();
        
        for (Car car : resulantCars) {
            System.out.println("\n---------------------------------");
            car.printCar();
            System.out.println("---------------------------------");
        }
    }

}



