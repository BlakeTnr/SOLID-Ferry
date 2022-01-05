package Vehicles;

import Vehicles.Parts.*;
import Vehicles.VehicleTypes.GasVehicle;
import Vehicles.VehicleTypes.Vehicle;

public class Truck extends Vehicle implements CargoDoor, Inspectable, GasVehicle {
    private GasTank gasTank = new GasTank();
    private boolean isCargoDoorOpen = false;

    public Truck(float gasLevel) {
        this.cost = 6f;
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

    public boolean isCargoDoorOpen() {
        return this.isCargoDoorOpen;
    }

    public void setCargoDoorOpenState(boolean newCargoDoorOpenState) {
        this.isCargoDoorOpen = newCargoDoorOpenState;
    }

    public void sendForInspection() {
        location.setLocation("Customs inspection");
    }
}
