package com.example.lancr;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Objects;

public class CharacterSelectController {

    @FXML
    private Label welcomeLabel;

    @FXML
    private ImageView pinkCharacter;

    @FXML
    private ImageView blueCharacter;

    @FXML
    private ImageView greenCharacter;

    @FXML
    private ImageView yellowCharacter;

    @FXML
    private ImageView orangeCharacter;

    @FXML
    private ImageView blackCharacter;

    @FXML
    private ImageView whiteCharacter;

    @FXML
    private ImageView purpleCharacter;

    private Stage stage;
    private Scene scene;
    private Parent root;
    private String username;

    public void displayUsername(String user){
        username = user;
        welcomeLabel.setText(String.format("Welcome %s, select your character:", user));
    }

    public void pinkHoverOn(MouseEvent e){
        Image hover = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/lancr/Characters/PinkCharacter.png")));
        pinkCharacter.setImage(hover);
    }

    public void pinkHoverOff(MouseEvent e){
        Image normal = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/lancr/Characters/PinkCharacterShadow.png")));
        pinkCharacter.setImage(normal);
    }

    public void pinkSelect(MouseEvent e){
        try{
            // Moves to the CharacterConfirmation scene and sends the username
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CharacterConfirmation.fxml"));
            root = loader.load();
            CharacterConfirmationController characterConfirmationController = loader.getController();
            characterConfirmationController.defineUserCharacter("PINK", username);

            stage = (Stage)((Node)e.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (Exception ex) {
            System.err.println("An error has occurred: " + ex);
        }
    }

    public void blueHoverOn(MouseEvent e){
        Image hover = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/lancr/Characters/BlueCharacter.png")));
        blueCharacter.setImage(hover);
    }

    public void blueHoverOff(MouseEvent e){
        Image normal = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/lancr/Characters/BlueCharacterShadow.png")));
        blueCharacter.setImage(normal);
    }

    public void blueSelect(MouseEvent e){
        try{
            // Moves to the CharacterConfirmation scene and sends the username
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CharacterConfirmation.fxml"));
            root = loader.load();
            CharacterConfirmationController characterConfirmationController = loader.getController();
            characterConfirmationController.defineUserCharacter("BLUE", username);

            stage = (Stage)((Node)e.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (Exception ex) {
            System.err.println("An error has occurred: " + ex);
        }
    }

    public void greenHoverOn(MouseEvent e){
        Image hover = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/lancr/Characters/GreenCharacter.png")));
        greenCharacter.setImage(hover);
    }

    public void greenHoverOff(MouseEvent e){
        Image normal = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/lancr/Characters/GreenCharacterShadow.png")));
        greenCharacter.setImage(normal);
    }

    public void greenSelect(MouseEvent e){
        try{
            // Moves to the CharacterConfirmation scene and sends the username
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CharacterConfirmation.fxml"));
            root = loader.load();
            CharacterConfirmationController characterConfirmationController = loader.getController();
            characterConfirmationController.defineUserCharacter("GREEN", username);

            stage = (Stage)((Node)e.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (Exception ex) {
            System.err.println("An error has occurred: " + ex);
        }
    }

    public void yellowHoverOn(MouseEvent e){
        Image hover = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/lancr/Characters/YellowCharacter.png")));
        yellowCharacter.setImage(hover);
    }

    public void yellowHoverOff(MouseEvent e){
        Image normal = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/lancr/Characters/YellowCharacterShadow.png")));
        yellowCharacter.setImage(normal);
    }

    public void yellowSelect(MouseEvent e){
        try{
            // Moves to the CharacterConfirmation scene and sends the username
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CharacterConfirmation.fxml"));
            root = loader.load();
            CharacterConfirmationController characterConfirmationController = loader.getController();
            characterConfirmationController.defineUserCharacter("YELLOW", username);

            stage = (Stage)((Node)e.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (Exception ex) {
            System.err.println("An error has occurred: " + ex);
        }
    }

    public void orangeHoverOn(MouseEvent e){
        Image hover = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/lancr/Characters/OrangeCharacter.png")));
        orangeCharacter.setImage(hover);
    }

    public void orangeHoverOff(MouseEvent e){
        Image normal = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/lancr/Characters/OrangeCharacterShadow.png")));
        orangeCharacter.setImage(normal);
    }

    public void orangeSelect(MouseEvent e){
        try{
            // Moves to the CharacterConfirmation scene and sends the username
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CharacterConfirmation.fxml"));
            root = loader.load();
            CharacterConfirmationController characterConfirmationController = loader.getController();
            characterConfirmationController.defineUserCharacter("ORANGE", username);

            stage = (Stage)((Node)e.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (Exception ex) {
            System.err.println("An error has occurred: " + ex);
        }
    }

    public void blackHoverOn(MouseEvent e){
        Image hover = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/lancr/Characters/BlackCharacter.png")));
        blackCharacter.setImage(hover);
    }

    public void blackHoverOff(MouseEvent e){
        Image normal = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/lancr/Characters/BlackCharacterShadow.png")));
        blackCharacter.setImage(normal);
    }

    public void blackSelect(MouseEvent e){
        try{
            // Moves to the CharacterConfirmation scene and sends the username
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CharacterConfirmation.fxml"));
            root = loader.load();
            CharacterConfirmationController characterConfirmationController = loader.getController();
            characterConfirmationController.defineUserCharacter("BLACK", username);

            stage = (Stage)((Node)e.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (Exception ex) {
            System.err.println("An error has occurred: " + ex);
        }
    }

    public void whiteHoverOn(MouseEvent e){
        Image hover = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/lancr/Characters/WhiteCharacter.png")));
        whiteCharacter.setImage(hover);
    }

    public void whiteHoverOff(MouseEvent e){
        Image normal = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/lancr/Characters/WhiteCharacterShadow.png")));
        whiteCharacter.setImage(normal);
    }

    public void whiteSelect(MouseEvent e){
        try{
            // Moves to the CharacterConfirmation scene and sends the username
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CharacterConfirmation.fxml"));
            root = loader.load();
            CharacterConfirmationController characterConfirmationController = loader.getController();
            characterConfirmationController.defineUserCharacter("WHITE", username);

            stage = (Stage)((Node)e.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (Exception ex) {
            System.err.println("An error has occurred: " + ex);
        }
    }

    public void purpleHoverOn(MouseEvent e){
        Image hover = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/lancr/Characters/PurpleCharacter.png")));
        purpleCharacter.setImage(hover);
    }

    public void purpleHoverOff(MouseEvent e){
        Image normal = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/lancr/Characters/PurpleCharacterShadow.png")));
        purpleCharacter.setImage(normal);
    }

    public void purpleSelect(MouseEvent e){
        try{
            // Moves to the CharacterConfirmation scene and sends the username
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CharacterConfirmation.fxml"));
            root = loader.load();
            CharacterConfirmationController characterConfirmationController = loader.getController();
            characterConfirmationController.defineUserCharacter("PURPLE", username);

            stage = (Stage)((Node)e.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (Exception ex) {
            System.err.println("An error has occurred: " + ex);
        }
    }

    // Goes back to the main menu
    public void returnMainMenu(ActionEvent event){
        try{
            // Moves to the CharacterSelect scene
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MainMenu.fxml")));
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
