package Vehicles;

import Vehicles.Parts.*;
import Vehicles.VehicleTypes.ElectricVehicle;
import Vehicles.VehicleTypes.GasVehicle;
import Vehicles.VehicleTypes.Vehicle;

public class HybridCar extends Vehicle implements ElectricVehicle, GasVehicle {
    GasTank gasTank = new GasTank();
    ElectricBattery electricBattery = new ElectricBattery();

    public HybridCar(float gasLevel, float batteryLevel) {
        this.cost = 2;
        gasTank.setGasLevel(gasLevel);
        electricBattery.setElectricityLevel(batteryLevel);
    }

    public boolean needsRefuelling() {
        boolean above50Gas = gasTank.getGasLevel() > 0.5f;
        boolean above50Electricity = electricBattery.getElectricityLevel() > 0.5f;
        return (!above50Gas && !above50Electricity);
    }

    public void refuel() {
        if (!(electricBattery.getElectricityLevel() > 0.5f)) {
            location.setLocation("Gas station");
            gasTank.setGasLevel(1f);
        }

        if (!(gasTank.getGasLevel() > 0.5f)) {
            location.setLocation("Battery recharge station");
            electricBattery.setElectricityLevel(1f);
        }
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
