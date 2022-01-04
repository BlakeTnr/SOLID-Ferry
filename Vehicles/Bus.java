package Vehicles;

public class Bus extends Vehicle {
    public Bus(float gasLevel) {
        super(gasLevel);
        this.cost = 5f;
    }

    public float getCost() {
        return cost;
    }
}
