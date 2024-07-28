package SQL.ExerciseJDBC_2;

public class Driver {
    private int driver_id;
    private String name;
    private String licenseType;
    private int age;

    public Driver(int id, String name, String licenseType, int age) {
        this.driver_id = id;
        this.name = name;
        this.licenseType = licenseType;
        this.age = age;
    }

    public Driver(String name, String licenseType, int age) {
        this.name = name;
        this.licenseType = licenseType;
        this.age = age;
    }

    public int getDriver_id() {
        return driver_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driver_id=" + driver_id +
                ", name='" + name + '\'' +
                ", licenseType='" + licenseType + '\'' +
                ", age=" + age +
                '}';
    }
}
