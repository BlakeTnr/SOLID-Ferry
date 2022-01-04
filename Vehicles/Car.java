package Vehicles;

public class Car extends Vehicle {
    public Car(float gasLevel) {
        super(gasLevel);
        this.cost = 3f;
    }

    public float getCost() {
        return cost;
    }
}
