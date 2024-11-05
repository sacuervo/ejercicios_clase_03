// Escriba un programa que permita ingresar un número y determine si es divisible por dos y siete.

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        var numero = 0;

        do {
            try {
                System.out.print("Ingrese un número entero: ");
                numero = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Por favor ingrese un número entero.\n");
            }
        } while (true);

        if (numero % 7 == 0) {
            if (numero % 2 == 0) {
                System.out.printf("%d es divisible por 7 y por 2", numero);
            } else {
                System.out.printf("%d es divisible por 7, pero no por 2.", numero);
            }
        } else if (numero % 2 == 0) {
            System.out.printf("%d es divisible por 2, pero no por 7.", numero);
        } else {
            System.out.printf("%d no es divisible por 2 ni por 7.", numero);
        }

        sc.close();
    }

}
