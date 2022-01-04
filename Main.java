import TerminalEmployee.*;
import Vehicles.*;

class Main {
    public static void main(String[] args) {
        TerminalEmployee tei = new TerminalEmployee();
        Truck truck = new Truck(0.09f);
        System.out.println(truck.gas.getGasLevel());
        tei.loading.loadVehicle(truck);
        System.out.println(truck.gas.getGasLevel());
    }
}