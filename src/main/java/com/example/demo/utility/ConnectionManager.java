package com.example.demo.utility;

import java.sql.*;

public class ConnectionManager {
    private static Connection connection;
    private Statement myStmt;



    public static Connection connectionToDB () {


        String url = "jdbc:mysql://localhost:3306/wishes";
        String user = "root";
        String password = "N123naomi";

        try {
                connection = DriverManager.getConnection(url, user, password);
                System.out.println("we have a connection");
        } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("somethings wrong with the connection");
        }
        return connection;

    }

    public void insertInto () {
        String sql = "select * from ønsker.opret_ønsker";

        try {
            myStmt = connection.createStatement();
            myStmt.executeUpdate("insert into opret_ønsker" + "(first_name,last_name)" + "values ('maria','lone')");
        } catch (SQLException e) {
            e.printStackTrace();
        }


        System.out.println("all good");
        //ResultSet rs = myStmt.executeQuery(sql);
    }


}
