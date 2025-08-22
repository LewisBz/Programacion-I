package com.mycompany.falabella;

/**
 * Clase Ropa(Hija) - Extiende de la Clase padre Producto
 * esta clase contiene toda la logica de ropa
 * @author Hector Leon y Luis Grandett 
 */
public class Ropa extends Producto {
    String talla;
    String color;
    
    public Ropa(String nombre, double precio, String codigo, String talla, String color) {
        super(nombre, precio, codigo);
        this.talla = talla;
        this.color = color;
    }
    // retorna la talla
    public String getTalla() {
        return talla;
    }
    
    public void setTalla(String talla) {
        this.talla = talla;
    }
    //retorna el color de la ropa
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