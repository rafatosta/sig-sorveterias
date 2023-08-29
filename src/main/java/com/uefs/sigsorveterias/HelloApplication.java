package com.uefs.sigsorveterias;

import com.uefs.sigsorveterias.dao.DAO;
import com.uefs.sigsorveterias.model.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication /*extends Application*/ {
    /*@Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }*/

    public static void main(String[] args) {
        //launch();
        DAO.getClienteDAO().create(new Cliente("A",'123'));
        DAO.getClienteDAO().create(new Cliente("B",'789'));

    }
}