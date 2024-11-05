/*
Escriba un programa que permita ingresar tres números (representan la longitud de una línea) y compruebe si con estos números se puede formar un triángulo.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {

        /*
         * Para saber si se puede formar un triangulo con 3 lineas,la suma de las
         * longitudes de 2 lineas siempre debe ser mayor a la longitud de la tercera
         * linea.
         * Esta regla debe respetarse para todas las posibles combinaciones de
         * longitudes de lineas ingresadas.
         */

        var sc = new Scanner(System.in);
        var df = new DecimalFormat("#.##");

        double lado1 = 0D, lado2 = 0D, lado3 = 0D;
        boolean lado1Valido = false, lado2Valido = false, lado3Valido = false;

        do {
            try {

                if (!lado1Valido) {
                    System.out.print("Ingrese la longitud del primer lado: ");
                    lado1 = Double.parseDouble(sc.nextLine());
                    lado1Valido = true;
                }

                if (!lado2Valido) {
                    System.out.print("\nIngrese la longitud del segundo lado: ");
                    lado2 = Double.parseDouble(sc.nextLine());
                    lado2Valido = true;
                }

                if (!lado3Valido) {
                    System.out.print("\nIngrese la longitud del tercer lado: ");
                    lado3 = Double.parseDouble(sc.nextLine());
                    lado3Valido = true;
                }

            } catch (NumberFormatException ex) {
                System.out.println("Por favor ingrese un número.\n");
            }
        } while (!lado1Valido || !lado2Valido || !lado3Valido);

        String respuesta = (lado1 + lado2) > lado3 && (lado1 + lado3) > lado2 && (lado2 + lado3) > lado1 ? "se puede"
                : "no se puede";

        System.out.printf("Con lineas de longitud %s, %s y %s, %s armar un triángulo.", df.format(lado1),
                df.format(lado2), df.format(lado3), respuesta);

        sc.close();
    }

}
