package TerminalEmployee;

import Vehicles.VehicleTypes.Vehicle;

public class TerminalEmployeeRefueling {
    public void refuelUpIfLow(Vehicle vehicle) {
        if (vehicle.needsRefuelling()) {
            vehicle.refuel();
        }
    }
}
