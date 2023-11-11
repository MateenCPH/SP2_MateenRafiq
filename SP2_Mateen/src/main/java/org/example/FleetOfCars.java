package org.example;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class FleetOfCars {

    protected ArrayList<Car> fleet = new ArrayList<>();
    protected TextUI ui = new TextUI();
    protected FileIO io = new FileIO();


    public void setup() {
        readGasolineCars();
        readDieselCars();
        readElectricCars();

        for (Car car : fleet) {
            ui.displayMessage(car.toString());
        }

        getTotalRegistrationFeeForFleet();
        ui.displayMessage("\nTotal fee for all cars: " + getTotalRegistrationFeeForFleet());
    }

    public void addCar(Car c) {
        fleet.add(c);
    }

    public int getTotalRegistrationFeeForFleet() {
        int sumFee = 0;
        for (Car car : fleet) {
            sumFee += car.getRegistrationFee();
        }
        return sumFee;
    }

    public String toString() {
        return fleet.toString();
    }

    public void readGasolineCars() {
        ui.displayMessage("DISPLAYING ALL GASOLINE CARS:");
        ArrayList<String> data = io.readCarData("src/main/java/org/example/gasolinecars.csv");
        for (String s : data) {
            String[] row = s.split(",");
            String registrationNumber = row[0];
            String make = row[1];
            String model = row[2];
            int numberOfDoors = Integer.parseInt(row[3]);
            int kmPrLitre = Integer.parseInt(row[4]);
            GasolinCar g = new GasolinCar(registrationNumber, make, model, numberOfDoors, kmPrLitre);
            addCar(g);
        }
    }

    public void readDieselCars() {
        ui.displayMessage("DISPLAYING ALL DIESEL CARS:");
        ArrayList<String> data = io.readCarData("src/main/java/org/example/dieselcars.csv");
        for (String s : data) {
            String[] row = s.split(",");
            String registrationNumber = row[0];
            String make = row[1];
            String model = row[2];
            int numberOfDoors = Integer.parseInt(row[3]);
            int kmPrLitre = Integer.parseInt(row[4]);
            boolean particleFilter = Boolean.parseBoolean(row[5]);

            DieselCar d = new DieselCar(registrationNumber, make, model, numberOfDoors, kmPrLitre, particleFilter);
            addCar(d);
        }
    }

    public void readElectricCars() {
        ui.displayMessage("DISPLAYING ALL ELECTRIC CARS:");
        ArrayList<String> data = io.readCarData("src/main/java/org/example/electriccars.csv");
        for (String s : data) {
            String[] row = s.split(",");
            String registrationNumber = row[0];
            String make = row[1];
            String model = row[2];
            int numberOfDoors = Integer.parseInt(row[3]);
            int batteryCapacity = Integer.parseInt(row[4]);
            int maxRange = Integer.parseInt(row[5]);
            ElectricCar e = new ElectricCar(registrationNumber, make, model, numberOfDoors, batteryCapacity, maxRange);
            addCar(e);
        }
    }
}



