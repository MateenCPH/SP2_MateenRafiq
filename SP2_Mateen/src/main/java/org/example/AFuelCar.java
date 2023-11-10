package org.example;

public abstract class AFuelCar extends ACar{
    protected int kmPrLitre;


    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    public String getFuelType(){
        return null; //???
    }

    public int getKmPrLitre(){
        return kmPrLitre;
    }

    public String toString(){
        return super.toString() + "\nKm/l: " + getKmPrLitre();
    }

}
