package com.avianca.persistence.configDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConfig {
    private static Connection connection = null;
    public static Connection openConnection(){
        String URL = "jdbc:mysql://127.0.0.1:3306/avianca";
        String user = "root";
        String password = "";
        try {
            connection = DriverManager.getConnection(URL,user,password);
            System.out.println("Connected!");
        }catch (SQLException error){
            throw new RuntimeException(error.getMessage());
        }
        return connection;
    }

    public static void closeConnection(){
        if (connection!=null){
            try {
                connection.close();
                System.out.println("Disconnected!");
            } catch (SQLException error){
                throw new RuntimeException(error.getMessage());
            }
        }
    }
}
