/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tecsup.spring.model;

/**
 *
 * @author Enrique Palacios
 */
public class Musico {
    private String nombre;
    private int canciones;
    private Instrumento instrumento;

    public Musico(){}
    
    public Musico(int canciones) {
        this.canciones = canciones;
    }

    public Musico(int canciones, Instrumento instrumento) {
        this.canciones = canciones;
        this.instrumento = instrumento;
    }
        
    public void who(){
      System.out.println("Soy un musico. :D");
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }

    public int getCanciones() {
        return canciones;
    }

    public void setCanciones(int canciones) {
        this.canciones = canciones;
    }
    
    
}
