package Vehicles;

public abstract class Vehicle {
    protected float cost = 0f;
    protected float gasLevel = 100f;
    protected String location = "Arrival";

    public abstract float getCost();

    public float getGasLevel() {
        return gasLevel;
    }

    public void setGasLevel(float newGasLevel) {
        gasLevel = newGasLevel;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String newLocation) {
        location = newLocation;
    }

    public void sendForInspection() {
        location = "Customs inspection";
    }
}
