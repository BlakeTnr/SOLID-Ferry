package TerminalEmployee;

import Vehicles.Bus;
import Vehicles.*;

public class TerminalEmployeeLoading {
    TerminalEmployeeGassing gassing;
    TerminalEmployeeIncome income;

    public TerminalEmployeeLoading(TerminalEmployeeGassing gassing, TerminalEmployeeIncome income) {
        this.gassing = gassing;
        this.income = income;
    }

    public void loadVehicle(Vehicle vehicle) {
        gassing.gasUpIfLow(vehicle);
        income.payForVehicle(vehicle, 1);
        setVehicleFerryLocation(vehicle);
    }

    private void setVehicleFerryLocation(Vehicle vehicle) { // May violate SRP
        if (vehicle instanceof Truck || vehicle instanceof Bus) {
            vehicle.location.setLocation("Large ferry");
        } else {
            vehicle.location.setLocation("Small ferry");
        }
    }
}
