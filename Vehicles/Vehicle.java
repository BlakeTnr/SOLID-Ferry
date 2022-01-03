package Vehicles;

public abstract class Vehicle {
    protected float cost = 0f;
    protected float gasLevel = 100f;
    
    public abstract float getCost();
    
    public float getGasLevel() {
        return gasLevel;
    }

    public void setGasLevel(float newGasLevel) {
        gasLevel = newGasLevel;
    }
}
