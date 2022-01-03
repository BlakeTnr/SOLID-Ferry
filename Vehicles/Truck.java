package Vehicles;

import Vehicles.Parts.CargoDoor;

public class Truck extends Vehicle implements CargoDoor {
    private boolean isCargoDoorOpen = false;
    
    public Truck() {
        this.cost = 6f;
    }

    public float getCost() {
        return cost;
    }

    public boolean isCargoDoorOpen() {
        return this.isCargoDoorOpen;
    }

    public void setCargoDoorOpenState(boolean newCargoDoorOpenState) {
        this.isCargoDoorOpen = newCargoDoorOpenState;
    }
}
