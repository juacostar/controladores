/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Layouts;

import javafx.application.Application;
import static javafx.beans.binding.Bindings.and;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class Constrait extends Application{
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridpane = new GridPane();
        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPercentWidth(20);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPercentWidth(30);
        gridpane.getColumnConstraints().addAll(col1,col2,col2,col1);
        Label text = new Label("Enter Address");
        gridpane.add(text, 0, 0, 4, 1); // (Columna 0, Fila 0) and colspan 4(lo  que se expande)
        GridPane.setHalignment(text, HPos.CENTER);
        Label direccion = new Label("Direccion");
        gridpane.add(direccion, 0, 1, 1, 1); // (Columna 0, Fila 1) and colspan 1
        GridPane.setHalignment(direccion, HPos.RIGHT);
        TextField txtDireccion = new TextField();
        gridpane.add(txtDireccion, 1, 1, 4, 1); // (Columna 0, Fila 1 and colspan 1
        Label direccion2 = new Label("Nueva Direccion");
        TextField txtDireccion2 = new TextField();
        gridpane.add(direccion2, 0, 2, 1, 2); // (Columna 0, Fila 1) and colspan 1
        gridpane.add(txtDireccion2, 1, 2, 4, 2); // (Columna 0, Fila 1) and colspan
        Scene scene= new Scene(gridpane,1200,1000);
        primaryStage.setScene(scene);
        primaryStage.show(); 
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    
    
    }

}
