package Vehicles;

import Vehicles.Parts.*;
import Vehicles.VehicleTypes.ElectricVehicle;
import Vehicles.VehicleTypes.GasVehicle;
import Vehicles.VehicleTypes.Vehicle;

public class HybridCar extends Vehicle implements ElectricVehicle, GasVehicle {
    GasTank gasTank = new GasTank();
    ElectricBattery electricBattery = new ElectricBattery();

    public HybridCar(float fuelLevel) {
        this.cost = 2;
    }

    public GasTank getGasTank() {
        return gasTank;
    }

    public ElectricBattery getElectricBattery() {
        return electricBattery;
    }

    public float getCost() {
        return cost;
    }
}
