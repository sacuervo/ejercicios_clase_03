/*
Tres hermanos acuerdan reunirse. Los hermanos son identificados por los siguientes números: 1 para el mayor, 2 para el del medio y 3 para el menor.
Cuando llega la hora de la reunión, uno de los hermanos va tarde. Dados los números de los hermanos que llegan a tiempo, determine el número del hermano que llegará tarde.
Por ejemplo:

Input : 1 2
Output : 3
El tercer hermano es el el que llegara a la reunión tarde.
 */

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        int primeroEnLlegar = 0, segundoEnLlegar = 0;
        boolean primeroEnLlegarValido = false, segundoEnLlegarValido = false;

        do {

            try {
                if (!primeroEnLlegarValido) {
                    System.out.println("Ingrese el número del primer hermano en llegar: ");
                    primeroEnLlegar = Integer.parseInt(sc.nextLine());
                    if (primeroEnLlegar < 1 || primeroEnLlegar > 3) {
                        System.out.println("Ingrese 1 para el hermano menor, 2 para el del medio o 3 para el mayor.\n");
                    } else {
                        primeroEnLlegarValido = true;
                    }
                }

                if (!segundoEnLlegarValido) {
                    System.out.println("Ingrese el número del segundo hermano en llegar: ");
                    segundoEnLlegar = Integer.parseInt(sc.nextLine());
                    if (segundoEnLlegar < 1 || segundoEnLlegar > 3) {
                        System.out.printf(
                                "Ingrese 1 para el hermano menor, 2 para el del medio o 3 para el mayor. Recuerde que el hermano %d ya llegó.",
                                primeroEnLlegar);
                    } else if (segundoEnLlegar == primeroEnLlegar) {
                        System.out.println("Ese hermano llegó en primer lugar. Por favor intente de nuevo.");
                    } else {
                        segundoEnLlegarValido = true;
                    }
                }

            } catch (NumberFormatException ex) {
                System.out.println("Número de hermano inválido. Por favor intente con un número entero del 1 al 3.");
            }

        } while (!primeroEnLlegarValido || !segundoEnLlegarValido);

        var hermanoDemorado = 0;

        if (primeroEnLlegar == 3 || segundoEnLlegar == 3) {
            hermanoDemorado = Math.abs(primeroEnLlegar - segundoEnLlegar);
        } else {
            hermanoDemorado = 3;
        }

        var respuestaHermano = "";

        switch (hermanoDemorado) {
            case 1:
                respuestaHermano = "primer";
                break;
            case 2:
                respuestaHermano = "segundo";
                break;
            case 3:
                respuestaHermano = "tercer";
                break;
            default:
                break;
        }

        System.out.printf("El %s hermano llegará tarde a la reunión.", respuestaHermano);

        sc.close();
    }
}
