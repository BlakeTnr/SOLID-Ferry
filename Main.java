import Vehicles.*;

class Main {
    public static void main(String[] args) {
        TerminalEmployeeIncome tei = new TerminalEmployeeIncome(0f, 0.1f);
        tei.payForVehicle(new Truck(), 10);
        System.out.println(String.valueOf(tei.getIncome()));
    }
}