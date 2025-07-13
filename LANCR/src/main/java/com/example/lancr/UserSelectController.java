package com.example.lancr;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

import java.util.Objects;

public class UserSelectController {
    
    @FXML
    private ImageView logoImage;

    @FXML
    private Label usernameLabel;

    public void defineUser(String character, String username){
        // Customises the logo and username according to the user
        Background background;
        Border border;

        switch (character) {
            case "PINK" -> {
                // Set character image
                Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/lancr/Characters/PinkCharacter.png")));
                logoImage.setImage(image);

                // Set username and colour
                usernameLabel.setTextFill(Color.web("#ff5b85"));

                // Set username background
                BackgroundFill backgroundFill = new BackgroundFill(Color.web("#fec9cf"), CornerRadii.EMPTY, Insets.EMPTY);
                background = new Background(backgroundFill);

                // Set username border
                BorderStroke borderStroke = new BorderStroke(Color.web("#fd879e"), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(2, 2, 2, 2));
                border = new Border(borderStroke);

            }
            case "BLUE" -> {
                // Set character image
                Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/lancr/Characters/BlueCharacter.png")));
                logoImage.setImage(image);

                // Set username and colour
                usernameLabel.setTextFill(Color.web("#1c50de"));

                // Set username background
                BackgroundFill backgroundFill = new BackgroundFill(Color.web("#43c5f8"), CornerRadii.EMPTY, Insets.EMPTY);
                background = new Background(backgroundFill);

                // Set username border
                BorderStroke borderStroke = new BorderStroke(Color.web("#48a2fa"), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(2, 2, 2, 2));
                border = new Border(borderStroke);

            }
            case "GREEN" -> {
                // Set character image
                Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/lancr/Characters/GreenCharacter.png")));
                logoImage.setImage(image);

                // Set username and colour
                usernameLabel.setTextFill(Color.web("#39916a"));

                // Set username background
                BackgroundFill backgroundFill = new BackgroundFill(Color.web("#a9e154"), CornerRadii.EMPTY, Insets.EMPTY);
                background = new Background(backgroundFill);

                // Set username border
                BorderStroke borderStroke = new BorderStroke(Color.web("#54bb3e"), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(2, 2, 2, 2));
                border = new Border(borderStroke);

            }
            case "YELLOW" -> {
                // Set character image
                Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/lancr/Characters/YellowCharacter.png")));
                logoImage.setImage(image);

                // Set username and colour
                usernameLabel.setTextFill(Color.web("#ecb40c"));

                // Set username background
                BackgroundFill backgroundFill = new BackgroundFill(Color.web("#fded82"), CornerRadii.EMPTY, Insets.EMPTY);
                background = new Background(backgroundFill);

                // Set username border
                BorderStroke borderStroke = new BorderStroke(Color.web("#fbd929"), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(2, 2, 2, 2));
                border = new Border(borderStroke);

            }
            case "ORANGE" -> {
                // Set character image
                Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/lancr/Characters/OrangeCharacter.png")));
                logoImage.setImage(image);

                // Set username and colour
                usernameLabel.setTextFill(Color.web("#f95813"));

                // Set username background
                BackgroundFill backgroundFill = new BackgroundFill(Color.web("#fdaf44"), CornerRadii.EMPTY, Insets.EMPTY);
                background = new Background(backgroundFill);

                // Set username border
                BorderStroke borderStroke = new BorderStroke(Color.web("#fa8621"), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(2, 2, 2, 2));
                border = new Border(borderStroke);

            }
            case "BLACK" -> {
                // Set character image
                Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/lancr/Characters/BlackCharacter.png")));
                logoImage.setImage(image);

                // Set username and colour
                usernameLabel.setTextFill(Color.web("#190605"));

                // Set username background
                BackgroundFill backgroundFill = new BackgroundFill(Color.web("#a9a9a9"), CornerRadii.EMPTY, Insets.EMPTY);
                background = new Background(backgroundFill);

                // Set username border
                BorderStroke borderStroke = new BorderStroke(Color.web("#333333"), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(2, 2, 2, 2));
                border = new Border(borderStroke);

            }
            case "WHITE" -> {
                // Set character image
                Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/lancr/Characters/WhiteCharacter.png")));
                logoImage.setImage(image);

                // Set username and colour
                usernameLabel.setTextFill(Color.web("#bdcfd4"));

                // Set username background
                BackgroundFill backgroundFill = new BackgroundFill(Color.web("#fcfcfc"), CornerRadii.EMPTY, Insets.EMPTY);
                background = new Background(backgroundFill);

                // Set username border
                BorderStroke borderStroke = new BorderStroke(Color.web("#d9e0e5"), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(2, 2, 2, 2));
                border = new Border(borderStroke);

            }
            case "PURPLE" -> {
                // Set character image
                Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/lancr/Characters/PurpleCharacter.png")));
                logoImage.setImage(image);

                // Set username and colour
                usernameLabel.setTextFill(Color.web("#7664e7"));

                // Set username background
                BackgroundFill backgroundFill = new BackgroundFill(Color.web("#ead4fd"), CornerRadii.EMPTY, Insets.EMPTY);
                background = new Background(backgroundFill);

                // Set username border
                BorderStroke borderStroke = new BorderStroke(Color.web("#a27ff2"), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(2, 2, 2, 2));
                border = new Border(borderStroke);

            }
            default -> {
                // Set to default black character
                // Set character image
                Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/lancr/Characters/BlackCharacter.png")));
                logoImage.setImage(image);

                // Set username and colour
                usernameLabel.setTextFill(Color.web("#190605"));

                // Set username background
                BackgroundFill backgroundFill = new BackgroundFill(Color.web("#a9a9a9"), CornerRadii.EMPTY, Insets.EMPTY);
                background = new Background(backgroundFill);

                // Set username border
                BorderStroke borderStroke = new BorderStroke(Color.web("#333333"), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(2, 2, 2, 2));
                border = new Border(borderStroke);
            }
        }

        // Set styling of username
        usernameLabel.setText(username);
        usernameLabel.setBackground(background);
        usernameLabel.setBorder(border);
    }



}
