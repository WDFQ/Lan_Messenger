package com.example.lancr;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.stage.Stage;

public class MainMenuController {
    @FXML
    private Label titleText;
    @FXML
    private Label usernameLabel;
    @FXML
    private TextField usernameTextField;
    @FXML
    private Button submitButton;

    String username;
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    protected void initialize() {

    }

    public void submitUsername(ActionEvent event){
        // Ensures the username is not empty
        try{
            if (!usernameTextField.getText().isEmpty()){
                username = usernameTextField.getText();
                System.out.println("username is " + username);

                // Moves to the CharacterSelect scene
                Parent root = FXMLLoader.load(getClass().getResource("CharacterSelect.fxml"));
                stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
            else{
                usernameTextField.setPromptText("Invalid username. Please try again.");
                usernameTextField.setBorder(new Border(new BorderStroke(Color.RED,
                        BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            }
        }
        catch (Exception e){
            usernameTextField.setPromptText("Error: " + e);
        }
    }

}

