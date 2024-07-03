package OOP_exercises;

public class Address {
    private String streetName;
    private int streetNumber;
    private String city;

    /* constructor */

    public Address(String streetName, int streetNumber, String city){
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.city = city;
    }

    /* Getters */

    public String getStreetName() {
        return streetName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public String getCity() {
        return city;
    }

    /* Setters */

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
