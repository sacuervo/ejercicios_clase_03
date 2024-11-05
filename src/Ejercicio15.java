/*
Escriba un programa en el que ingrese un número y le diga si es positivo o negativo. Repita el proceso hasta que se ingrese el número cero.


 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        var df = new DecimalFormat("#.###"); // Limitar respuestas a 3 decimales
        var num = 0D;
        var signo = "positivo";

        do {
            try {
                System.out.print("\nIngrese un número: ");
                num = Double.parseDouble(sc.nextLine());

                if (num == 0) {
                    break;
                }

                signo = num > 0 ? "positivo" : "negativo";

                System.out.printf("El número %s es %s.%n", df.format(num), signo);
            } catch (NumberFormatException ex) {
                System.out.println("Número inválido. Por favor intente de nuevo.");
            }

        } while (true);

        sc.close();

    }

}
