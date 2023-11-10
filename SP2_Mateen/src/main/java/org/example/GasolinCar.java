package org.example;

public class GasolinCar extends AFuelCar{

    public GasolinCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }

    public int getRegistrationFee(){
        int fee = 0;
        if (kmPrLitre >= 20)
            return fee = 330;
        else if (kmPrLitre >=15 && kmPrLitre <20)
            return fee = 1050;
        else if (kmPrLitre >=10 && kmPrLitre < 15)
            return fee = 2340;
        else if (kmPrLitre >= 5 && kmPrLitre < 10)
            return fee = 5500;
        else return fee = 10470;
    }

    @Override
    public String getFuelType(){
        return null;
    }

    @Override
    public String toString(){
        return super.toString() + "\nRegistrationFee: " + getRegistrationFee();
    }
}
