package be.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConfig2 {
    public static Connection getConnection() {
        String url = "localhost"; // 127.0.0.1
        String port = "3306";
        String database = "accountdb";

        String username = "chef";
        String password = "2024";

        // jdbc:mysql://localhost:3306/accountdb
        String connectionString = String.format("jdbc:mysql://%s:%s/%s", url, port, database);

        try {
            Connection connection = DriverManager.getConnection(connectionString, username, password);
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }
}








