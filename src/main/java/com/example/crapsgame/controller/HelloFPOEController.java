package com.example.crapsgame.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;

public class HelloFPOEController {

    @FXML
    private ImageView imageView;
    private int counter = 0;

    @FXML
    private TextField nicknameTextField;

    @FXML
    void onActionFPOEButtom(ActionEvent event) {
        System.out.println("wahahaha");
        counter = counter +1;
        if (counter%%2=0){
            imageView.setImage(new Image(getClass().getResourceAsStream("/com/example/crapsgame/image/dice-1.png")));
        }
    }

    @FXML
    void onKeyPressedNicknameTextField(KeyEvent event) {
        String nickname = nicknameTextField.getText();
        System.out.println("+"+nickname);
        System.out.println(event.getCode());
    }

    @FXML
    void onKeyReleasedNicknameTextField(KeyEvent event) {
        String nickname = nicknameTextField.getText();
        System.out.println("-"+nickname);
    }



}
