package TerminalEmployee;
import Vehicles.*;

public class TerminalEmployee {
    private TerminalEmployeeIncome terminalEmployeeIncome = new TerminalEmployeeIncome(0f, 0.1f);
    
    public void loadVehicle(Vehicle vehicle) {
        gasUpIfLow(vehicle);
        terminalEmployeeIncome.payForVehicle(vehicle, 1);
    }

    private void gasUpIfLow(Vehicle vehicle) {
        if(vehicle.getGasLevel() <= 0.1f) {
            vehicle.setGasLevel(1f);
        }
    }
}
