package util;

import javax.crypto.CipherInputStream;
import java.sql.*;

public class BasicConnectionWithResources {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/JPX?serverTimezone=America/Bogota";
        String username = "root";
        String password = "Jeanpool14";
        String sql = "SELECT * FROM JPX.users_tbl";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(rs.getString("user_firstname"));
                System.out.println(rs.getString("user_lastname"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
