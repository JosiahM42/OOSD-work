package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.scene.text.Font;
import javafx.scene.text.*;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;


public class JavaFXEx4 extends Application{
    @Override
    public void start(Stage stage) {
        //Drawing a Box
        Box box = new Box();

        //Setting the properties of the Box
        box.setWidth(100.0);
        box.setHeight(100.0);
        box.setDepth(100.0);

        Text text = new Text(60, 170, "3D Object");
        text.setFont(new Font(40));

        //Creating the translation transformation
        Translate translate = new Translate();

        translate.setX(300);
        translate.setY(100);
        translate.setZ(20);

        Rotate rxBox = new Rotate(0, 0, 0, 0, Rotate.X_AXIS);
        Rotate ryBox = new Rotate(0, 0, 0, 0, Rotate.Y_AXIS);
        Rotate rzBox = new Rotate(0, 0, 0, 0, Rotate.Z_AXIS);
        rxBox.setAngle(40);
        ryBox.setAngle(60);
        rzBox.setAngle(40);
        box.getTransforms().addAll(translate,rxBox, ryBox, rzBox);

        //Creating a Group object
        Group root = new Group(text ,box);

        //Creating a scene object
        Scene scene = new Scene(root, 400, 250);
        //setting color to the scene
        scene.setFill(Color.LIGHTBLUE);
        //Setting title to the Stage
        stage.setTitle("Drawing a 3D object");
        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }


    }
