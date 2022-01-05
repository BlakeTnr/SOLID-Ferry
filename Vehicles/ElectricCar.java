package Vehicles;

import Vehicles.Parts.ElectricBattery;
import Vehicles.VehicleTypes.ElectricVehicle;
import Vehicles.VehicleTypes.Vehicle;

public class ElectricCar extends Vehicle implements ElectricVehicle {
    ElectricBattery electricBattery = new ElectricBattery();

    public ElectricCar(float batteryLevel) {
        this.cost = 1;
        electricBattery.setElectricityLevel(batteryLevel);
    }

    public boolean needsRefuelling() {
        return electricBattery.getElectricityLevel() < 0.1f;
    }

    public void refuel() {
        location.setLocation("Battery recharge station");
        electricBattery.setElectricityLevel(1f);
    }

    public ElectricBattery getElectricBattery() {
        return electricBattery;
    }

    public float getCost() {
        return cost;
    }
}
