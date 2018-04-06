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
public class Producto {
    private String nombre;
    private int cant;
    private int costo;
    
    public Producto(String nombre, int cant,int costo){
        this.nombre=nombre;
        this.cant=cant;
        this.costo=costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
}
