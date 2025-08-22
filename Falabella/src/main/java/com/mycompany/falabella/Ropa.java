package com.mycompany.falabella;

/**
 *
 * @author hecis
 */
public class Ropa extends Producto {
    String talla;
    String color;
    
    public Ropa(String nombre, double precio, String codigo, String talla, String color) {
        super(nombre, precio, codigo);
        this.talla = talla;
        this.color = color;
    }
    
    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 🔹 Sobrescribir toString()
    @Override
    public String toString() {
        return super.toString() + " | Talla: " + talla + " | Color: " + color;
    }
}
