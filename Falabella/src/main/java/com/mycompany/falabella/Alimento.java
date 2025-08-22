package com.mycompany.falabella;

/**
 *
 * @author hecis
 */
public class Alimento extends Producto {
    String fechaVencimiento;
    
    public Alimento(String nombre, double precio, String codigo, String fechaVencimiento) {
        super(nombre, precio, codigo);
        this.fechaVencimiento = fechaVencimiento;
    }
    
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    // 🔹 Sobrescribir toString()
    @Override
    public String toString() {
        return super.toString() + " | Vence: " + fechaVencimiento;
    }
}
