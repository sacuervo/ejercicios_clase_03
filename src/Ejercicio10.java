/*
Escriba una función en la que ingrese un número entero entre 1 y 12. Este número corresponde con un mes (1 enero, 2 febrero, ..., 12 diciembre). El resultado debe ser el número de días del mes ingresado.
Ejemplo:

Input : 12
Output : 31
A continuación encuentras la cantidad de días que tienen cada mes.

Mes	Días
1, 3, 5, 7, 8, 10 y 12	31
4, 6, 9, 11	30
2	28
 */

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        var mes = 0;
        var mesValido = false;

        do {
            try {
                System.out.print("Ingrese un mes: ");
                mes = Integer.parseInt(sc.nextLine());
                if (mes <= 0 || mes > 12) {
                    System.out.println("Los meses van del 1 al 12. Por favor intente de nuevo.\n");
                } else {
                    mesValido = true;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Mes inválido. Por favor intente de nuevo.\n");
            }
        } while (!mesValido);

        int numeroDias = 0;

        // Si no contamos años bisiestos, el mes 2 siempre tendrá 28 días
        if (mes == 2) {
            numeroDias = 28;
        }
        // Hasta el séptimo mes, los meses cumplen con la condición de que si es un mes
        // impar, tiene 31 días. De lo contrario, 30 días.
        else {
            if (mes <= 7) {
                numeroDias = mes % 2 != 0 ? 31 : 30;
            }
            // A partir del octavo mes se invierte la regla
            else {
                numeroDias = mes % 2 != 0 ? 30 : 31;
            }
        }

        System.out.printf("El mes %d tiene %d días.", mes, numeroDias);

        sc.close();

    }
}
