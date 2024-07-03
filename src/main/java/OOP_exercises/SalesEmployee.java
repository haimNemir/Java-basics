package OOP_exercises;

public class SalesEmployee extends Employee{
    private double salary;
    private final double  priceForSale = 200;
    private final double bonus = 1.05;

    public SalesEmployee(String firstName, String lastName, int totalSales){
        super(firstName, lastName);
        salary = totalSales * priceForSale * bonus;
    }

    public void addSale(){
        salary += priceForSale  * bonus;
    }

    public String toString(){
        return super.toString() + "\nSalary: " + salary;
    }
}

