package SQL;

import java.sql.*;

public class SQL1 {
    private static final String connectionString = "jdbc:mysql://localhost:3306/sakila";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(connectionString, "root", "Qwert1trewq!")){
            String sql = "select * from actor;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString(1) + ",\t " + rs.getString(2) + ",    \t"  + rs.getString(3));
            }
        } catch (SQLException e) {
            System.out.println("Error! " + e.getMessage());
        }
    }
}

