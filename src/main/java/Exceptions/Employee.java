package Exceptions;

public class Employee {
    private String name;
    private double hourlyWage;
    private double monthlyWorkingHours;

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) throws HourlyWageException{
        if (hourlyWage >= 29.12)
            this.hourlyWage = hourlyWage;
        else
            throw new HourlyWageException();
    }

    public double getMonthlyWorkingHours() {
        return monthlyWorkingHours;
    }

    public void setMonthlyWorkingHours(double monthlyWorkingHours) throws HourlyWageException {
        if (monthlyWorkingHours > 0 && monthlyWorkingHours <= 40)
            this.monthlyWorkingHours = monthlyWorkingHours;
        else
            throw new HourlyWageException();
    }

    public double getSalary() {
        return monthlyWorkingHours * hourlyWage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hourlyWage=" + hourlyWage +
                ", monthlyWorkingHours=" + monthlyWorkingHours +
                '}';
    }
}
