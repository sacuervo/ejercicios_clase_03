/*
Realizar un programa que imprima un diamante usando caracteres de texto. El programa debe pedir al usuario el tamaño del diamante, el cual debe ser un número entero positivo impar.
Ej:

Si tamaño es: 3
 *
***
 *
Si tamaño es: 7
   *
  ***
 *****
*******
 *****
  ***
   *
Ten en cuenta que la linea de asteriscos (*) de la fila central es la mas grande y debe estar alineada a la parte izquierda de la pantalla y debe tener del tamaño del número dado. El resto de las lineas deben quedar los asteriscos centrados teniendo como base la linea central.
En caso de que el número ingresado no sea válido, se le debe informar el usuario el caso que no está cumpliendo.
 */

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        var alturaDiamante = 0;

        do {
            try {
                System.out.print("Ingrese altura del diamante: ");
                alturaDiamante = Integer.parseInt(sc.nextLine());

                if (alturaDiamante % 2 == 0) {
                    System.out.println("La altura del diamante debe ser impar. Por favor vuelva a intentar.\n");
                } else {
                    break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Altura de diamante inválida. Por favor intente de nuevo.\n");
            }
        } while (true);

        int mitadDiamante = (int) alturaDiamante / 2;

        System.out.println();

        int asteriscos = 1;
        int espacios = mitadDiamante;

        // Imprimir primera mitad del diamante
        for (int i = 1; i <= mitadDiamante + 1; i++) {
            for (int j = 1; j <= espacios; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= asteriscos; j++) {
                System.out.print("*");
            }

            if (asteriscos < alturaDiamante) {
                asteriscos += 2;
                espacios--;
            }

            System.out.println();
        }

        // Imprimir segunda mitad del diamante
        for (int i = 1; i <= mitadDiamante; i++) {
            asteriscos -= 2;
            espacios++;
            for (int j = 1; j <= espacios; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= asteriscos; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        sc.close();

    }
}
