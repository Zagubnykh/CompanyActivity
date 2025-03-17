public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        for (int i = 0; i < 180; i++) {
            Employee operator = new Operator();
            company.hire(operator);
        }
        for (int i = 0; i < 80; i++) {
            Employee manager = new Manager();
            company.hire(manager);
        }
        for (int i = 0; i < 10; i++) {
            Employee topManager = new TopManager();
            company.hire(topManager);
        }
        System.out.println("\nДоход первой компании: " + company.getIncome());

        System.out.println("\n15 сотрудников с самыми высокими зарплатами в компании:");
        for (Employee topSalary : company.getTopSalaryStaff(15)) {
            System.out.println(topSalary);
        }
        System.out.println("\n30 сотрудников с самыми низкими зарплатами в компании:");
        for (Employee lowSalary : company.getLowestSalaryStaff(30)) {
            System.out.println(lowSalary);
        }

        for (int i = 0; i < company.countEmployees() / 2; i++) {
            int randomIndex = (int) (Math.random() * company.countEmployees());
            company.fire(company.getEmployees().get(randomIndex));
        }

        System.out.println("\nПосле увольнений:");

        System.out.println("\n15 сотрудников с самыми высокими з.п.:");
        for (Employee topSalary : company.getTopSalaryStaff(15)) {
            System.out.println(topSalary);
        }
        System.out.println("\n30 сотрудников с самыми низкими з.п.:");
        for (Employee lowSalary : company.getLowestSalaryStaff(30)) {
            System.out.println(lowSalary);
        }

        Company company1 = new Company();

        for (int i = 0; i < 180; i++) {
            Employee operator = new Operator();
            company1.hire(operator);
        }
        for (int i = 0; i < 80; i++) {
            Employee manager = new Manager();
            company1.hire(manager);
        }
        for (int i = 0; i < 10; i++) {
            Employee topManager = new TopManager();
            company1.hire(topManager);
        }
        System.out.println("\nДоход второй компании: " + company1.getIncome());

        System.out.println("\n15 сотрудников с самыми высокими зарплатами в компании:");
        for (Employee topSalary : company1.getTopSalaryStaff(15)) {
            System.out.println(topSalary);
        }
        System.out.println("\n30 сотрудников с самыми низкими зарплатами в компании:");
        for (Employee lowSalary : company1.getLowestSalaryStaff(30)) {
            System.out.println(lowSalary);
        }

        for (int i = 0; i < company1.countEmployees() / 2; i++) {
            int randomIndex = (int) (Math.random() * company.countEmployees());
            company1.fire(company1.getEmployees().get(randomIndex));
        }

        System.out.println("\nПосле увольнений:");

        System.out.println("\n15 сотрудников с самыми высокими з.п.:");
        for (Employee topSalary : company1.getTopSalaryStaff(-15)) {
            System.out.println(topSalary);
        }
        System.out.println("\n30 сотрудников с самыми низкими з.п.:");
        for (Employee lowSalary : company1.getLowestSalaryStaff(30)) {
            System.out.println(lowSalary);
        }
    }
}


