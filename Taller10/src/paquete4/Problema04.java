/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;


/**
 *
 * @author reroes
 */
public class Problema04 {
    
    public static void main(String[] args) {   
    Scanner scanner = new Scanner(System.in);
        double[][] datos = new double[2][2];
        int valoresFueraDeRango = 0;

        // Proceso para llenar el arreglo
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Ingrese un valor para datos[" + i + "][" + j + "]: ");
                double valor = scanner.nextDouble();

                if (valor > 1000 && valor < 1199) {
                    datos[i][j] = valor;
                } else {
                    datos[i][j] = 10;
                    valoresFueraDeRango++;
                }
            }
        }

        System.out.println("\nContenido del arreglo:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(datos[i][j] + " ");
            }
            System.out.println();
        }

         System.out.println("\nCantidad de valores fuera de rango: " + valoresFueraDeRango);
    }
}
