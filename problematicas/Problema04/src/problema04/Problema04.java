/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int denominador = 1;
        int limite = 15;
        double signo = 1;
        double resultado = 0;
        String reporte = "";

        while (denominador <= limite) {

            if (signo == 1) {
                reporte = reporte + "1/" + denominador;
            } else {
                reporte = reporte + " - 1/" + denominador;

                resultado = resultado + signo * (1.0 / denominador);
                signo = signo * -1;

                denominador = denominador + 2;

            }
        }
System.out.printf("%s", );
    }
}
