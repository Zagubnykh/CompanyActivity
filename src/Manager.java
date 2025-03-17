public class Manager implements Employee{
    private static final double FIXED_SALARY = 100_000;
    private static final double BONUS = 0.05;

    public static double getIncomeForCompany() {
        return (int) (Math.random() * 25000) + 115000;
    }

    @Override
    public double getMonthSalary() {
        return FIXED_SALARY + (int) (getIncomeForCompany() * BONUS);
    }

    public String toString() {
        return "Manager - " + getMonthSalary();
    }

    @Override
    public int compareTo(Object o) {
        Employee manager = (Employee) o;
        return Double.compare(getMonthSalary(), ((Employee) o).getMonthSalary());
    }
}

