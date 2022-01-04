package TerminalEmployee;

import Vehicles.*;

public class TerminalEmployeeGassing {
    public void gasUpIfLow(Vehicle vehicle) {
        if (vehicle.gas.getGasLevel() <= 0.1f) {
            gasUp(vehicle);
        }
    }

    public void gasUp(Vehicle vehicle) {
        vehicle.location.setLocation("Gas station");
        vehicle.gas.setGasLevel(1f);
    }
}
