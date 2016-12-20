package sample;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("");
        primaryStage.setScene(new Scene(root, 620, 480));
        primaryStage.alwaysOnTopProperty();
        primaryStage.setOpacity(1);
        primaryStage.show();

        EventHandler _ = new EventHandler() {
            @Override
            public void handle(Event event) {

            }
        };
    }



    public static void main(String[] args) {
        launch(args);
    }

    public static void buttonClicked(){

        System.out.println("Button was clicked!");

    }
}
