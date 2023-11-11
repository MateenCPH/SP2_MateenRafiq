package org.example;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class FleetOfCars {

    protected ArrayList<Car> fleet = new ArrayList<>();
    protected TextUI ui = new TextUI();
    protected FileIO io = new FileIO();


    public void setup() {
        //ElectricCar e = new ElectricCar("ABC123", "Tesla", "Model X", 5, 400, 500);
        //GasolinCar g = new GasolinCar("DJ91100", "BMW", "530i", 4, 17);
        //DieselCar d = new DieselCar("CA39513","Mercedes","E300",4,16,true);

        //addCar(e);
        //addCar(g);
        //addCar(d);

        ArrayList<String> data = io.readCarData("src/main/java/org/example/fuelcars.csv");
        for (String s : data){
            String[] row = s.split(",");

        }

            for (Car car : fleet) {
                ui.displayMessage(car.toString());
            }

        getTotalRegistrationFeeForFleet();
        ui.displayMessage("Total fee=" + getTotalRegistrationFeeForFleet());
    }

    public void addCar(Car car) {
        fleet.add(car);
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
}



