/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman_projects.patronesestructurales;

/**
 *
 * @author USUARIO
 */
public class Producto {
    private String nombre;
    private float precio;
    private String tipo;
    
    Producto(String n, float p, String t){
        nombre=n;
        precio=p;
        tipo=t; 
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }
    
}
