/*
Realice un programa en el que ingrese un número y muestre el cubo. Repita el proceso hasta que se introduzca un valor negativo.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        var df = new DecimalFormat("#.###"); // Limitar respuestas a 3 decimales
        var num = 0D;

        do {
            try {
                System.out.print("\nIngrese un número: ");
                num = Double.parseDouble(sc.nextLine());

                if (num < 0) {
                    break;
                }

                System.out.printf("El cubo del número %s es %s.%n", df.format(num), df.format(Math.pow(num, 3)));
            } catch (NumberFormatException ex) {
                System.out.println("Solo se permiten números del 0 en adelante. Por favor intente de nuevo.");
            }

        } while (true);

        sc.close();

    }
}
