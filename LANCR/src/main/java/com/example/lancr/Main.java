package com.example.lancr;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.StageStyle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;

import java.io.IOException;

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

        // Setting custom font
        Image icon = new Image(getClass().getResourceAsStream("/com/example/lancr/icon.png"));
        if (icon != null){
            stage.getIcons().add(icon);
        }


        // Shows the stage
        stage.show();
    }

}