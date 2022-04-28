package com.example.demo.Repository;

import com.example.demo.Model.Ønsker;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import utility.ConnectionManager;

import javax.swing.text.DefaultEditorKit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductRepository {

    ConnectionManager connectionManager = new ConnectionManager();

    public void addWish(Ønsker wish) {
        //connect
        //get connection from ConnectionManager
        Connection connection = ConnectionManager.connectionToDB();

        try {
            //prep statement
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO product(name) VALUES (?)");
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