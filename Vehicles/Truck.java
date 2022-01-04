package Vehicles;

import Vehicles.Parts.*;
import Vehicles.VehicleTypes.GasVehicle;
import Vehicles.VehicleTypes.Vehicle;

public class Truck extends Vehicle implements CargoDoor, Inspectable, GasVehicle {
    private GasTank gasTank = new GasTank();
    private boolean isCargoDoorOpen = false;

    public Truck(float gasLevel) {
        this.cost = 6f;
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
