import java.util.*;

public class Company {
    private final List<Employee> employees = new ArrayList<Employee>();
    private int income;

    public void hire(Employee employee) {
        if (employee instanceof Manager) {
            this.employees.add(employee);
            income += (int) Manager.getIncomeForCompany();
        } else {
            this.employees.add(employee);
        }
        if (income >= 10_000_000) {
            TopManager.isEnoughIncome = true;
        }
    }

    public void hireAll(Collection<Employee> employees) {
        if (employees instanceof Manager) {
            this.employees.addAll(employees);
            income += (int) Manager.getIncomeForCompany();
        } else {
            this.employees.addAll(employees);
        }
        if (income >= 10_000_000) {
            TopManager.isEnoughIncome = true;
        }
    }

    public void fire(Employee employee) {
        this.employees.remove(employee);
    }

    public int getIncome() {
        return income;
    }

    public ArrayList<Employee> getTopSalaryStaff(int count) {
        Collections.sort(employees);
        ArrayList<Employee> limitList = new ArrayList<>();
        if (count > 0 && count <= countEmployees()) {
            for (int i = countEmployees() - 1; i >= countEmployees() - count; i--) {
                limitList.add(employees.get(i));
            }
        } else {
            System.out.println("Введено недопустимое кол-во сотрудников");
        }
        return limitList;
    }

    public ArrayList<Employee> getLowestSalaryStaff(int count) {
        Collections.sort(employees);
        ArrayList<Employee> limitList = new ArrayList<>();
        if (count > 0 && count <= countEmployees()) {
            for (int i = 0; i < count; i++) {
                limitList.add(employees.get(i));
            }
        } else {
            System.out.println("Введено недопустимое кол-во сотрудников");
        }
        return limitList;
    }

    public int countEmployees() {
        return employees.size();
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}


