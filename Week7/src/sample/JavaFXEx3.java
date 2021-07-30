package sample;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.PasswordField;



public class JavaFXEx3 extends Application{
    @Override
    public void start(Stage stage) {
        //creating label first name
        Text text1 = new Text("First Name:");

        //creating label last name
        Text text2 = new Text("Last Name:");

        //Creating Text Filed for first name
        TextField textField1 = new TextField();

        //Creating Text Filed for last name
        TextField textField2 = new TextField();

        //creating label last name
        Text text3 = new Text("Email:");

        //Creating Text Filed for password
        TextField textField3 = new TextField();

        //creating label last name
        Text text4 = new Text("Password:");

        //Creating Text Filed for password
        PasswordField textField4 = new PasswordField();


        //Creating Buttons
        Button button1 = new Button("Add Name");
        Button button2 = new Button("Clear Name");

        //Creating a Grid Pane
        GridPane gridPane = new GridPane();

        //Setting size for the pane
        gridPane.setMinSize(400, 250);

        //Setting the padding
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        //Setting the vertical and horizontal gaps between the columns
        gridPane.setVgap(7);
        gridPane.setHgap(7);

        //Setting the Grid alignment
        gridPane.setAlignment(Pos.CENTER);

        //Arranging all the nodes in the grid
        gridPane.add(text1, 0, 0);
        gridPane.add(textField1, 1, 0);
        gridPane.add(text2, 0, 1);
        gridPane.add(textField2, 1, 1);

        gridPane.add(text3, 0, 2);
        gridPane.add(textField3, 1, 2);

        gridPane.add(text4, 0, 3);
        gridPane.add(textField4, 1, 3);

        gridPane.add(button1, 0, 4);
        gridPane.add(button2, 1, 4);

        //Styling nodes
        button1.setStyle("-fx-background-color: blue; -fx-text-fill: white;");
        button2.setStyle("-fx-background-color: blue; -fx-text-fill: white;");
        text1.setStyle("-fx-font: normal bold 20px 'arial' ");
        text2.setStyle("-fx-font: normal bold 20px 'arial' ");
        text3.setStyle("-fx-font: normal bold 20px 'arial' ");
        text4.setStyle("-fx-font: normal bold 20px 'arial' ");
        gridPane.setStyle("-fx-background-color: WHILE;");

        // Creating a scene object
        Scene scene = new Scene(gridPane);

        // Setting title to the Stage
        stage.setTitle("CSS Name Example");

        // Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}
