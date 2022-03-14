package package6;

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

    // Function to return cars that have more than current Mileage and engine Size(both) for the given current Mileage & engine Size values.
    public static Car[] getCars(Car[] cars, double currentMilege, int enginesize) {
        ArrayList<Car> carList = new ArrayList<Car>();
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getCurrentMilege() > currentMilege && cars[i].getEnginesize() > enginesize) {
                carList.add(cars[i]);
            }
        }
        Car[] carArray = new Car[carList.size()];
        for (int i = 0; i < carArray.length; i++) {
            carArray[i] = carList.get(i);
        }
        return carArray;
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
        System.out.println("Enter current Mileage and Engine Size: ");
        double currentMilege = sc.nextDouble();
        int enginesize = sc.nextInt();
        
        Car[] resulantCars = Car.getCars(cars, currentMilege, enginesize);
        sc.close();
        
        for (Car car : resulantCars) {
            System.out.println("\n---------------------------------");
            car.printCar();
            System.out.println("---------------------------------");
        }
    }

}



/*
Output:
Enter Car1 Model, CurrentMilage, Engine Size, License No:
Audi 60 100 PB1
Enter Car2 Model, CurrentMilage, Engine Size, License No:
BMW 40 100 PB2
Enter Car3 Model, CurrentMilage, Engine Size, License No:
Chevrolet 50 100 PB3
Enter Car4 Model, CurrentMilage, Engine Size, License No:
Discover 40 100 PB4
Enter Car5 Model, CurrentMilage, Engine Size, License No:
Audi 45 110 PB5
Enter Car6 Model, CurrentMilage, Engine Size, License No:
BMW 40 100 PB6
Enter Car7 Model, CurrentMilage, Engine Size, License No:
Chevrolet 50 100 PB7
Enter Car8 Model, CurrentMilage, Engine Size, License No:
Discover 40 100 PB8
Enter Car9 Model, CurrentMilage, Engine Size, License No:
Audi 55 120 PB9
Enter Car10 Model, CurrentMilage, Engine Size, License No:
BMW 40 100 PB10
Enter current Mileage and Engine Size: 
50 100

---------------------------------
Licence number: PB9
Model: Audi
Current mileage: 55.0
Engine size: 120
---------------------------------
*/