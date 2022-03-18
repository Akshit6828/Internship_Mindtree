package package4;

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

    ArrayList<Car> findCarList(Car[] cars, String model) {
        ArrayList<Car> carList = new ArrayList<Car>();

        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getModel().equals(model)) {
                carList.add(cars[i]);
            }
        }
        return carList;
    }
}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car[] cars = new Car[10];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
            System.out.println("Enter Car" + (i + 1) + " Model, CurrentMilage, Engine Size, License No:");
        
            cars[i].setModel(sc.next());
          
            cars[i].setCurrentMilege(sc.nextDouble());
     
            cars[i].setEnginesize(sc.nextInt());
          
            cars[i].setLicencenumber(sc.next());
            
        }
        System.out.println("Enter Model to find:");
        String model = sc.next();
        ArrayList<Car> resulantCars = new Car().findCarList(cars, model);
        sc.close();
        if(resulantCars.size()==0){
            System.out.println("No car found");
        }
        else{
            for (Car car : resulantCars) {
                System.out.println("\n---------------------------------");
                car.printCar();
                System.out.println("---------------------------------");
            }
        }
    }

}

/*
Input
Audi 60 100 PB1
BMW 40 100 PB2
Chevrolet 50 100 PB3
Discover 40 100 PB4
Audi 45 110 PB5
BMW 40 100 PB6
Chevrolet 50 100 PB7
Discover 40 100 PB8
Audi 55 120 PB9
BMW 40 100 PB10
*/




