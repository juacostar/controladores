/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class Hbox extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception{

    Button b1 = new Button("Number 1");
    Button b2= new Button("Number 2");
    HBox hbox= new HBox(b1,b2);
    Scene scene = new Scene(hbox, 200, 100);
    primaryStage.setScene(scene);
    primaryStage.show(); 
}


public static void main(String[] args) {
    Application.launch(args);
    }

    
}

