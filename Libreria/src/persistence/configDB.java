package persistence;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class configDB {
    // Connection
    static Connection connection = null;

    // Method to open
    public static Connection openConnection(){
        try{
            // Install Driver MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Credentials
            String URL = "jdbc:mysql://localhost:3306/libreria";
            String user = "root";
            String password = "";

            // establishing the connection
            connection = DriverManager.getConnection(URL,user,password);
            System.out.println("Connection established");

        } catch (ClassNotFoundException error) {
            throw new RuntimeException("ERROR: Driver MySQL not found "+ error.getMessage());
        } catch (SQLException error) {
            System.out.println("ERROR: Connection failed" + error.getMessage());
        }

        return  connection;
    }

    // Method to closed
    public static void closeConnection() {
        try {
            if (connection != null) connection.close();
            System.out.println("Connection closed");
        }catch (SQLException e) {
            System.out.println("ERROR: Connection not close");
        }
    }
}
