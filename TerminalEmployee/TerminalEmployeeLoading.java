package TerminalEmployee;

import Vehicles.*;
import Vehicles.VehicleTypes.Vehicle;

public class TerminalEmployeeLoading {
    TerminalEmployeeRefueling gassing;
    TerminalEmployeeIncome income;

    public TerminalEmployeeLoading(TerminalEmployeeRefueling gassing, TerminalEmployeeIncome income) {
        this.gassing = gassing;
        this.income = income;
    }

    public void loadVehicle(Vehicle vehicle) {
        gassing.refuelUpIfLow(vehicle);
        income.payForVehicle(vehicle, 1);
        setVehicleFerryLocation(vehicle);
    }

    private void setVehicleFerryLocation(Vehicle vehicle) { // May violate SRP
        if (vehicle instanceof Truck || vehicle instanceof Bus) {
            vehicle.location.setLocation("Large ferry");
        } else if (vehicle instanceof HybridCar || vehicle instanceof ElectricCar) {
            vehicle.location.setLocation("Electric car ferry");
        } else {
            vehicle.location.setLocation("Small ferry");
        }
    }
}
