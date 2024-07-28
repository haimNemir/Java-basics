package SQL.ExerciseJDBC_2;

import Utils.EnumCarsModels;
import Utils.EnumNames;

import java.sql.*;
import java.util.ArrayList;
import java.util.Random;

public class Program {
    private static final String connectionString = "jdbc:mysql://localhost:3306/sakila";
    private static final String[] licenseTypes = {"A", "B", "C", "D", "E"};
    private static final Random random = new Random();


    public static void main(String[] args) {
        addDriver();
        addCar();
        getAllDrivers();
        getAllCars();
        //חיבור בין שני הטבלאות שביצירת car יווצר גם driver_id עם ID קיים או שניצור תוך כדי driver עם ID שמקושר לטבלת CAR
    }

    public static void addDriver() {
        try (Connection connection = DriverManager.getConnection(connectionString, "root", "Qwert1trewq!")) {
            String sql = "insert into sakila.driver(name, license_type, age) values(? ,? ,?);";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, EnumNames.getRandomName());
            statement.setString(2, licenseTypes[random.nextInt(0, 5)]);
            statement.setInt(3, random.nextInt(20, 41));
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * This method used for create Car with specific "driver_id".
     *
     * @param driver_id id for details of driver.
     */
    public static void addCar(int driver_id) {//------------------------------------------------לבדוק האם צריך לבנות ID והאם הוא מסודר לפי סדר יצירת רכב
        try (Connection connection = DriverManager.getConnection(connectionString, "root", "Qwert1trewq!")) {
            String sql = "insert into sakila.car(model, year, driver_id) values(? ,? ,?);";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, EnumCarsModels.getRandomCarsModel());
            statement.setInt(2, random.nextInt(1950, 2025));
            statement.setInt(3, driver_id);//driver_id = for car_id
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * This method used for create Car with auto increment of "driver_id".
     */
    public static void addCar() {
        try (Connection connection = DriverManager.getConnection(connectionString, "root", "Qwert1trewq!")) {
            String sql = "insert into sakila.car(model, year, driver_id) values(? ,? ,?);";
            String sql2 = "SELECT MAX(driver_id) FROM sakila.car;";
            PreparedStatement statement = connection.prepareStatement(sql);
            PreparedStatement statement2 = connection.prepareStatement(sql2);   //for get the max number in the column driver id to create safe driver id.
            ResultSet rs = statement2.executeQuery();
            if (rs.next()) {                                                      // עושה וואלידציה האם באמת קיים driver_id לפני שהוא מנסה למשוך אותו וכך הוא מונע תקלות
                int maxDriversId = (rs.getInt(1)) + 1;
                statement.setString(1, EnumCarsModels.getRandomCarsModel());
                statement.setInt(2, random.nextInt(1950, 2025));
                statement.setInt(3, maxDriversId);//driver_id -> for car_id
                statement.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void deleteDriver(int driver_id) {
        try (Connection connection = DriverManager.getConnection(connectionString, "root", "Qwert1trewq!")) {
            PreparedStatement statement = connection.prepareStatement("delete from sakila.driver where driver_id = (?);");
            statement.setInt(1, driver_id);
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Error! " + e.getMessage());
        }
    }

    private static void deleteCar(int car_id) {
        try (Connection connection = DriverManager.getConnection(connectionString, "root", "Qwert1trewq!")) {
            PreparedStatement statement = connection.prepareStatement("delete from sakila.car where car_id = (?);");
            statement.setInt(1, car_id);
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Error! " + e.getMessage());
        }
    }

    private static Driver getDriverById(int driver_id) {
        try (Connection connection = DriverManager.getConnection(connectionString, "root", "Qwert1trewq!")) {
            PreparedStatement statement = connection.prepareStatement("select * from sakila.driver where driver_id = (?)");
            statement.setInt(1, driver_id);
            ResultSet rs = statement.executeQuery();
            int id = 0;
            String name = "0";
            String licenseType = "0";
            int age = 0;
            if (rs.next()) {
                id = (rs.getInt(1));
                name = (rs.getString(2));
                licenseType = (rs.getString(3));
                age = (rs.getInt(4));
            } else {
                System.out.println("There is no existing Driver with this ID, returned empty Object!!");
            }
            return new Driver(id, name, licenseType, age);

        } catch (SQLException e) {
            System.out.println("Error! " + e.getMessage());
            System.out.println("returned empty Object!!");
            return new Driver(0, "0", "0", 0);
        }
    }

    //    getCarById
    private static Car getCarById(int car_id) {
        try (Connection connection = DriverManager.getConnection(connectionString, "root", "Qwert1trewq!")) {
            PreparedStatement statement = connection.prepareStatement("select * from sakila.car where car_id = (?)");
            statement.setInt(1, car_id);
            ResultSet rs = statement.executeQuery();
            int carId = 0;
            String model = "0";
            int year = 0;
            int driverId = 0;
            if (rs.next()) {
                carId = (rs.getInt(1));
                model = (rs.getString(2));
                year = (rs.getInt(3));
                driverId = (rs.getInt(4));
            } else {
                System.out.println("There is no existing Car with this ID, returned empty Object");
            }
            return new Car(carId, model, year, driverId);
        } catch (SQLException e) {
            System.out.println("Error! " + e.getMessage());
            System.out.println("returned empty Object!!");
            return new Car(0, "0", 0, 0);
        }
    }

    private static ArrayList<Driver> getAllDrivers() {
        ArrayList<Driver> allDrivers = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(connectionString, "root", "Qwert1trewq!")) {
            PreparedStatement statement = connection.prepareStatement("select * from sakila.driver;");
            ResultSet rs = statement.executeQuery();
            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    allDrivers.add(new Driver(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getInt(4)));
                }
            } else {
                System.out.println("There is no existing Drivers, returned empty Object!!");
            }
            return allDrivers;
        } catch (SQLException e) {
            System.out.println("Error! " + e.getMessage());
            System.out.println("returned empty Array list!!");
            return new ArrayList<Driver>();
        }
    }

     private static ArrayList<Car> getAllCars() {
         ArrayList<Car> allCars = new ArrayList<>();
         try (Connection connection = DriverManager.getConnection(connectionString, "root", "Qwert1trewq!")) {
             PreparedStatement statement = connection.prepareStatement("select * from sakila.car;");
             ResultSet rs = statement.executeQuery();
             if (rs.isBeforeFirst()) {
                 while (rs.next()) {
                     allCars.add(new Car(
                             rs.getInt(1),
                             rs.getString(2),
                             rs.getInt(3),
                             rs.getInt(4)));
                 }
             } else {
                 System.out.println("There is no existing Cars, returned empty Object!!");
             }
             return allCars;
         } catch (SQLException e) {
             System.out.println("Error! " + e.getMessage());
             System.out.println("returned empty Array list!!");
             return new ArrayList<Car>();
         }
     }
}
