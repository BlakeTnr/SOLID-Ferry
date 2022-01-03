package Vehicles;

import Vehicles.Parts.CargoDoor;

public class Van extends Vehicle implements CargoDoor {
    private boolean isCargoDoorOpen = false;

    public Van() {
        this.cost = 4f;
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
