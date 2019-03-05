/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Estudiante
 */
public class Modelo {
    private int numero;
    
    public void incrementar(){
        this.numero++;
    }
    
    public void disminuir(){
        this.numero--;
    }
    
    public int getNumero(){
        return numero;
    }
}
