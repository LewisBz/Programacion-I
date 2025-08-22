package com.mycompany.falabella;

/**
 *
 * @author hecis
 */

//Clas hija de producto que hereda todos su atributos y hereda la fecha de vencimiento
public class Alimento extends Producto {
    String fechaVencimiento;
    
    //constructor de la clase, que instancia la fecha de vencimiento para poder usarla despues
    public Alimento(String nombre, double precio, String codigo, String fechaVencimiento) {
        super(nombre, precio, codigo);
        this.fechaVencimiento = fechaVencimiento;
    }
    //getter que recibe el valor de la fecha
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }
    //setter que pone una fecha nueva
    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    //esto es para sobreescribir en la descripcion del producto, el super es para usarlo como metodo que hereda al de producto
    @Override
    public String toString() {
        return super.toString() + " | Vence: " + fechaVencimiento;
    }
}
