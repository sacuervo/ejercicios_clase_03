/*
Escriba un programa que le permita ingresar tres números e imprima en la consola el más grande de ellos.
 */

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        var num1 = Double.parseDouble(sc.nextLine());

        System.out.print("Ingrese el segundo número: ");
        var num2 = Double.parseDouble(sc.nextLine());

        System.out.print("Ingrese el tercer número: ");
        var num3 = Double.parseDouble(sc.nextLine());

        var maximoValor = 0D;

        // Eliminar candidado num2
        if (num1 >= num2) {
            maximoValor = num1 >= num3 ? num1 : num3;
        }
        // Eliminar candidato num1
        else {
            maximoValor = num2 >= num3 ? num2 : num3;
        }

        System.out.printf("Máximo valor: %f", maximoValor);

        sc.close();

    }
}
