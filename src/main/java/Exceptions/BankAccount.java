package Exceptions;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit (double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException{
        if (this.balance - amount >= 0){
            this.balance -= amount;
        }
        else {
            throw new InsufficientFundsException(

            );
        }
    }
}
