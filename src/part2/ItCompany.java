package part2;

public class ItCompany extends Company{
    private double outsourcing;
    private double outstaffing;

    public ItCompany(String name, Employee[] employees, double budget, String supervisor) {
        super(name, employees, budget, supervisor);
    }

    public double getOutsourcing() {
        return outsourcing;
    }

    public double getOutstaffing() {
        return outstaffing;
    }
}
