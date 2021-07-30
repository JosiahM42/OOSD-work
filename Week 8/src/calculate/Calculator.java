package calculate;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Calculator extends Application {
    // create text for input boxes
    private TextField numberOne = new TextField();
    private TextField numberTwo = new TextField();
    private TextField result = new TextField();

    private Button btAdd = new Button("Add");
    private Button btMinus = new Button("Subtract");
    private Button btMulti = new Button("Multiply");
    private Button btDiv = new Button("Divide");

    @Override
    public void start(Stage primaryStage) {

        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);

        GridPane gridPane = new GridPane();
        hBox.getChildren().add(btAdd);
        hBox.getChildren().add(btMinus);
        hBox.getChildren().add(btMulti);
        hBox.getChildren().add(btDiv);

       /* btAdd.setOnAction(e -> calculateAdd());
        btMinus.setOnAction(e -> calculateMinus());
        btMulti.setOnAction(e -> calculateMulti());
        btDiv.setOnAction(e -> calculateDiv()); */

        gridPane.add(new Label("Number 1:"), 0,0);
        gridPane.add(numberOne, 1, 0);

        gridPane.add(new Label("Number 2:"), 2,0);
        gridPane.add(numberTwo, 3, 0);

        gridPane.add(new Label("Result:"), 4,0);
        gridPane.add(result, 5, 0);


        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(gridPane);
        borderPane.setBottom(hBox);
        BorderPane.setAlignment(hBox, Pos.CENTER);


        Scene scene = new Scene(borderPane, 600, 250);
        primaryStage.setTitle("Calculator"); // Set title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void calculateAdd()
    {

    }

    private void calculateMinus()
    {

    }

    private void calculateMulti()
    {

    }

    private void calculateDiv()
    {

    }
}
