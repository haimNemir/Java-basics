package Exceptions;

public class ageException extends Exception {
    public ageException() {
        super("The age must be between eighteen and thirty");
    }
}
