package Exceptions;

public class HourlyWageException extends Exception{
    HourlyWageException() {
        super("The hourly wage cant be lower than 29.12 shekels");
    }
}
