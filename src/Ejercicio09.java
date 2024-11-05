/*
 Un vendedor al por mayor de camisas ofrece diferentes precios de acuerdo a la cantidad de unidades que le compren. La siguiente tabla muestra la información:

Unidades	Precio por unidad
[1 - 50]	$50.000
(50 - 100]	$45.000
(100 - 150]	$40.000
(150 - 200]	$35.000
> 200	$25.000

Escriba un programa que dado un número de camisas retorne el precio por unidad.
 */

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        var cantidad = 0;
        var cantidadValida = false;

        do {
            try {
                System.out.print("Ingrese la cantidad de camisetas que desea comprar: ");
                cantidad = Integer.parseInt(sc.nextLine());
                if (cantidad < 0) {
                    System.out.println("La cantidad de camisetas no puede ser negativa. Por favor intente de nuevo.\n");
                } else if (cantidad == 0) {
                    System.out.println("Debe llevar por lo menos una camiseta. Por favor intente de nuevo.\n");
                } else {
                    cantidadValida = true;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Cantidad inválida. Por favor intente de nuevo.\n");
            }
        } while (!cantidadValida);

        var precioPorUnidad = 0;

        if (cantidad > 200) {
            precioPorUnidad = 25000;
        } else if (cantidad >= 150) {
            precioPorUnidad = 35000;
        } else if (cantidad >= 100) {
            precioPorUnidad = 40000;
        } else if (cantidad >= 50) {
            precioPorUnidad = 45000;
        } else {
            precioPorUnidad = 50000;
        }

        // El locale es para imprimir con el separador de los miles con '.' en vez de
        // ','
        System.out.printf(new Locale.Builder().setLanguage("es").setRegion("ES").build(), "Precio por unidad: $%,d%n",
                precioPorUnidad);

        sc.close();
    }
}
