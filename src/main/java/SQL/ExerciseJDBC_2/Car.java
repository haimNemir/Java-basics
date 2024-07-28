package SQL.ExerciseJDBC_2;

public class Car {
    private int car_id;
    private String model;
    private int year;
    private int driver_id;

    public Car(int car_id, String model, int year, int driver_id) {
        this.car_id = car_id;
        this.model = model;
        this.year = year;
        this.driver_id = driver_id;
    }

    public Car(String model, int year, int driver_id) {
        this.model = model;
        this.year = year;
        this.driver_id = driver_id;
    }

    public int getCar_id() {
        return car_id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(int driver_id) {
        this.driver_id = driver_id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "car_id=" + car_id +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", driver_id=" + driver_id +
                '}';
    }
}
