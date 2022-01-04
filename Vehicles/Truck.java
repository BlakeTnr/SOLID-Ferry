package Vehicles;

import Vehicles.Parts.*;

public class Truck extends Vehicle implements CargoDoor, Inspectable {
    private boolean isCargoDoorOpen = false;

    public Truck(float gasLevel) {
        super(gasLevel);
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

    public void sendForInspection() {
        location.setLocation("Customs inspection");
    }
}
