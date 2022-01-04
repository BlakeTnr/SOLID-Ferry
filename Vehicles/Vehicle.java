package Vehicles;

import Vehicles.Parts.*;

public abstract class Vehicle {
    protected float cost = 0f;
    public Gas gas = new Gas();
    public Location location = new Location();

    public Vehicle(float gasLevel) {
        gas.setGasLevel(gasLevel);
    }

    public abstract float getCost();
}
