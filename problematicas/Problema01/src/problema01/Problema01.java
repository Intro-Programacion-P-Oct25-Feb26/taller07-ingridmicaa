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
            prom_edades = suma_ed / 5;
            suma_es = suma_es + estatura;
            prom_estatura = suma_es / 5;

            mensaje_final = String.format("\n "
                    + "%s- %s -, edad %s, "
                    + "estatura %s\n Listado de edades\n %s "
                    + "Promedio de edades: %s\n "
                    + "Promedio de estaturas: %s\n", mensaje_final,
                    nombre,
                    posicion,
                    edad,
                    estatura,
                    edad,
                    prom_edades,
                    prom_estatura);

            entrada.nextLine();
            contador = contador + 1;

        }
        System.out.printf("Listado de jugadores%s\n", mensaje_final "\nListado de edades");
    }
}
