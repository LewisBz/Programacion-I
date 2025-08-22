/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.falabella;

/**
 * Clase Producto - esta clase maneja la logica de los productos
 * @author Hector Leon y Luis Grandett
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
    // retorna el nombre del producto
    public String getNombre(){
       return this.nombre;
    }
    //retorna el precio del producto
    public double getPrecio(){
       return this.precio;
    }
    // retorna el codigo del producto
    public String getCodigo(){
       return this.codigo;
    }
    // verifica si el precio del producto es mayor a 0
    public void setPrecio(double precio) {
    if (precio <= 0) {
        System.out.println("El precio debe ser mayor a 0");
        return;
    }
    this.precio = precio;
}
    
}