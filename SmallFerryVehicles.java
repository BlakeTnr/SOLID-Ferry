public class SmallFerryVehicles {
    private int space = 8;
    int cars;
    int vans;

    public SmallFerryVehicles() {

    }

    public SmallFerryVehicles(int cars, int vans) {
        this.cars = cars;
        this.vans = vans;
    }

    public void addCars(int amount) {
        if (canFitAmount(amount)) {
            cars += amount;
        }
    }

    public void addVans(int amount) {
        if (canFitAmount(amount)) {
            vans += amount;
        }
    }

    private boolean canFitAmount(int amount) {
        if (amount + vans + cars > space) {
            return false;
        } else {
            return true;
        }
    }
}
