/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import modelo.Modelo;

/**
 *
 * @author Estudiante
 */
public class ControladorVista2 {
    public vista2 vista2;
    public Modelo modelo;

    public ControladorVista2(Modelo modelo) {
        this.modelo=modelo;
        this.vista2=new vista2();
        this.vista2.getRegresar().setOnAction(new EventoRegresar());
    }
    
    
    //clases internas
    class EventoRegresar implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            ControladorVista1 controlador=new ControladorVista1(modelo);
            controlador.mostrarVista();
        }
        
    }
    
    public void mostrarVista(){
        Singleton singleton=Singleton.getSingleton();
        this.vista2.mostrar(singleton.getStage());
    }

    public vista2 getVista2() {
        return vista2;
    }

    public void setVista2(vista2 vista2) {
        this.vista2 = vista2;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
    
    
    
}
