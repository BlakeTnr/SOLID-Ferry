package TerminalEmployee;
import Vehicles.Vehicle;

public class TerminalEmployeeIncome {
    private float income;   
    private float percentIncome; 

    public TerminalEmployeeIncome(float startingIncome, float percentIncomeAsDecimal) {
        this.income = startingIncome;
        this.percentIncome = percentIncomeAsDecimal;
    }

    public void payForVehicle(Vehicle vehicle, int amount) {
        float incomeAmount = vehicle.getCost() * percentIncome;
        income += incomeAmount * amount;
    }

    public float getIncome() {
        return income;
    }
}
