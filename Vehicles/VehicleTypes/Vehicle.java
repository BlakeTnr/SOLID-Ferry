package Vehicles.VehicleTypes;

import Vehicles.Parts.*;

public abstract class Vehicle {
    protected float cost = 0f;
    public Location location = new Location();

    public abstract float getCost();
}
