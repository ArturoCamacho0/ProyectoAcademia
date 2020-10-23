package servidor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Querys {
    public void select(String sql, int tam){
        String connectionUrl = "jdbc:sqlserver://localhost;database=academia;integratedSecurity=true;";
        ResultSet resultSet = null;

        try(Connection connection = DriverManager.getConnection(connectionUrl);
            Statement statement = connection.createStatement();){

            resultSet = statement.executeQuery(sql);
            
            while(resultSet.next()){
                for (int i = 1; i <= tam; i++) {
                    System.out.println("Columna #" + i + ": " + resultSet.getString(i));
                }
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
