package com.example.crapsgame;

import com.example.crapsgame.models.Cat;
import com.example.crapsgame.models.Dog;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        /*
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        */

        Button button = new Button("Event test");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("hi, how are ya?");
                System.out.println("Type" + actionEvent.getEventType());
                System.out.println("Source" + actionEvent.getSource());
                System.out.println("Target" + actionEvent.getTarget());
            }
        });

        Label label = new Label("Vaal Hazak");
        label.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("Hi, yes.");
                System.out.println("Type" + mouseEvent.getEventType());
                System.out.println("Source" + mouseEvent.getSource());
                System.out.println("Target" + mouseEvent.getTarget());
            }
        });

        VBox vBox = new VBox();
        vBox.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("Hi, no.");
                System.out.println("Type" + mouseEvent.getEventType());
                System.out.println("Source" + mouseEvent.getSource());
                System.out.println("Target" + mouseEvent.getTarget());
            }
        });

        vBox.getChildren().add(button);
        vBox.getChildren().add(label);
        Scene scene = new Scene(vBox,200,200);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}