package Exceptions;

public class Person {
    private int id;
    private  String name;
    private String address;
    private double age;

    public Person(int id, String name, String address, double age) throws ageException {
        this.id = id;
        this.name = name;
        this.address = address;
        setAge(age);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(double age) throws ageException {
       if(age >= 18 && age <= 30)
            this.age = age;
        else
            throw new ageException();
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
