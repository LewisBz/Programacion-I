/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.falabella;

/**
 *
 * @author hecis
 */

//clase electrodomestico que hereda a los atributos de producto, y añade un atributo de garantia
public class Electrodomestico extends Producto{
    int garantia;
    //constructor que pone el atributo de la garantia para usarlo en el inventario
    public Electrodomestico(String nombre, double precio, String codigo, int garantia) {
        super(nombre, precio, codigo);
        this.garantia = garantia;  
    }
    //getter que toma la garantia
    public int getGarantia() {
        return garantia;
    }

    //setter que cambia el valor de garantia
    public void setGarantia(int garantia) {
        if (garantia <= 0) {
            System.out.println("La garantía debe ser mayor a 0 meses");
        }
        this.garantia = garantia;
    }

    //sobreescribe el texto del metodo
    @Override
    public String toString() {
        return super.toString() + " | Garantia: " + garantia + " meses";
    }
    
    
    
}
