package com.example.crapsgame.view;

import com.example.crapsgame.HelloApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class WelcomeView extends Stage {

    public WelcomeView() throws IOException {
        FXMLLoader fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("welcome-view.fxml"));
        Scene scene = new Scene(fxmlLoader2.load(), 320, 240);
        this.setTitle("Craps Game - Welome!!");
        this.setScene(scene);
    }

    public static WelcomeView getInstance()  throws IOException {
        if (WelcomeViewHolder.INSTANCE == null) {
            WelcomeViewHolder.INSTANCE = new WelcomeView();
            return WelcomeViewHolder.INSTANCE;
        }
        else {
            return WelcomeViewHolder.INSTANCE;
        }
    }

    private static class WelcomeViewHolder {
        private static WelcomeView INSTANCE;
    }


}
