/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        String posicion;
        int edad;
        double estatura;
        int contador = 1;
        String mensaje_final = "";
        String mensaje_ed = "";
        double prom_edades;
        double prom_estatura;
        double suma_ed = 0;
        double suma_es = 0;

        while (contador <= 5) {
            System.out.println("Ingrese nombre del jugador");
            nombre = entrada.nextLine();

            System.out.println("Ingrese posición del jugador");
            posicion = entrada.nextLine();

            System.out.println("Ingrese edad");
            edad = entrada.nextInt();

            System.out.println("Ingrese estatura del jugador");
            estatura = entrada.nextDouble();

            suma_ed = suma_ed + edad;
            suma_es = suma_es + estatura;

            mensaje_final = String.format("%s%d. %s -%s-, edad %d, estatura %.2f\n",
                    mensaje_final,
                    contador,
                    nombre,
                    posicion,
                    edad,
                    estatura);

            mensaje_ed = String.format("%s%d\n",
                    mensaje_ed,
                    edad);

            contador = contador + 1;
        }

        prom_edades = suma_ed / 5;
        prom_estatura = suma_es / 5;

        System.out.printf("%s\n%s\nPromedio de edades: %.1f\nPromedio de "
                + "estaturas: %.2f\n",
                mensaje_final,
                mensaje_ed,
                prom_edades,
                prom_estatura);

    }
}
