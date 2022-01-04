import TerminalEmployee.*;
import Vehicles.*;

class Main {
    public static void main(String[] args) {
        TerminalEmployee tei = new TerminalEmployee(new TerminalEmployeeIncome(0f, 0.11f));
        Truck truck = new Truck(0.09f);
        System.out.println(tei.income.getIncome());
        tei.loading.loadVehicle(truck);
        System.out.println(tei.income.getIncome());
    }
}