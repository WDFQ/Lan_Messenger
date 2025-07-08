package com.example.lancr;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Objects;

public class CharacterConfirmationController {

    @FXML
    private ImageView userCharacterImage;

    @FXML
    private Label usernameLabel;

    private String userCharacter = "";
    private String username = "username";

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void defineUserCharacter(String character, String user){
        userCharacter = character;
        username = user;

        Background background;
        Border border;

        if (userCharacter.equals("PINK")){
            // Set character image
            Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/lancr/Characters/PinkCharacter.png")));
            userCharacterImage.setImage(image);

            // Set username and colour
            usernameLabel.setTextFill(Color.web("#ff5b85"));

            // Set username background
            BackgroundFill backgroundFill = new BackgroundFill(Color.web("#fec9cf"), CornerRadii.EMPTY, Insets.EMPTY);
            background = new Background(backgroundFill);

            // Set username border
            BorderStroke borderStroke = new BorderStroke(Color.web("#fd879e"), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(2, 2, 2, 2));
            border = new Border(borderStroke);

        } else if (userCharacter.equals("BLUE")) {
            // Set character image
            Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/lancr/Characters/BlueCharacter.png")));
            userCharacterImage.setImage(image);

            // Set username and colour
            usernameLabel.setTextFill(Color.web("#1c50de"));

            // Set username background
            BackgroundFill backgroundFill = new BackgroundFill(Color.web("#43c5f8"), CornerRadii.EMPTY, Insets.EMPTY);
            background = new Background(backgroundFill);

            // Set username border
            BorderStroke borderStroke = new BorderStroke(Color.web("#48a2fa"), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(2, 2, 2, 2));
            border = new Border(borderStroke);

        } else if (userCharacter.equals("GREEN")) {
            // Set character image
            Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/lancr/Characters/GreenCharacter.png")));
            userCharacterImage.setImage(image);

            // Set username and colour
            usernameLabel.setTextFill(Color.web("#39916a"));

            // Set username background
            BackgroundFill backgroundFill = new BackgroundFill(Color.web("#a9e154"), CornerRadii.EMPTY, Insets.EMPTY);
            background = new Background(backgroundFill);

            // Set username border
            BorderStroke borderStroke = new BorderStroke(Color.web("#54bb3e"), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(2, 2, 2, 2));
            border = new Border(borderStroke);
            
        } else if (userCharacter.equals("YELLOW")) {
            // Set character image
            Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/lancr/Characters/YellowCharacter.png")));
            userCharacterImage.setImage(image);

            // Set username and colour
            usernameLabel.setTextFill(Color.web("#ecb40c"));

            // Set username background
            BackgroundFill backgroundFill = new BackgroundFill(Color.web("#fded82"), CornerRadii.EMPTY, Insets.EMPTY);
            background = new Background(backgroundFill);

            // Set username border
            BorderStroke borderStroke = new BorderStroke(Color.web("#fbd929"), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(2, 2, 2, 2));
            border = new Border(borderStroke);
            
        } else if (userCharacter.equals("ORANGE")) {
            // Set character image
            Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/lancr/Characters/OrangeCharacter.png")));
            userCharacterImage.setImage(image);

            // Set username and colour
            usernameLabel.setTextFill(Color.web("#f95813"));

            // Set username background
            BackgroundFill backgroundFill = new BackgroundFill(Color.web("#fdaf44"), CornerRadii.EMPTY, Insets.EMPTY);
            background = new Background(backgroundFill);

            // Set username border
            BorderStroke borderStroke = new BorderStroke(Color.web("#fa8621"), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(2, 2, 2, 2));
            border = new Border(borderStroke);
            
        } else if (userCharacter.equals("BLACK")) {
            // Set character image
            Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/lancr/Characters/BlackCharacter.png")));
            userCharacterImage.setImage(image);

            // Set username and colour
            usernameLabel.setTextFill(Color.web("#190605"));

            // Set username background
            BackgroundFill backgroundFill = new BackgroundFill(Color.web("#a9a9a9"), CornerRadii.EMPTY, Insets.EMPTY);
            background = new Background(backgroundFill);

            // Set username border
            BorderStroke borderStroke = new BorderStroke(Color.web("#333333"), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(2, 2, 2, 2));
            border = new Border(borderStroke);

        } else if (userCharacter.equals("WHITE")) {
            // Set character image
            Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/lancr/Characters/WhiteCharacter.png")));
            userCharacterImage.setImage(image);

            // Set username and colour
            usernameLabel.setTextFill(Color.web("#bdcfd4"));

            // Set username background
            BackgroundFill backgroundFill = new BackgroundFill(Color.web("#fcfcfc"), CornerRadii.EMPTY, Insets.EMPTY);
            background = new Background(backgroundFill);

            // Set username border
            BorderStroke borderStroke = new BorderStroke(Color.web("#d9e0e5"), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(2, 2, 2, 2));
            border = new Border(borderStroke);

        } else if (userCharacter.equals("PURPLE")) {
            // Set character image
            Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/lancr/Characters/PurpleCharacter.png")));
            userCharacterImage.setImage(image);

            // Set username and colour
            usernameLabel.setTextFill(Color.web("#7664e7"));

            // Set username background
            BackgroundFill backgroundFill = new BackgroundFill(Color.web("#ead4fd"), CornerRadii.EMPTY, Insets.EMPTY);
            background = new Background(backgroundFill);

            // Set username border
            BorderStroke borderStroke = new BorderStroke(Color.web("#a27ff2"), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(2, 2, 2, 2));
            border = new Border(borderStroke);

        } else{
            // Set to default black character
            // Set character image
            Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/lancr/Characters/BlackCharacter.png")));
            userCharacterImage.setImage(image);

            // Set username and colour
            usernameLabel.setTextFill(Color.web("#190605"));

            // Set username background
            BackgroundFill backgroundFill = new BackgroundFill(Color.web("#a9a9a9"), CornerRadii.EMPTY, Insets.EMPTY);
            background = new Background(backgroundFill);

            // Set username border
            BorderStroke borderStroke = new BorderStroke(Color.web("#333333"), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(2, 2, 2, 2));
            border = new Border(borderStroke);
        }

        // Set styling of username
        usernameLabel.setText(username);
        usernameLabel.setBackground(background);
        usernameLabel.setBorder(border);
    }

    public void returnToCharacterSelect(ActionEvent event){
        try{
            // Moves to the CharacterConfirmation scene and sends the username
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CharacterSelect.fxml"));
            root = loader.load();
            CharacterSelectController characterSelectController = loader.getController();
            characterSelectController.displayUsername(username);

            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }
        catch (Exception e){
            System.err.println("There has been an error: " + e);
        }
    }
}
