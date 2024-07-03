package OOP_exercises;

public class Person {
    private String name;
    private String email;
    private byte yearOfBirth;
    private Address address;

    /* Constructor */

    public Person(String name, String email, byte yearOfBirth, Address address) {
        this.name = name;
        this.email = email;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
    }

    /* Getters */

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public byte getYearOfBirth() {
        return yearOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    /* Setters */

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", address=" + address +
                '}';
    }
}
