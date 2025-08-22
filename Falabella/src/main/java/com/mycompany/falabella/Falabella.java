package com.mycompany.falabella;
/**
 *
 * @author Luis Grandett y Hector Leon
 */

import java.util.Scanner;

//clase principal falabella que contiene el menu de opciones que pone programa para el usuario
public class Falabella {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner read = new Scanner(System.in);
        int opcion;
        //este do while siempre se va a repetir hasta que el usuario escriba 0 para salir del programa
        do {
            System.out.println("====================================");
            System.out.println("      Bienvenido a Falabella        ");
            System.out.println("====================================");
            System.out.println("1. Agregar producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Actualizar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("0. Salir");
            System.out.println("====================================");
            System.out.print("Ingrese la opción deseada: ");

            opcion = read.nextInt();
            read.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> inventario.agregarProducto();
                case 2 -> inventario.listarProductos();
                case 3 -> inventario.actualizarProducto();
                case 4 -> inventario.eliminarProducto();
                case 0 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción inválida. Intente nuevamente.");
            }
            System.out.println(); // línea en blanco para separar salidas
        } while (opcion != 0);

        read.close();
    }
}
