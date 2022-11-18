package part2.itEmployees;

import part2.Employee;

public class ProjeсtManager extends Employee {
    private String [] projects ={"Test","Google","Very"};
    public ProjeсtManager(String name, int salary, String jobTitle) {
        super(name, salary, jobTitle);
    }

    public String[] getProjects() {
        return projects;
    }
}
