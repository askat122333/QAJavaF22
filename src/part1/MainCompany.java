package part1;

import java.util.Scanner;

public class MainCompany {
    public static void start(Company company) {

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Меню для работы с компанией: ");
            System.out.println("1) Вывод информации о компании");
            System.out.println("2) Вывод списока сотрудников компании");
            System.out.println("3) Вывод общих расходов на зарплаты сотрудников");
            System.out.println("4) Добавление сотрудника в компанию");
            System.out.println("5) Удаление сотрудника из компании");
            System.out.println("6) Поменять руководителя компании");
            System.out.println("7) Меню для работы с сотрудниками");
            System.out.println("0) Выход из главного меню");
            int command = in.nextInt();
            if (command == 1) {
                System.out.println("Информация о компании - ");
                System.out.println(  company.toString());
            } else if (command == 2) {
                System.out.println("Список сотрудников - ");
                company.showEmployees();
            } else if (command == 3) {
                System.out.println("Затараты на зароботную плату - ");
                company.getOverallSalary();
            } else if (command == 4) {
                System.out.println("Должность -");
                String jobTitle = in.next();
                System.out.println("Имя -");
                String name = in.next();
                System.out.println("Зарплата -");
                int salary = in.nextInt();
                company.addEmployee(new Employee(name,salary,jobTitle));

            } else if (command == 5) {
                System.out.println("Кого уволить - ");
                String name = in.next();
                company.deleteEmployee(name);
            } else if (command == 6) {
                System.out.println("Кого сделать руководителем? :");
                String employeeName = in.next();
                if (employeeName != null){
                   company.changeSupervisor(employeeName);
                }else {
                    System.out.println("Такого человека нету");
                }

            } else if (command == 7) {
                System.out.println("Имя сотрудника :");
                String employeeNames = in.next();
                Employee foundedEmployee = company.getEmployeeByName(employeeNames);
                if (foundedEmployee != null){
                    MainEmployee.start(foundedEmployee);
                }else {
                    System.out.println("Такого человека нету");
                }


            } else if (command == 0) {
                break;
            } else {
                System.out.println("Ошибка! Введите пункт из меню");
            }
        }
    }
}