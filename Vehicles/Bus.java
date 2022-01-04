package Vehicles;

import Vehicles.Parts.*;
import Vehicles.VehicleTypes.GasVehicle;
import Vehicles.VehicleTypes.Vehicle;

public class Bus extends Vehicle implements GasVehicle {
    private GasTank gasTank = new GasTank();

    public Bus(float gasLevel) {
        this.cost = 5f;
    }

    public GasTank getGasTank() {
        return gasTank;
    }

    public float getCost() {
        return cost;
    }
}
