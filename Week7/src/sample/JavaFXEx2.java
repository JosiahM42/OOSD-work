package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Orientation;


public class JavaFXEx2 extends Application {

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage)
    {
        StackPane pane = new StackPane(); // Make a pane to work with

        // create a new button, and add it to the pane’s list of children
        pane.getChildren().add(new Button("MyButton"));
        /*HBox root = new HBox(5);
        root.setPadding(new Insets(10));
        root.setAlignment(Pos.BASELINE_RIGHT);

        Button fn = new Button("FirstName");
        Button ln = new Button("LastName");
        Button ad = new Button("Add");
        Button dl = new Button("Delete");
        root.getChildren().addAll(fn, ln, ad, dl);
        */
        FlowPane root = new FlowPane(Orientation.VERTICAL, 5, 5);
        root.setPadding(new Insets(5));
        for (int i=0; i<5; i++) {
            root.getChildren().add(new Button(String.valueOf(i)));
        }

        // Make a new scene, containing the pane
        Scene scene = new Scene(root, 200, 250);
        primaryStage.setTitle("Button in a pane"); // Set the stage title
        primaryStage.setScene(scene);              // Put scene in the stage
        primaryStage.show();                       // Display the stage

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}

