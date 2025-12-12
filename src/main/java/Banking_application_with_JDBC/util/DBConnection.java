package Banking_application_with_JDBC.util;
import java.sql.*;
public class DBConnection {
    private static final String url="jdbc:mysql://localhost:3306/bankdb";
    private static final String USER = "root";
    private static final String password="7010";
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url,USER,password);
    }
}
