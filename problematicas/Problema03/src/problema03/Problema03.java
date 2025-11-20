/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor..
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int numero = 2;
        int valor_suma = 3;
        String mensaje = "";

        while (numero <= 37) {
            mensaje = String.format("%s\n%S", mensaje, numero);

            numero = numero + valor_suma;
            valor_suma = valor_suma + 2;

        }
        System.out.printf("%s\n", mensaje);
    }
}
