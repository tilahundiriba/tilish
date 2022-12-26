package com.example.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Button btn = new Button("ok");
        Button btn2 = new Button("CLOSE");
        HBox hbx = new HBox();
        hbx.getChildren().addAll(btn,btn2);
        hbx.setSpacing(10);
        Scene scene = new Scene(hbx, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}