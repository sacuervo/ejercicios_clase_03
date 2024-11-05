/*
Realizar un programa que permita hacer la siguiente conversión:

Millas a kilómetros.
Kilómetros a millas.
Considera que

1 milla son 1.60934 kilómetros
1 kilómetro es 0.621371 millas
 */

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        var eleccionConversion = 0;

        do {
            try {

                System.out.print("Ingrese 1 para convertir de km a mi, o 2 para convertir de mi a km: ");
                eleccionConversion = Integer.parseInt(sc.nextLine());

                if (eleccionConversion < 1 || eleccionConversion > 2) {
                    System.out.println(
                            "Opción inválida. Marque 1 para convertir de km a mi, o 2 para convertir de mi a km...\n");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println(
                        "Opción inválida. Marque 1 para convertir de km a mi, o 2 para convertir de mi a km...\n");
            }

        } while (true);

        if (eleccionConversion == 1) {
            do {
                try {
                    System.out.print("Ingrese kilometros: ");
                    var kilometros = Double.parseDouble(sc.nextLine());
                    var millas = kilometros * 0.621371;
                    System.out.printf("%f kilómetros equivalen a %f millas.", kilometros, millas);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println(
                            "Número de kilómetros inválido. Por favor vuelva a intentar.\n");
                }
            } while (true);
        } else {
            do {
                try {
                    System.out.print("Ingrese millas: ");
                    var millas = Double.parseDouble(sc.nextLine());
                    var kilometros = millas * 1.60934;
                    System.out.printf("%f millas equivalen a %f kilómetros.", millas, kilometros);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println(
                            "Número de millas inválido. Por favor vuelva a intentar.\n");
                }
            } while (true);
        }

        sc.close();
    }

}
