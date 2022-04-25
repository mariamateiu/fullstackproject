package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;

@SpringBootApplication
@RestController
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    String url = "jdbc:mysql://localhost:3306/ønsker";
    String user = "root";
    String password = "N123naomi";


    Connection gg;

    {
        try {
            gg = DriverManager.getConnection(url,user,password);
            Statement myStmt = gg.createStatement();
            String sql = "select * from ønsker.opret_ønsker";
            myStmt.executeUpdate("insert into opret_ønsker" + "(first_name,last_name)" + "values ('maria','lone')");
            System.out.println("all good");
            ResultSet rs = myStmt.executeQuery(sql);



            System.out.println("hej");
            while(rs.next())

                System.out.println(rs.getString("last_name"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @GetMapping
    public String hello(){
        return "Hello World";
    }

}
