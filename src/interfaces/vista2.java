/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class vista2 {
    private Scene escena;
    private VBox layout;
    private TextArea informacion;
    private Button regresar;

    public vista2() {
        this.informacion=new TextArea();
        this.regresar=new Button("Regresar");
        this.layout=new VBox(informacion,regresar);
        this.escena=new Scene(layout,200,300);
    }

    public TextArea getInformacion() {
        return informacion;
    }

    public void setInformacion(TextArea informacion) {
        this.informacion = informacion;
    }

    public Button getRegresar() {
        return regresar;
    }

    public void setRegresar(Button regresar) {
        this.regresar = regresar;
    }
    
    public void mostrar(Stage stage){
        stage.setTitle("vista 1");
        stage.setScene(this.escena);
        stage.show();
    }
    
    
}
