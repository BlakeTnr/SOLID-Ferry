package TerminalEmployee;

import Vehicles.*;
import Vehicles.VehicleTypes.GasVehicle;
import Vehicles.VehicleTypes.Vehicle;

public class TerminalEmployeeGassing {
    public void gasUpIfLow(GasVehicle vehicle) {
        if (vehicle.getGasTank().getGasLevel() <= 0.1f) {
            gasUp(vehicle);
        }
    }

    public void gasUp(GasVehicle vehicle) {
        vehicle.location.setLocation("Gas station");
        vehicle.getGasTank().setGasLevel(1f);
    }
}
