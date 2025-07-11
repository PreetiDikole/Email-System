package email_system;

import corejava.Connection;
import corejava.SQLException;

public class DatabaseConnection {
	private static final String URL = "jdbc:postgresql://localhost:5432/email_system";
    private static final String USER = "postgres";
    private static final String PASSWORD = "priti2612";

    public static Connection getConnection() throws SQLException 
    {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

