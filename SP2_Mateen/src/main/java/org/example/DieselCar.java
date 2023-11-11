package org.example;

public class DieselCar extends AFuelCar {
    protected boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
    }

    public boolean hasParticleFilter() {
        return particleFilter;
    }

    public int getRegistrationFee() {
        int fee = 0;
        int particleFee = 1000;

        if (getKmPrLitre() >= 20 && getKmPrLitre() <= 50) {
            fee = 330 + 130;
        } else if (getKmPrLitre() >= 15 && getKmPrLitre() <= 20) {
            fee = 1050 + 1390;
        } else if (getKmPrLitre() >= 10 && getKmPrLitre() <= 15) {
            fee = 2340 + 1850;
        } else if (getKmPrLitre() >= 5 && getKmPrLitre() <= 10) {
            fee = 10470 + 2770;
        } else {
            fee = 10470 + 15260;
        }

        if (particleFilter) {
            return fee;
        } else {
            return fee + particleFee;
        }

    }

    public String getFuelType() {
        return "Diesel";
    }

    @Override
    public String toString() {
        return super.toString() + "\nFueltype: " + getFuelType() + " | Registration fee: " + getRegistrationFee() + " | Has particlefilter?: " + hasParticleFilter();
    }
}
