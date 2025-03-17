public class TopManager implements Employee{
    private static final double FIXED_SALARY = 120_000;
    private static final double BONUS = 1.5;
    protected static boolean isEnoughIncome;

    @Override
    public double getMonthSalary() {
        if (isEnoughIncome){
            return FIXED_SALARY + FIXED_SALARY * BONUS;
        } else {
            return FIXED_SALARY;
        }
    }

    @Override
    public String toString() {
        return "TopManager - " + getMonthSalary();
    }

    @Override
    public int compareTo(Object o) {
        Employee topManager = (Employee) o;
        return Double.compare(getMonthSalary(), ((Employee) o).getMonthSalary());
    }
}

