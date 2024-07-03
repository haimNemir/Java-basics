package OOP_exercises;

public class Employee {
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString(){
        return "Employee data -\n" +
                "First name: " + firstName + "\nLast name: " + lastName;
    }

//    public abstract void calcSalary();
//
 }
