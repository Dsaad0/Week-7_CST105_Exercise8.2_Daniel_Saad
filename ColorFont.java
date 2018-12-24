/* Program:  ColorFont
  * File:     Colorfont.java
  * Summary:  Displays Test in different colors
  * Author:   Daniel Saad
  * Date:     12/22/18
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.layout.HBox;

public class ColorFont extends Application {

    @Override
    public void start(Stage primaryStage) {
        //Setting up pane
        Pane pane = new HBox(10);
        pane.setPadding(new Insets(10, 10, 10, 10));
        //Test 1 text
        Text test1 = new Text("TEST");
        test1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        test1.setOpacity(Math.random());
        test1.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        test1.setRotate(90);
        test1.setTranslateY(20);
        pane.getChildren().add(test1);
        //Test 2 text
        Text test2 = new Text("TEST");
        test2.setFont(Font.font("Aerial", FontWeight.BOLD, FontPosture.ITALIC, 22));
        test2.setOpacity(Math.random());
        test2.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        test2.setRotate(90);
        test2.setTranslateY(20);
        pane.getChildren().add(test2);
        //Test 3 text
        Text test3 = new Text("TEST");
        test3.setFont(Font.font("Courier New", FontWeight.BOLD, FontPosture.ITALIC, 22));
        test3.setOpacity(Math.random());
        test3.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        test3.setRotate(90);
        test3.setTranslateY(20);
        pane.getChildren().add(test3);
        //Test 4 text
        Text test4 = new Text("TEST");
        test4.setFont(Font.font("Abel", FontWeight.BOLD, FontPosture.ITALIC, 22));
        test4.setOpacity(Math.random());
        test4.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        test4.setRotate(90);
        test4.setTranslateY(20);
        pane.getChildren().add(test4);
        //Test 5 text
        Text test5 = new Text("TEST");
        test5.setFont(Font.font("Actor", FontWeight.BOLD, FontPosture.ITALIC, 22));
        test5.setOpacity(Math.random());
        test5.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        test5.setRotate(90);
        test5.setTranslateY(20);
        pane.getChildren().add(test5);
        //Setting up scene
        Scene scene = new Scene(pane, 350, 150);
        primaryStage.setTitle("Color And Font");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
