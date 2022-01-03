package Ferries.Income;

import Ferries.Vehicles.SmallFerryVehicles;
import Vehicles.*;

public class SmallFerryIncome implements FerryIncome {
    private int costOfCars = 3;
    private int costOfVans = 4;
    SmallFerryVehicles vehicles;

    public SmallFerryIncome(SmallFerryVehicles vehicles) {
        this.vehicles = vehicles;
    }

    public int getIncome() {
        int incomeFromCars = costOfCars * vehicles.cars;
        int incomeFromVans = costOfVans * vehicles.vans;
        int totalIncome = incomeFromCars + incomeFromVans;
        return totalIncome;
    }

}
