/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg2.poo;

/**
 *
 * @author Roberto Fuentes 00062217
 */
public class Proveedor {
    private String nombre;
    private int numtel;

    public Proveedor(String nombre, int numtel){
        this.nombre=nombre;
        this.numtel=numtel;
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumtel() {
        return numtel;
    }

    public void setNumtel(int numtel) {
        this.numtel = numtel;
    }
    
}
