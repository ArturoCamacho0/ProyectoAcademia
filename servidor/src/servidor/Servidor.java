package servidor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Servidor{
    public static void main(String[] args) {
        String connectionUrl = "jdbc:sqlserver://localhost;database=academia;integratedSecurity=true;";

        try (Connection connection = DriverManager.getConnection(connectionUrl);) {
            System.out.println("Conectado.");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
