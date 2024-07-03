package OOP_exercises;

public class PackEmployee extends Employee{
    private double salary;
    private final double priceForShift = 2;

    public PackEmployee(String firstName, String lastName, int shifts){
        super(firstName, lastName);
        salary = shifts * priceForShift;
    }

    public void addShift (){
        salary += priceForShift;
    }

    public String toString(){
        return super.toString() + "\nSalary: " + salary;
    }
}
