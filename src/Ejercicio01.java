/*
Escriba un programa que permita ingresar un número real e identifique si el número es negativo, positivo o cero.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        var df = new DecimalFormat("#.##");

        System.out.print("Ingrese un número real: ");
        var numReal = Double.parseDouble(sc.nextLine());
        var numRealFormateado = df.format(numReal);

        if (numReal > 0) {
            System.out.printf("%s es positivo.", numRealFormateado);
        } else if (numReal < 0) {
            System.out.printf("%s es negativo.", numRealFormateado);
        } else {
            System.out.printf("%s es cero.", numRealFormateado);
        }

        sc.close();

    }
}