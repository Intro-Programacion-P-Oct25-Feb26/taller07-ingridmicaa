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

        int numero= 1;
        int contador = 1;
        String fraccion = "";
        String mensaje ="";
        

        while (contador <= 15) {
            numero= numero*-1;
            contador= (contador + 2);
            

            if (numero == 1) {
                fraccion = String.format(" + %s/%s", numero, contador);
            } else {
                fraccion = String.format(" + %s/%s", numero, contador);
            }
                mensaje = String.format("%s %s", mensaje, fraccion);
               

            }
        
System.out.printf("1", mensaje);
    }
}
