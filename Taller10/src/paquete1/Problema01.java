/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    public static void main(String[] args) {
        double[][] notas = {{9, 10, 7, 8},
        {10, 5, 7, 9},
        {7, 9.4, 10, 9}};
        String[] nombresEstudiantes = {"Jerry Ponce", "Gabriela Lewis", "David Bell"};
        double[] sumaNotas = new double[3];
        double[] promedioNotasCualitativas = new double[3];
        // 0 - 5.9 Bueno
        // 6 - 8.9 Muy Bueno
        // 9 - 10 Sobresaliente

        double suma;
        String reporte = "";
        String nota;
        Double promedio;

        for (int i = 0; i < notas.length; i++) { // 0<3
            suma = 0; // 0
            for (int j = 0; j < notas[i].length; j++) { // 0<notas[0].length
                // 0<4 // 1<4 // 2<4 // 3<4 // 4<4
                suma = suma + notas[i][j];

                // 0 + notas[0][0] // 0 + 9 // 9
                // 9 + notas[0][1] // 9 + 10 // 19
                // 19 + notas[0][2] // 19 + 7 // 26
                // 26 + notas[0][3] // 26 + 8 // 34
            }
            sumaNotas[i] = suma; // 
        }

        for (int i = 0; i < promedioNotasCualitativas.length; i++) {
            promedio = sumaNotas[i] / 4;
            promedioNotasCualitativas[i] = promedio;
            

        }

        // Presentación de resultados
        for (int i = 0; i < nombresEstudiantes.length; i++) {
            reporte = String.format("%sEstudiante %s tiene un promedio "
                    + "de: %s\n", reporte, nombresEstudiantes[i],
                    promedioNotasCualitativas[i]);
        }

        System.out.printf("%s\n", reporte);

    }

}
