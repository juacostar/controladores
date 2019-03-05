/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class vista1 {
    private Scene escena;
    private VBox layout;
    
    
    private Label nombre;;
    private TextField campoNombre;
    
    private Label apellido;
    private TextField campoApellido;
    
    private Button siguiente;
    
    public vista1() {
        this.nombre=new Label("nombre: ");
        this.apellido=new Label("apellido: ");
        this.campoNombre=new TextField();
        this.campoApellido= new TextField();
        this.siguiente=new Button("Siguiente");
        this.layout=new VBox(nombre,campoNombre,apellido,campoApellido,siguiente);
        this.escena=new Scene(layout,200,300);
    }
    
    public void mostrar(Stage stage){
        stage.setTitle("vista 1");
        stage.setScene(this.escena);
        stage.show();
    }

    public TextField getCampoNombre() {
        return campoNombre;
    }

    public void setCampoNombre(TextField campoNombre) {
        this.campoNombre = campoNombre;
    }

    public TextField getCampoApellido() {
        return campoApellido;
    }

    public void setCampoApellido(TextField campoApellido) {
        this.campoApellido = campoApellido;
    }

    public Button getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Button siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
