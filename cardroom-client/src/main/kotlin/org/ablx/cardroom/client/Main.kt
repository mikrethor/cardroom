package org.ablx.cardroom.client

import javafx.application.Application
import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.text.Text
import javafx.stage.Stage


class Main : Application() {

    @FXML private val actiontarget: Text? = null

    @FXML protected fun handleSubmitButtonAction(event: ActionEvent) {
        actiontarget?.setText("Sign in button pressed")
    }

    @FXML protected fun handleKeyInput(event: ActionEvent) {
        actiontarget?.setText("Sign in button pressed")
    }

    @FXML protected fun handleAboutAction(event: ActionEvent) {
        actiontarget?.setText("Sign in button pressed")
    }

    public val action: EventHandler<ActionEvent> = object : EventHandler<ActionEvent> {

        override fun handle(event: ActionEvent) {
            println("Hello World!")
        }
    }

    override fun start(primaryStage: Stage) {

//        val btn = Button()
//        btn.setText("Say 'Hello World'")
//        val action: EventHandler<ActionEvent> = object : EventHandler<ActionEvent> {
//
//            override fun handle(event: ActionEvent) {
//                println("Hello World!")
//            }
//        }
//        btn.setOnAction(action)

        //val root = StackPane()
      val root: Parent = FXMLLoader.load<Any>(javaClass.getResource("/cardroom.fxml")) as Parent
    //    root.children.add(btn)

        val scene = Scene(root, 300.0, 250.0)

        primaryStage.setTitle("Cardroom")
        primaryStage.setScene(scene)
        primaryStage.setResizable(false)
        primaryStage.setFullScreen(true)

        primaryStage.show()

    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            Application.launch(Main::class.java, *args)


        }
    }
}