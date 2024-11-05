/*
Escriba un programa que permita ingresar un número e identificar si es par o impar.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        var df = new DecimalFormat("#.##");

        var num = 0D;

        do {
            System.out.print("Ingrese un número entero: ");
            num = Double.parseDouble(sc.nextLine());

            if (num % 1 != 0) {
                System.out.println("\nPor favor ingrese un número entero.\n");
            }
        } while (num % 1 != 0);

        var clasificacion = num % 2 == 0 ? "par" : "impar";

        System.out.printf("%s es %s.", df.format(num), clasificacion);

        sc.close();

    }
}
