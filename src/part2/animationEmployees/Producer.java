package part2.animationEmployees;

import part2.Employee;

public class Producer extends Employee {
    private String[] product ={"Movie","Go","God"};
    public Producer(String name, int salary, String jobTitle) {
        super(name, salary, jobTitle);
    }

    public String[] getProduct() {
        return product;
    }
}
