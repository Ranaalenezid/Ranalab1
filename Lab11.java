/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author roody
 */
public class Lab11 extends Application {
    
    double g = 0;

    @Override
    public void start(Stage primaryStage) {
         Button b1 = new Button("Rott");
        Rectangle r3 = new Rectangle(20, 20);
        r3.setStroke(Color.ALICEBLUE);
        r3.setFill(Color.BLACK);
        StackPane pan = new StackPane();
        pan.getChildren().add(r3);
      
        BorderPane pan2 = new BorderPane();
        b1.setBottom(Pos.BOTTOM_CENTER);
        b1.setAlignment(Pos.CENTER);
        pan.setCenter(Pos.CENTER);
        pan2.setTitle("nnn");
        Scene c1=new   Scene(pan2,200,200);
         primaryStage.setScene(c1);
          primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}

class BallPane extends Pane {
    
    private Circle c;
    
    public BallPane() {
        this(0, 0, 0);
        
    }
    
    public BallPane(double x, double y, double r) {
        c = new Circle(x, y, r);
        c.setFill(Color.BLUE);
        c.setStroke(Color.BROWN);
        getChildren().add(c);
        
    }
    
    void movup() {
        c.setCenterY(c.getCenterY() - 10);
    }
    
    void movdon() {
        c.setCenterY(c.getCenterY() + 10);
    }
    
    void movLift() {
        c.setCenterX(c.getCenterX() - 10);
    }
    
    void movRight() {
        c.setCenterX(c.getCenterX() + 10);
    }
    
}
