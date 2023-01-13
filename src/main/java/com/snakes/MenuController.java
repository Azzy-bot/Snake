package com.snakes;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {

    @FXML
    Button StartButton;

    @FXML
    void onStartButtonPress() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainMenu.class.getResource("Game.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        Stage stage = (Stage)StartButton.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

}