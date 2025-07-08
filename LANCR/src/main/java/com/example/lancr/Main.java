package com.example.lancr;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.image.Image;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {

    // Starts the program by calling start
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        // Loading custom font
        Font tahoma = Font.loadFont(getClass().getResourceAsStream("/com/example/lancr/windows-xp-tahoma.ttf"), 40);

        // Starting fxml file and linking controller
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MainMenu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);

        // Setting the stage
        stage.setTitle("LAN Chatroom");
        stage.setResizable(false);
        stage.setScene(scene);

        // Setting custom icon
        Image icon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/lancr/icon.png")));
        stage.getIcons().add(icon);

        // Shows the stage
        stage.show();
    }

}