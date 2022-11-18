package part1;

import java.util.Arrays;

public class Company {

    private String name;
    private Employee[] employees = new Employee[10];
    private double budget;
    private String supervisor;

    public Company(String name) {
        this.name = name;
    }

    public Company(String name, Employee[] employees,double budget,String supervisor) {
        this.name = name;
        this.employees = employees;
        this.budget =budget;
        this.supervisor =supervisor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }


    public Employee changeSupervisor(String name){
        Employee [] employees = this.employees;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getName().equals(name)) {
                this.supervisor =employees[i].getName();
                System.out.println(employees[i].getName()+" Теперь руководитель");
                return employees[i];

            }
        }
        return null;
    }
    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                System.out.println("Сотрудник добавлен");
                return true;
            }
        }
        return false;
    }
    public void deleteEmployee(String nameEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if(this.employees[i] != null && this.employees[i].getName().equals(nameEmployee)){
                System.out.println(this.employees[i].getName()+" больше не снами");
                this.employees[i] = null;

            }
        }
    }
    public void showEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
        System.out.println();
    }

    public void getOverallSalary(){
        double count = 0 ;
        for (int i = 0; i < employees.length ; i++) {
            if (employees[i] != null ){
                count += employees[i].getSalary();
            }
        }
        System.out.println(count);
    }
    public Employee getEmployeeByName(String employeeName) {
        Employee[] employees1 = this.employees;
        for (int i = 0; i < employees1.length; i++) {
            if (employees1[i] != null && employees1[i].getName().equals(employeeName)) {
                System.out.println("Есть такой человек :" + employees1[i].getName());
                return employees1[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "name = " + name +  " | "  +
                " budget = " + budget +
                " |  supervisor = "+ supervisor + "\n";
    }
}
