/*
Escriba un programa que permita ingresar una letra e identifique si la letra es mayúscula o minúscula.
 */

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        var entradaLetra = "";
        var letra = '\u0000';

        do {
            System.out.print("Ingrese una letra: ");
            entradaLetra = sc.nextLine();

            // Evaluar si lo que ingresó el usuario es una sola letra y si, efectivamente,
            // es una letra
            try {
                if (entradaLetra.length() > 1 || !Character.isLetter(entradaLetra.charAt(0))) {
                    throw new IllegalArgumentException("Por favor ingrese una sola letra.");
                } else {
                    letra = entradaLetra.charAt(0);
                    break;
                }
            } catch (IllegalArgumentException ex) {
                System.out.println("\nError: " + ex.getMessage());
            }

        } while (true);

        if (letra >= 'a' && letra <= 'z') {
            System.out.printf("%n%c es minúscula.", letra);
        } else if (letra >= 'A' && letra <= 'Z') {
            System.out.printf("%n%c es mayúscula.", letra);
        }

        sc.close();

    }
}
