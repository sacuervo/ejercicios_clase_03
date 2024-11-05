/*
Escriba un programa que permita ingresar un número (va a representar la cantidad de años) y de como respuesta la etapa en la que se encuentra la persona de acuerdo con la siguiente tabla.

| Años | Etapas |
| :-: | --- |
| 0 - 5 | Primera infancia |
| 6 - 11 | Infancia |
| 12 - 18 | Adolescencia |
| 19 - 26 | Juventud |
| 27 - 59 | Adultez |
|> 59 | Persona mayor |

 */

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        var edad = 0;
        var edadValida = false;

        do {
            try {
                System.out.print("Ingrese una edad: ");
                edad = Integer.parseInt(sc.nextLine());
                if (edad < 0) {
                    System.out.println("La edad no puede ser negativa. Por favor intente de nuevo.\n");
                } else if (edad > 116) {
                    System.out
                            .println(
                                    "La persona más longeva a la fecha tiene 116 años. Por favor vuelva a intentar.\n");
                } else {
                    edadValida = true;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Edad inválida. Por favor intente de nuevo.\n");
            }
        } while (!edadValida);

        if (edad > 59) {
            System.out.println("Es una persona mayor.");
        } else if (edad >= 27) {
            System.out.println("Es una persona adulta.");
        } else if (edad >= 19) {
            System.out.println("Es una persona jóven.");
        } else if (edad >= 12) {
            System.out.println("Es un adolescente.");
        } else if (edad >= 6) {
            System.out.println("Es un infante.");
        } else {
            System.out.println("La persona está en su primera infancia.");
        }

        sc.close();
    }

}
