/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Layouts;


import java.io.FileInputStream;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 *
 * @author Estudiante
 */
public class Mensaje extends Application{
    
    @Override
    public void start(Stage primaryStage) throws Exception{
    FileInputStream input = new FileInputStream("icon.png");
    Image image=new Image(input);
    Label l=new Label("No",new ImageView(image));
    VBox v = new VBox();
    v.getChildren().add(l);
    Scene scene = new Scene(v, 200, 100);
    primaryStage.setScene(scene);
    primaryStage.show(); 
    
    }
    public static void main(String[] args) {
        Application.launch(args);
    
    
    }
}

   
