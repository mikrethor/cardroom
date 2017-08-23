package org.ablx.cardroom.client

import javafx.application.Application
import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.layout.StackPane
import javafx.stage.Stage


class Main : Application() {


    override fun start(primaryStage: Stage) {
        val btn = Button()
        btn.setText("Say 'Hello World'")
        btn.setOnAction(object : EventHandler<ActionEvent> {

            override fun handle(event: ActionEvent) {
                println("Hello World!")
            }
        })

        val root = StackPane()
        root.children.add(btn)

        val scene = Scene(root, 300.0, 250.0)

        primaryStage.setTitle("Hello World!")
        primaryStage.setScene(scene)
        primaryStage.show()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            Application.launch(Main::class.java, *args)
           

        }
    }
}