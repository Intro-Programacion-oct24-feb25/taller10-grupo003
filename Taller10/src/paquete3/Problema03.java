/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {

        String[][] notasCualitativas = new String[3][3];
        double[][] notasCuantitativas = {{7.1, 8, 10}, {3, 7, 9}, {10, 9, 2.1}};
        String[] valorNotasCualitativas = new String[3];
        int suma = 0;

        for (int i = 0; i < notasCualitativas.length; i++) {
            for (int j = 0; i < notasCuantitativas.length; i++) {
                if (notasCuantitativas[i][j] >= 0 && notasCuantitativas[i][j]
                        < 3) {
                    valorNotasCualitativas[i] = "Insuficiente";
                } else {
                    if (notasCuantitativas[i][j] >= 3 && notasCuantitativas[i][j] < 5) {
                        valorNotasCualitativas[i] = "Regular";
                    } else {
                        if (notasCuantitativas[i][j] >= 5 && notasCuantitativas[i][j] < 8) {
                            valorNotasCualitativas[i] = "Buena";
                        } else {
                            if (notasCuantitativas[i][j] >= 8
                                    && notasCuantitativas[i][j] < 9.5) {
                                valorNotasCualitativas[i] = "Muy buena";
                            } else {
                                if (notasCuantitativas[i][j] >= 9.6
                                        && notasCuantitativas[i][j] <= 10) {
                                    valorNotasCualitativas[i] = "Sobresaliente";
                                }
                            }
                        }
                    }

                }
            }
            
            
            
            

        }
    }
}
