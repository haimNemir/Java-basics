package Exceptions;

public class MonthlyWorkingHoursException extends Exception{
    public MonthlyWorkingHoursException() {
        super("Minimum wage is 29.12, please release your money");
    }
}
