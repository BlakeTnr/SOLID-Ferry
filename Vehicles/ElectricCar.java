package Vehicles;

import Vehicles.Parts.ElectricBattery;
import Vehicles.VehicleTypes.ElectricVehicle;
import Vehicles.VehicleTypes.Vehicle;

public class ElectricCar extends Vehicle implements ElectricVehicle {
    ElectricBattery electricBattery = new ElectricBattery();

    public ElectricCar(float fuelLevel) {
        this.cost = 1;
    }

    public ElectricBattery getElectricBattery() {
        return electricBattery;
    }

    public float getCost() {
        return cost;
    }
}
