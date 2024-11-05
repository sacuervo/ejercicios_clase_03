/*
En un día soleado y caluroso Sebastian y Adriana salen en busca de una sandia. Se dirigen a la tienda más cercana y compran la más grande y jugosa.
En casa se disponen a dividir y a comer la fruta pero se les presenta un gran problema y es que Adriana y Sebastian son amantes de los números pares. De manera que quieren dividir la sandía en dos partes no necesariamente iguales pero ambas deben ser pares.
Escriba una función en el que pueda ingresar el peso de la sandía en kilogramos y la respuesta sea:

SI en caso de que se pueda dividir este peso en números pares
NO de lo contrario.
Por ejemplo:

Input : 12
Output : SI
Como el peso de la sandía es de 12 kilogramos. Se puede dividir como 10 y 2 (recuerde que las partes no necesariamente deben ser iguales) o 6 y 6, o 8 y 4 etc.
 */

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        var cantidad = 0;
        var cantidadValida = false;

        do {
            try {
                System.out.print("Ingrese la cantidad de sandía que desea comprar (en kg): ");
                cantidad = Integer.parseInt(sc.nextLine());
                if (cantidad < 0) {
                    System.out.println("La cantidad de kilos no puede ser negativa. Por favor intente de nuevo.\n");
                } else if (cantidad == 0) {
                    System.out.println("Debe llevar por lo un kilo. Por favor intente de nuevo.\n");
                } else {
                    cantidadValida = true;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Cantidad inválida. Por favor intente de nuevo.\n");
            }
        } while (!cantidadValida);

        // Hacer un ciclo desde 2 hasta la raiz cuadrada del número de kilogramos de la
        // sandía
        // Cualquier otro número que sea factor va a ser incluido en la computación de
        // los resultados

        String respuesta = "NO";

        for (int i = 2; i < (int) Math.sqrt(cantidad); i++) {
            if (cantidad % i == 0) {
                if ((cantidad / i) % 2 == 0 && i % 2 == 0) {
                    System.out.println("Mitad 1: " + cantidad / i + " kg");
                    System.out.println("Mitad 2: " + i + " kg");
                    respuesta = "SI";
                    break;
                }
            }
        }

        System.out.printf("%n¿La sandía puede ser dividida en 2 partes de peso par (en kg)? Respuesta: %s", respuesta);

        sc.close();
    }

}
