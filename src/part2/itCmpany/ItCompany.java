package part2.itCmpany;

import part2.company.Company;
import part2.company.Employee;

public class ItCompany extends Company {
    private OutSors outSors;
    private OutStaf outStaf;
    public ItCompany(String name) {
        super(name);
    }

    public ItCompany(String name, Employee[] employees, double budget, String supervisor, OutSors outSors, OutStaf outStaf) {
        super(name, employees, budget, supervisor);
        this.outSors =outSors;
        this.outStaf = outStaf;
    }
}
