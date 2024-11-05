// Escriba un programa que permita ingresar una letra e identifique si es vocal o consonante.

import java.util.Scanner;

public class Ejercicio05 {

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

        // Volver una cadena con las vocales en un iterable
        var vocales = "aeiou".toCharArray();
        var esConsonante = true;

        for (char vocal : vocales) {
            if (vocal == Character.toLowerCase(letra)) {
                esConsonante = false;
                break;
            }
        }

        if (esConsonante) {
            System.out.printf("%c es consonante.", letra);
        } else {
            System.out.printf("%c es vocal.", letra);
        }

        sc.close();

    }

}
