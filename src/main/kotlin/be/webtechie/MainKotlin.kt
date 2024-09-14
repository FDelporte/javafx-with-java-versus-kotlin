package be.webtechie

import javafx.application.Application
import javafx.application.Platform
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.layout.BorderPane
import javafx.scene.layout.VBox
import javafx.stage.Stage

class MainKotlin : Application() {
    override fun start(stage: Stage) {
        with(stage) {
            scene = Scene(BorderPane().apply {
                top = Label("Demo with Kotlin").apply {
                    alignment = Pos.CENTER
                    style = "-fx-font-family: Arial; -fx-font-size: 36px; -fx-font-weight: bold;"
                    prefWidth = Double.MAX_VALUE
                    BorderPane.setAlignment(this, Pos.CENTER);
                }

                left = VBox().apply {
                    spacing = 10.0
                    children.addAll(
                        Button("Button 1"),
                        Button("Button 2"),
                        Button("Button 3")
                    )
                }

                center = Button("Exit").apply {
                    setOnAction {
                        Platform.exit()
                    }
                }
            }, 1024.0, 800.0)

            title = "Demo application"

            setOnCloseRequest {
                Platform.exit()
            }

            show()
        }
    }
}