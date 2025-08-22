package com.mycompany.falabella;

/**
 *
 * @author Luis Grandett y Hector Leon
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
    private ArrayList<Producto> productos;
    private Scanner read;

    public Inventario() {
        productos = new ArrayList<>();
        read = new Scanner(System.in);
    }

    // Método para agregar producto
    public void agregarProducto() {
        System.out.println("Seleccione tipo de producto:");
        System.out.println("1. Electrodoméstico");
        System.out.println("2. Ropa");
        System.out.println("3. Alimento");

        int opcion = read.nextInt();
        read.nextLine(); // limpiar buffer

        System.out.print("Nombre: ");
        String nombre = read.nextLine();
        System.out.print("Precio: ");
        double precio = read.nextDouble();
        read.nextLine(); // limpiar buffer
        System.out.print("Código: ");
        String codigo = read.nextLine();

        switch (opcion) {
            case 1:
                System.out.print("Garantía (meses): ");
                int garantia = read.nextInt();
                productos.add(new Electrodomestico(nombre, precio, codigo, garantia));
                break;
            case 2:
                System.out.print("Talla: ");
                String talla = read.nextLine();
                System.out.print("Color: ");
                String color = read.nextLine();
                productos.add(new Ropa(nombre, precio, codigo, talla, color));
                break;
            case 3:
                System.out.print("Fecha de vencimiento: ");
                String fecha = read.nextLine();
                productos.add(new Alimento(nombre, precio, codigo, fecha));
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }

    // Método para listar productos
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
        } else {
            for (Producto p : productos) {
                System.out.println(p);
            }
        }
    }

    // Método para eliminar producto por código
    public void eliminarProducto() {
        System.out.print("Ingrese el código del producto a eliminar: ");
        String codigo = read.nextLine();

        Producto encontrado = null;
        for (Producto p : productos) {
            if (p.getCodigo().equals(codigo)) {
                encontrado = p;
                break;
            }
        }

        if (encontrado != null) {
            productos.remove(encontrado);
            System.out.println("Producto eliminado.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    // Método para actualizar producto
    public void actualizarProducto() {
        System.out.print("Ingrese el código del producto a actualizar: ");
        String codigo = read.nextLine();

        for (Producto p : productos) {
            if (p.getCodigo().equals(codigo)) {
                System.out.print("Nuevo precio: ");
                double nuevoPrecio = read.nextDouble();
                read.nextLine();
                p.setPrecio(nuevoPrecio);
                System.out.println("Producto actualizado.");
                return; 
            }
        }
        System.out.println("Producto no encontrado.");
    }
}