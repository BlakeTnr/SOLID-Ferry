package Vehicles;

import Vehicles.Parts.*;

public class Van extends Vehicle implements CargoDoor, Inspectable {
    private boolean isCargoDoorOpen = false;

    public Van(float gasLevel) {
        super(gasLevel);
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

    public void sendForInspection() {
        location.setLocation("Customs inspection");
    }
}
