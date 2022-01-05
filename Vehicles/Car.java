package Vehicles;

import Vehicles.Parts.*;
import Vehicles.VehicleTypes.GasVehicle;
import Vehicles.VehicleTypes.Vehicle;

public class Car extends Vehicle implements GasVehicle {
    private GasTank gasTank = new GasTank();

    public Car(float gasLevel) {
        this.cost = 3f;
        gasTank.setGasLevel(gasLevel);
    }

    public boolean needsRefuelling() {
        return gasTank.getGasLevel() < 0.1f;
    }

    public void refuel() {
        location.setLocation("Gas station");
        gasTank.setGasLevel(1f);
    }

    public GasTank getGasTank() {
        return gasTank;
    }

    public float getCost() {
        return cost;
    }
}
