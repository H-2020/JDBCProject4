package be.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConfig {

    private static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/messagedb",
                "chef",
                "2024"
        );
        System.out.println("CONNECTION TO DB IS MADE");

        return connection;
    }
}
