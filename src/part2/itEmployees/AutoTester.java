package part2.itEmployees;

import part2.Employee;

public class AutoTester extends Tester {
    private String language;
    public AutoTester(String name, int salary, String jobTitle , String language) {
        super(name, salary, jobTitle);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

}
