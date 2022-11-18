package part2.artCompany;

import part2.company.Company;
import part2.company.Employee;

public class ArtCompany extends Company {


    public ArtCompany(String name) {
        super(name);
    }

    public ArtCompany(String name, Employee[] employees, double budget, String supervisor) {
        super(name, employees, budget, supervisor);
    }
}
