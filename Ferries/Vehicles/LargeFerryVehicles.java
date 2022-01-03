package Ferries.Vehicles;
public class LargeFerryVehicles {
    private int space = 6;
    public int busses;
    public int trucks;

    public LargeFerryVehicles() {

    }

    public LargeFerryVehicles(int busses, int trucks) {
        this.busses = busses;
        this.trucks = trucks;
    }

    public void addBusses(int amount) {
        if (canFitAmount(amount)) {
            busses += amount;
        }
    }

    public void addTruck(int amount) {
        if (canFitAmount(amount)) {
            trucks += amount;
        }
    }

    private boolean canFitAmount(int amount) {
        if (amount + busses + trucks > space) {
            return false;
        } else {
            return true;
        }
    }
}
