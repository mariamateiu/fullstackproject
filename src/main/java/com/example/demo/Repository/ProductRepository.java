package com.example.demo.Repository;

import com.example.demo.Model.Ønsker;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import utility.ConnectionManager;

import javax.swing.text.DefaultEditorKit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductRepository {

public void addWish(Ønsker ønske) {
    Connection connection = ConnectionManager.connectionToDB();
    try {

        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO ønske(name) VALUES(?)");
        preparedStatement.setString(1, ønske.getName());

        preparedStatement.executeUpdate();
    } catch (SQLException sqlException){
        System.out.println("nej");
    }
}
}
