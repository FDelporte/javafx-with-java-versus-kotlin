package be.webtechie;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainJava extends Application {

    @Override
    public void start(Stage stage) {
        var borderPane = new BorderPane();

        var label = new Label("Demo with Java");
        label.setStyle("-fx-font-family: Arial; -fx-font-size: 36px; -fx-font-weight: bold;");
        borderPane.setTop(label);
        BorderPane.setAlignment(label, Pos.CENTER);

        var buttons = new VBox();
        buttons.setSpacing(10);
        buttons.getChildren().addAll(
                new Button("Button 1"),
                new Button("Button 2"),
                new Button("Button 3")
        );
        borderPane.setLeft(buttons);

        var exitButton = new Button("Exit");
        exitButton.setOnAction((event) -> Platform.exit());
        borderPane.setCenter(exitButton);

        var scene = new Scene(borderPane, 1024.0, 800.0);
        stage.setScene(scene);
        stage.setTitle("Demo application");
        stage.show();

        stage.setOnCloseRequest(event -> Platform.exit());
    }
}