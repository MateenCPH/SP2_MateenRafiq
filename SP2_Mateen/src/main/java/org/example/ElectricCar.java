package org.example;

public class ElectricCar extends ACar{
    protected int batteryCapacity;
    protected int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    public int getBatteryCapacityKWh(){
        return batteryCapacity;
    }

    public int getMaxRange(){
        return maxRange;
    }

    public int getWhPrKm(){
        return batteryCapacity*1000/maxRange;
    }

    public int getKmPrL(){
        return (int) Math.floor(100/(getWhPrKm()/91.25));
    }

    public int getRegistrationFee(){
        int fee = 0;
        if (getKmPrL() >= 20)
            return fee = 330;
        else if (getKmPrL() >=15 && getKmPrL() <20)
            return fee = 1050;
        else if (getKmPrL() >=10 && getKmPrL() < 15)
            return fee = 2340;
        else if (getKmPrL() >= 5 && getKmPrL() < 10)
            return fee = 5500;

        else return fee = 10470;
    }

    public String toString(){
        return super.toString() + "\nBattery capacity in KWh: " + getBatteryCapacityKWh() + " | Max range in km: " + getMaxRange() + " | RegistrationFee: " + getRegistrationFee();
    }
}
