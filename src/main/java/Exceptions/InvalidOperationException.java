package Exceptions;

public class InvalidOperationException extends Exception{
    public InvalidOperationException() {
        super("Invalid operation exception!!");
    }

    public InvalidOperationException(String massage) {
        super(massage);
    }
}
