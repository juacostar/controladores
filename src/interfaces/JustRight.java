/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author Estudiante
 */
public class JustRight implements EventHandler<ActionEvent>{

    @Override
    public void handle(ActionEvent t) {
        System.out.println("A juan Diego le gusta el ");
    }
    
}
