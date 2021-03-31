package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        var label = new Label("Font smoothing (LCD): This is some random Text. Please read me.");
        var label2 = new Label("Font smoothing (Gray): This is some random Text. Please read me.");
        label2.getStyleClass().add("grayfs");
        var pane = new StackPane(new VBox(label, label2));
        var scene = new Scene(pane, 800, 600);
        scene.getStylesheets().add(getClass().getResource("/styles.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}