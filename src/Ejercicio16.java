/*
Escriba un programa que permita ingresar un número mientras estos sean negativos. Detener cuando el número ingresado sea positivo y de cómo resultado la cantidad de números negativos ingresados.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        var df = new DecimalFormat("#.###");
        var num = 0D;
        var contador = 0;

        do {
            try {
                System.out.print("\nIngrese un número: ");
                num = Double.parseDouble(sc.nextLine());

                if (num >= 0) {
                    break;
                }

                System.out.printf("El número %s ha sido contabilizado.%n", df.format(num));
                contador++;

            } catch (NumberFormatException ex) {
                System.out.println("Número inválido. Por favor intente de nuevo.");
            }

        } while (true);

        System.out.printf("Ha ingresado %d números negativos.", contador);

        sc.close();
    }
}
