package com.example.demo.Repository;

import com.example.demo.Model.Ønsker;
import com.example.demo.utility.ConnectionManager;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class ProductRepository {

    ConnectionManager connectionManager = new ConnectionManager();

    public void addWish(Ønsker wish) {
        //connect
        //get connection from ConnectionManager
        Connection connection = ConnectionManager.connectionToDB();

        try {
            //prep statement
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO wishes.opret_wish(name) VALUES (?)");
            //set attributer
            preparedStatement.setString(1, wish.getName());
            //execute statement
            preparedStatement.executeUpdate();
        } catch (SQLException sqlException) {
            System.out.println("Could not create");
            sqlException.printStackTrace();
        }
    }

}