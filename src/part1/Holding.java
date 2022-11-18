package part1;

public class Holding {
    private Company[] companies;

    public Holding() {
        companies = new Company[10];
    }

    public Holding(Company[] companies) {
        this.companies = companies;
    }

    public Company[] getCompanies() {
        return companies;
    }

    public void setCompanies(Company[] companies) {
        this.companies = companies;
    }

    public boolean addCompany(Company company) {
        for (int i = 0; i < companies.length; i++) {
            if (companies[i] == null) {
                companies[i] = company;
                System.out.println("Компания добавлена");
                return true;
            }
        }
        return false;
    }
    public void deleteCompany(String nameCompany) {
        for (int i = 0; i < companies.length; i++) {
            if(this.companies[i] != null && this.companies[i].getName().equals(nameCompany)){
                System.out.println(this.companies[i].getName()+" больше не снами");
                this.companies[i] = null;

            }
        }
    }

    public void showCompanies() {
        for (Company company : companies) {
            if (company != null) {
                System.out.println(company);
            }
        }
        System.out.println();
    }

    public Company getCompanyByName(String companyName) {
        Company[] company = this.companies;
        for (int i = 0; i < company.length; i++) {
            if (company[i] != null && company[i].getName().equals(companyName)) {
                System.out.println("Есть такая компания :" + company[i].getName());
                return company[i];
            }
        }
        return null;
    }
    public void getEmployeeList(Employee[] employees) {
        int count = 0;
        int count2 = 0;
        for (int i = 0; i <employees.length ; i++) {
            if (employees[i] != null) {
                count++;
            }else {
                count2++;
            }
        }
        System.out.println("Число рабочих мест : " + count);
        System.out.println("Число вакантных мест : " + count2);
    }


    public void getOverallBudget(){
        double count = 0 ;
        for (int i = 0; i < companies.length ; i++) {
            if (companies[i] != null ){
                count += companies[i].getBudget();
            }
        }
        System.out.println(count +"B");
    }

}