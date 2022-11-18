package part2;

public class AnimationCompany extends Company{
private double addOnYoutube;
private double client;

    public AnimationCompany(String name, Employee[] employees, double budget, String supervisor) {
        super(name, employees, budget, supervisor);
    }

    public double getAddOnYoutube() {
        return addOnYoutube;
    }

    public double getClient() {
        return client;
    }
}
