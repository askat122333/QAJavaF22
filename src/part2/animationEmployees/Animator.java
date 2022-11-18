package part2.animationEmployees;

import part2.Employee;

public class Animator extends Employee {
    private String[] skills={"Лица","Тела","Фон"};
    public Animator(String name, int salary, String jobTitle) {
        super(name, salary, jobTitle);
    }

    public String[] getSkills() {
        return skills;
    }
}
