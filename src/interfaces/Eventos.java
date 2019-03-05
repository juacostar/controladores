/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class Eventos extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        Label xx=new Label("xx: ");
        Label yy=new Label("yy: ");
        TextField x= new TextField();
        TextField y= new TextField();
        Button ok=new Button("ok");
        ok.setOnAction(new JustRight());
           
        HBox h1=new HBox(xx,x);
        HBox h2=new HBox(yy,y);
        VBox v=new VBox(h1,h2,ok);
        pane.add(xx, 0, 0);
        pane.add(x, 1, 0);
        pane.add(yy, 0, 1);
        pane.add(y, 1, 1);
        pane.add(ok, 1, 2);
        primaryStage.setTitle("MyJavaFX");
        Scene scene = new Scene(pane,200, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
     
        
    }
    
    public static void main(String[] args) {
            Application.launch(args);
    }
    
}
