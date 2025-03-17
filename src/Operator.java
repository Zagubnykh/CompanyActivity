public class Operator implements Employee{
    private static final double FIXED_SALARY = 70_000;
    @Override
    public double getMonthSalary() {
        return FIXED_SALARY;
    }

    @Override
    public String toString() {
        return "Operator - " + getMonthSalary();
    }

    @Override
    public int compareTo(Object o) {
        Employee operator = (Employee) o;
        return Double.compare(getMonthSalary(), ((Employee) o).getMonthSalary());
    }
}


