/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import modelo.Modelo;
//SE PUEDE CREAR UN MAIN Y PONER UNA MISMA INSTANCIA DE NEGOCIO PARA TODOS LOS CONTROLADORES 
//SE CREAN METODOS ESTATICOS PARA NO TENER LA NECESIDAD DE CREAR OBJETOS, INSTANCIAS DE LA CLASE COMO CLASE MATH, INTEGER, ENTRE OTRAS  
/**
 *
 * @author Estudiante
 */
public class ControladorVista1 {
    public vista1 vista;
    public Modelo modelo;

    public ControladorVista1(Modelo modelo) {
        this.modelo=modelo;
        this.vista=new vista1();
        this.vista.getSiguiente().setOnAction(new EventoSiguiente());
    }
    
    
    class EventoSiguiente implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            ControladorVista2 controlador=new ControladorVista2(modelo);
            controlador.getVista2().getInformacion().setText(vista.getCampoNombre().getText());
            controlador.mostrarVista();
        }
        
    }
    
    public void mostrarVista(){
        Singleton singleton=Singleton.getSingleton();
        this.vista.mostrar(singleton.getStage());
    }
    
    
}
