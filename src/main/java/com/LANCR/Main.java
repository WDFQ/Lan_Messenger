package com.LANCR;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a simple UI element
        Label label = new Label("Hello, JavaFX!");

        // Layout container
        StackPane root = new StackPane(label);

        // Set the scene
        Scene scene = new Scene(root, 400, 300);

        // Set up the stage (window)
        primaryStage.setTitle("LAN Chat Room");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Start the JavaFX application
    }
}
