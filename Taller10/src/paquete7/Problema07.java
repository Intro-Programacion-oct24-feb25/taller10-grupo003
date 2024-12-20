/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete7;

/**
 *
 * @author carlo
 */
public class Problema07 {
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales

        double[][] dato1 = {{0, 2, 0},{1, 0, 0}}; //
        
        boolean nulo = true;

       
        double suma = 0;
        for (int i = 0; i < dato1.length; i++) {
            for (int j = 0; j < dato1[i].length; j++) {
                suma = suma + dato1[i][j];
            }
        }

        
        if (suma != 0) {
            nulo = false;
        }

        
        if (nulo) {
            System.out.println("El arreglo es NULO.");
        } else {
            System.out.println("El arreglo NO es NULO.");
        }
    }
    
}
