package TerminalEmployee;

import Vehicles.*;

public class TerminalEmployeeGassing {
    public void gasUpIfLow(Vehicle vehicle) {
        if (vehicle.getGasLevel() <= 0.1f) {
            gasUp(vehicle);
        }
    }

    public void gasUp(Vehicle vehicle) {
        vehicle.setLocation("Gas station");
        vehicle.setGasLevel(1f);
    }
}
