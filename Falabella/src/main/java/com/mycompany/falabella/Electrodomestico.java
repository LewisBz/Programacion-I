/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.falabella;

/**
 *
 * @author hecis
 */
public class Electrodomestico extends Producto{
    int garantia;
    
    public Electrodomestico(String nombre, double precio, String codigo, int garantia) {
        super(nombre, precio, codigo);
        this.garantia = garantia;  
    }
    
    public int getGarantia() {
        return garantia;
    }

    
    public void setGarantia(int garantia) {
        if (garantia <= 0) {
            System.out.println("La garantía debe ser mayor a 0 meses");
        }
        this.garantia = garantia;
    }

    // 🔹 Sobrescribir toString()
    @Override
    public String toString() {
        return super.toString() + " | Garantia: " + garantia + " meses";
    }
    
    
    
}
