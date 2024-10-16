package com.efigenio;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("views/JanelaPrincipal.fxml"));
        scene = new Scene(parent, 640, 800);
        stage.setScene(scene);
        stage.show();
    }

    


    @Override
    public void init() throws Exception {
        // TODO Auto-generated method stub
        super.init();
    }

    @Override
    public void stop() throws Exception {
        // TODO Auto-generated method stub
        super.stop();
    }
    public static void main(String[] args) {
        launch();
    }

}