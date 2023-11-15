/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author Eli
 */
import java.util.Scanner;

public class Practica1U4 {
    public static void main(String[] args) {
        
        double[] elementos = {20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3};

        
        Scanner scanner = new Scanner(System.in);

        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Sumar elementos");
            System.out.println("2. Multiplicar elementos");
            System.out.println("3. Salir");

            System.out.print("Seleccione una opción (1, 2, o 3): ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    double suma = sumarElementos(elementos);
                    System.out.println("La suma de los elementos es: " + suma);
                    break;
                case "2":
                    double producto = multiplicarElementos(elementos);
                    System.out.println("El producto de los elementos es: " + producto);
                    break;
                case "3":
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    scanner.close(); 
                    System.exit(0); 
                default:
                    System.out.println("Opción no válida. Por favor, seleccione 1, 2 o 3.");
            }
        }
    }

    
    private static double sumarElementos(double[] arr) {
        double suma = 0;
        for (double elemento : arr) {
            suma += elemento;
        }
        return suma;
    }

    
    private static double multiplicarElementos(double[] arr) {
        double producto = 1;
        for (double elemento : arr) {
            producto *= elemento;
        }
        return producto;
    }
}

