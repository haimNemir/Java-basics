package OOP_exercises;

public class MFGEmployee extends Employee{
    private final double salary;

    public MFGEmployee(String firstName, String lastName, int workHours){
        super(firstName, lastName);
        double priceForWorkHour = 20;
        salary = workHours * priceForWorkHour;
    }

    public String toString(){
        return super.toString() + "\nSalary: " + salary;
    }

//    @Override
//    public void calcSalary() {
//
//    }
}
