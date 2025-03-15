package com.example.crapsgame.view;

import com.example.crapsgame.HelloApplication;
import com.example.crapsgame.controller.GameController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GameView extends Stage {

    private GameController gameController;

    public GameView() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/example/crapsgame/game-view.fxml"));
        Scene scene = new Scene(fxmlLoader.<Parent>load(), 320, 240);
        this.gameController = fxmlLoader.getController();
        this.setTitle("Craps Game - Welome!!");
        this.setScene(scene);
    }

    public static GameView getInstance()  throws IOException {
        if (GameViewHolder.INSTANCE == null) {
            GameViewHolder.INSTANCE = new GameView();
            return GameViewHolder.INSTANCE;
        }
        else {
            return GameViewHolder.INSTANCE;
        }
    }

    private static class GameViewHolder {
        private static GameView INSTANCE;
    }

    public GameController getGameController() {
        return gameController;
    }


}
