package TerminalEmployee;

public class TerminalEmployee {
    public TerminalEmployeeIncome income;
    public TerminalEmployeeGassing gassing = new TerminalEmployeeGassing();
    public TerminalEmployeeLoading loading;

    public TerminalEmployee(TerminalEmployeeIncome income) {
        this.income = income;
        this.loading = new TerminalEmployeeLoading(gassing, income);
    }
}
