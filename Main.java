import TerminalEmployee.*;
import Vehicles.*;

class Main {
    public static void main(String[] args) {
        TerminalEmployee tei = new TerminalEmployee(new TerminalEmployeeIncome(0f, 0.11f));
        HybridCar hybrid = new HybridCar(0.1f, 0.1f);
        System.out.println(tei.income.getIncome());
        tei.loading.loadVehicle(hybrid);
        System.out.println(tei.income.getIncome());
        System.out.println(hybrid.location.getLocation());
    }
}