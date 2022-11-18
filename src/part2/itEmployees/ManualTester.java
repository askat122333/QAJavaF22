package part2.itEmployees;

public class ManualTester extends Tester{
private String[] tests = {"Ручное тестирование"};
    public ManualTester(String name, int salary, String jobTitle) {
        super(name, salary, jobTitle);
    }

    public String[] getTests() {
        return tests;
    }
}
