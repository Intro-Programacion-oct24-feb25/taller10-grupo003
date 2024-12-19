/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema02 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        String[] vendedores = {"Jessica Cole", "Robert Wallace"};
        double[][] ventas = new double[2][5];
        double total = 0;
        
        for (int i = 0; i < vendedores.length; i++){
          
            System.out.println("Ingrse las ventas de " + vendedores[i] + ":");
            
            for (int j = 0; j < 5; j++) {
                
                System.out.println("Dia" + (j +1) +":");
                ventas[i][j] = scanner.nextDouble();
            }
        }
        
        for (int i = 0; i < vendedores.length; i++) {
            for (int j = 0; j < 5; j++){
                total = ventas[i][j];
            }
            
            System.out.println("Vnededor(a) " + vendedores[i] + "ha realizado un total de " +
                    total + "\n en ventas.");
        }
        
}
    
}
