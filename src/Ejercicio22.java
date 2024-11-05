/*
Realizar un programa que permita controlar el juego de piedra, papel, tijera introduciendo P para piedra, L para papel y T para tijera por cada jugador.
El sistema debe indicar qué jugador gana la ronda o si hay empate. Al final de cada ronda preguntar si desea volver a jugar.
 */

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        var ronda = 1;
        var juegoActivo = true;
        String[] opciones = { "piedra", "papel", "tijera" };

        // for (int i = 0; i < 8; i++) {
        // System.out.println((int) (Math.random() * opciones.length));
        // }

        var eleccionJugador = "";
        var eleccionComputadora = "";

        var puntosJugador = 0;
        var puntosComputadora = 0;

        do {
            try {
                System.out.printf("%n--- PIEDRA PAPEL O TIJERA (RONDA %d)---%n", ronda);
                System.out.printf("MARCADOR -> Jugador: %d / Computadora: %d%n", puntosJugador, puntosComputadora);

                System.out.println("\nElige: 1 para piedra, 2 para papel o 3 para tijera... ");

                eleccionJugador = opciones[Integer.parseInt(sc.nextLine()) - 1];
                eleccionComputadora = opciones[(int) (Math.random() * opciones.length)];

                // Evaluar ganador
                if (eleccionJugador == eleccionComputadora) {
                    System.out.println("Empate. Ninguno suma puntos.");
                } else {
                    var ganaJugador = false;
                    switch (eleccionJugador) {
                        case "piedra":
                            ganaJugador = eleccionComputadora == "tijera" ? true : false;
                            break;
                        case "papel":
                            ganaJugador = eleccionComputadora == "piedra" ? true : false;
                            break;
                        case "tijera":
                            ganaJugador = eleccionComputadora == "papel" ? true : false;
                            break;
                        default:
                            System.out.println("Opción inválida.");
                            break;
                    }

                    if (ganaJugador) {
                        System.out.printf(
                                "Felicidades, ha ganado la ronda. Elección jugador: %s / Elección computadora: %s",
                                eleccionJugador, eleccionComputadora);
                        puntosJugador++;
                    } else {
                        System.out.printf(
                                "La computadora ha ganado la ronda. Elección jugador: %s / Elección computadora: %s",
                                eleccionJugador, eleccionComputadora);
                        puntosComputadora++;
                    }
                }

                ronda++;

                int volverAJugar = 0;

                while (volverAJugar < 1 || volverAJugar > 2) {
                    try {
                        System.out.println("\nQuisiera volver a jugar? Ingrese 1 para sí o 2 para no... ");
                        volverAJugar = Integer.parseInt(sc.nextLine());

                        if (volverAJugar < 1 || volverAJugar > 2) {
                            System.out.println("Opción inválida. Ingrese 1 para sí o 2 para no...");
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("Opción inválida. Ingrese 1 para sí o 2 para no...");
                    }

                    if (volverAJugar == 2) {
                        juegoActivo = false;
                    }

                }
            } catch (NumberFormatException nfe) {
                System.out.println("Opción inválida. Por favor vuelva a intentar.\n");
            } catch (ArrayIndexOutOfBoundsException oob) {
                System.out.println("Opción inválida. Ingresa 1 para piedra, 2 para papel o 3 para tijera.\n");
            }

        } while (juegoActivo);

        sc.close();

    }

}
