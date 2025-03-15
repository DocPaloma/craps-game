package com.example.crapsgame.controller;

import com.example.crapsgame.models.Player;
import com.example.crapsgame.view.GameView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;

import java.io.IOException;

import static com.example.crapsgame.view.GameView.getInstance;

public class WelcomeController {

    @FXML
    private ImageView imageView;
    private int counter = 0;

    @FXML
    private TextField nicknameTextField;

    @FXML
    void onActionStartButtom(ActionEvent event) throws IOException {
        String nickname = nicknameTextField.getText();
        System.out.println(nickname);
        Player player = new Player();
        player.setNickname(nickname);

        GameView gameView = getInstance();
        gameView.getGameController().setPlayer(player);
        gameView.show();
    }


}