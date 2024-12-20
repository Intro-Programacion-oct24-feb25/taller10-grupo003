/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author reroes
 */
public class Problema06 {
    
    public static void main(String[] args) {
        String[][] estudiantes = {
            {"Sarah Ward", "Philip Payne"},
            {"Carrie Burton", "Lauren Rice"},
            {"Emma Escobar", "Lori Flores"},
            {"Steven West", "Toni Martin"}
        };

        String acumulador = ""; // Variable acumuladora

        for (String[] fila : estudiantes) {
            for (String estudiante : fila) {
                if (estudiante.length() == 11) {
                    acumulador += estudiante + "\n"; // Agregar estudiante al acumulador
                }
            }
        }

        System.out.println("Estudiantes con 11 caracteres:");
        System.out.println(acumulador);

    }
}
