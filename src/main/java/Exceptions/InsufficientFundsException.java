package Exceptions;

public class InsufficientFundsException extends Exception {

    InsufficientFundsException() {
        super("Sorry, insufficient funds");
    }

    InsufficientFundsException(String massage) {
        super(massage);
    }
}
