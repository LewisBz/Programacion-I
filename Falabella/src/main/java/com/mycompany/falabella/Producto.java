/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.falabella;

/**
 *
 * @author hecis
 */
public class Producto {
    String nombre;
    double precio;
    String codigo;
    
    
    public Producto(String nombre, double precio,String codigo){
        if(precio<=0){
            System.out.println("El precio debe ser mayor a 0");
            return;
        }
        
        this.nombre=nombre;
        this.precio=precio;
        this.codigo=codigo;
    }
    
    
    public String toString() {
    return "Código: " + codigo + " | Nombre: " + nombre + " | Precio: $" + precio;
    }
    
    public String getNombre(){
       return this.nombre;
    }
    
    public double getPrecio(){
       return this.precio;
    }
    
    public String getCodigo(){
       return this.codigo;
    }

    public void setPrecio(double precio) {
    if (precio <= 0) {
        System.out.println("El precio debe ser mayor a 0");
        return;
    }
    this.precio = precio;
}
    
}
