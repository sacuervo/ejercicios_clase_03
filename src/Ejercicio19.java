/*
Esta sucesión comienza con los números 0 y 1. El siguiente miembro se calcula como la suma de los dos inmediatamente anteriores.
Crea un programa reciba un número (N) del usuario y muestre los primeros N números de sucesión.
 */

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        var nValores = 0;

        do {
            try {
                System.out.print("Ingrese los N valores de la sucesión que desea visualizar: ");
                nValores = Integer.parseInt(sc.nextLine());

                if (nValores <= 0) {
                    System.out.println("El número de N valores debe ser mayor que 0. Por favor intente de nuevo.\n");
                } else {
                    break;
                }

            } catch (NumberFormatException ex) {
                System.out.println("Número inválido de N valores. Por favor intente de nuevo.\n");
            }
        } while (true);

        var secuencia = "";

        if (nValores == 1) {
            secuencia = "0";
        } else {
            secuencia = "0 1";

            var num1 = 0;
            var num2 = 1;

            for (int i = 2; i < nValores; i++) {
                var num3 = num1 + num2;
                num1 = num2;
                num2 = num3;

                secuencia += " " + String.valueOf(num3);
            }
        }

        System.out.printf("%nSecuencia de Fibonacci para los primeros %d valores: %s", nValores, secuencia);

        sc.close();

    }
}
