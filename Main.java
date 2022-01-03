import TerminalEmployee.TerminalEmployeeIncome;
import Vehicles.*;

class Main {
    public static void main(String[] args) {
        TerminalEmployeeIncome tei = new TerminalEmployeeIncome(0f, 0.1f);
        Truck truck = new Truck();
        tei.payForVehicle(truck, 10);
        System.out.println(String.valueOf(tei.getIncome()));
        System.out.println(String.valueOf(truck.isCargoDoorOpen()));
        truck.setCargoDoorOpenState(true);
        System.out.println(String.valueOf(truck.isCargoDoorOpen()));
    }
}