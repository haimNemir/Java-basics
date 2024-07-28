package SQL;

import Utils.EnumNames;

import java.sql.*;
import java.util.Scanner;

// Exercise 1:
public class JDBC {
    private static final String connectionString = "jdbc:mysql://localHost:3306/sakila";

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            int input = 0;
            while(input != 5){
                chooseList();
                input = scanner.nextInt();
                switch(input){
                    case 1:
                        System.out.println("Show all categories:");
                        showAllCategories();
                        break;
                    case 2:
                            System.out.println("Adding new category, Please enter category name:");
                            addNewCategories(scanner.next());
                        break;
                    case 3:
                        System.out.println("Update category, Please enter index number:");
                        int indexNumber = scanner.nextInt();
                        System.out.println("Please enter new category name:");
                        updateCategory(indexNumber, scanner.next());
                        break;
                    case 4:
                        System.out.println("Delete category, Please enter name of category to delete:");
                        deleteCategory(scanner.next());
                        break;
                }
            }
        } catch (Exception e){
            System.out.println("Error!! " + e.getMessage());
        }
    }

    private static void chooseList(){
        System.out.println("Please enter a number:\n1> Show all categories\n2>Add new category\n3>Update category\n4>Delete category\n5>Exit");
    }

    private static void showAllCategories(){
        try (Connection connection = DriverManager.getConnection(connectionString, "root", "Qwert1trewq!")){
            String sql = "SELECT * FROM sakila.category;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt(1) + ",\t " + rs.getString(2) + ",    \t"  + rs.getString(3));
            }
        } catch (SQLException e) {
            System.out.println("Error! " + e.getMessage());
        }
    }

    private static void addNewCategories(String categoryName){
        try (Connection connection = DriverManager.getConnection(connectionString, "root", "Qwert1trewq!")){
            PreparedStatement statement = connection.prepareStatement("insert into sakila.category(name) values(?);");
            statement.setString(1, categoryName);
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Error! " + e.getMessage());
        }
    }

    private static void updateCategory(int indexCategory, String categoryNewName){
        try (Connection connection = DriverManager.getConnection(connectionString, "root", "Qwert1trewq!")){
            PreparedStatement statement = connection.prepareStatement("UPDATE sakila.category SET `name` = (?) WHERE (`category_id` = (?));");
            statement.setString(1, categoryNewName);
            statement.setInt(2, indexCategory);
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Error! " + e.getMessage());
        }
    }

    private static void deleteCategory(String nameOfCategory){
        try (Connection connection = DriverManager.getConnection(connectionString, "root", "Qwert1trewq!")){
            PreparedStatement statement = connection.prepareStatement("delete from sakila.category where name = (?);");
            statement.setString(1, nameOfCategory);
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Error! " + e.getMessage());
        }
    }




}
