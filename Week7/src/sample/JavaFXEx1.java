package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;




public class JavaFXEx1 extends Application {

    @Override
    public void start(Stage primaryStage)  {
        primaryStage.setTitle("OOSD2 Exercise 1");
        Button button = new Button("MyButton");

        Stage newStage = new Stage();
        newStage.setTitle("OOSD2 Exercise 1.4");
        Button button2 = new Button("YourButton");

        Scene scene = new Scene(button, 200, 100);
        Scene scene2 = new Scene(button2, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

        newStage.setScene(scene2);
        newStage.setResizable(false);
        newStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}

