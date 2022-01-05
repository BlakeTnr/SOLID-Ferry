package Ferries.Vehicles;

public class ElectricVehiclesFerry {
    private int space = 10;
    public int electric;
    public int hybrid;

    public ElectricVehiclesFerry() {

    }

    public ElectricVehiclesFerry(int electric, int hybrid) {
        this.electric = electric;
        this.hybrid = hybrid;
    }

    public void addElectric(int amount) {
        if (canFitAmount(amount)) {
            electric += amount;
        }
    }

    public void addHybrid(int amount) {
        if (canFitAmount(amount)) {
            hybrid += amount;
        }
    }

    private boolean canFitAmount(int amount) {
        if (amount + electric + hybrid > space) {
            return false;
        } else {
            return true;
        }
    }
}
