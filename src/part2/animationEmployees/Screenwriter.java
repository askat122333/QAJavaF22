package part2.animationEmployees;

import part2.Employee;

public class Screenwriter extends Employee {
    private String[] genre ={"Детектив","Милодрамма","Сказки"};
    public Screenwriter(String name, int salary, String jobTitle) {
        super(name, salary, jobTitle);
    }

    public String[] getGenre() {
        return genre;
    }
}
