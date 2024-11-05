/*
Escriba una función en la que pueda ingresar tres números enteros y diferentes. Imprima estos valores en orden ascendente.
Por ejemplo:

Input : 3 , 100 , 1
Output : 13100
Tenga en cuenta que la respuesta es un texto. Los números los puede concatenar.
 */

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        int num1 = 0, num2 = 0, num3 = 0;
        boolean num1Valido = false, num2Valido = false, num3Valido = false;

        do {
            try {

                if (!num1Valido) {
                    System.out.print("Ingrese el primer número: ");
                    num1 = Integer.parseInt(sc.nextLine());
                    num1Valido = true;
                }

                if (!num2Valido) {
                    System.out.print("\nIngrese el segundo número: ");
                    num2 = Integer.parseInt(sc.nextLine());
                    num2Valido = num2 != num1 ? true : false;

                    if (!num2Valido) {
                        System.out.println(
                                "\nEl segundo número debe ser diferente al primero. Por favor vuelva a intentar.");
                        continue;
                    }
                }

                if (!num3Valido) {
                    System.out.print("\nIngrese el tercer número: ");
                    num3 = Integer.parseInt(sc.nextLine());
                    num3Valido = num3 != num1 && num3 != num2 ? true : false;

                    if (!num3Valido) {
                        System.out.println(
                                "\nEl tercer número debe ser diferente al primero y al segundo. Por favor vuelva a intentar.");
                    }
                }

            } catch (NumberFormatException ex) {
                System.out.println("Por favor intente nuevamente ingresando un número entero.\n");
            }
        } while (!num1Valido || !num2Valido || !num3Valido);

        var numerosOrdenados = "";

        // Descartar candidato num1 como número mayor
        if (num2 > num1 && num3 > num1) {
            numerosOrdenados += num1 + ", ";
            numerosOrdenados += num2 < num3 ? num2 + " y " + num3 : num3 + " y " + num2;
        }
        // Descartar candidato num2 como número mayor
        else if (num1 > num2 && num3 > num2) {
            numerosOrdenados += num2 + ", ";
            numerosOrdenados += num1 > num3 ? num3 + " y " + num1 : num1 + " y " + num3;
        }
        // Descartar candidato num3 como número mayor
        else {
            numerosOrdenados += num3 + ", ";
            numerosOrdenados += num1 > num2 ? num2 + " y " + num1 : num1 + " y " + num2;
        }

        System.out.printf("\nNúmeros en orden ascendente: %s", numerosOrdenados);

        sc.close();
    }

}
