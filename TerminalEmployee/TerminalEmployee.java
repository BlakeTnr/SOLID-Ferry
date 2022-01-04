package TerminalEmployee;

public class TerminalEmployee {
    public TerminalEmployeeIncome income = new TerminalEmployeeIncome(0f, 0.1f);
    public TerminalEmployeeGassing gassing = new TerminalEmployeeGassing();
    public TerminalEmployeeLoading loading = new TerminalEmployeeLoading(gassing, income);
}
