package Ferries.Income;

import Ferries.Vehicles.LargeFerryVehicles;
import Vehicles.*;

public class LargeFerryIncome implements FerryIncome {
    private int costOfBusses = 5;
    private int costOfTrucks = 6;
    LargeFerryVehicles vehicles;

    public LargeFerryIncome(LargeFerryVehicles vehicles) {
        this.vehicles = vehicles;
    }

    public int getIncome() {
        int incomeFromBusses = costOfBusses * vehicles.busses;
        int incomeFromTrucks = costOfTrucks * vehicles.trucks;
        int totalIncome = incomeFromBusses + incomeFromTrucks;
        return totalIncome;
    }
}
