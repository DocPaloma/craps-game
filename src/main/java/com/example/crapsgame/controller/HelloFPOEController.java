package com.example.crapsgame.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class HelloFPOEController {

    @FXML
    private TextField nicknameTextField;

    @FXML
    void onActionFPOEButtom(ActionEvent event) {
        System.out.println("wahahaha");
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
