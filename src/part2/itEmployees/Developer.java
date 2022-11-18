package part2.itEmployees;

import part2.Employee;

public class Developer extends Employee {
    private String [] technologyStack = {"FrontEnd","JavaBackEnd","C#BackEnd"};
    public Developer(String name, int salary, String jobTitle) {
        super(name, salary, jobTitle);
    }

    public String[] getTechnologyStack() {
        return technologyStack;
    }
}
