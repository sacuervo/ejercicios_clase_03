/*
Escriba un programa que genere 120 números aleatorios entre -100 y 100. Imprime los
siguientes cálculos:

Sumar los valores positivos.
Sumar los valores negativos.
Calcule la media de los números negativos.
Calcule la media de los números positivos.
Cuente la cantidad de ceros.
 */
public class Ejercicio18 {

    public static void main(String[] args) {
        var limiteSuperior = 100;
        var limiteInferior = -100;
        var rango = limiteSuperior - limiteInferior;
        var num = 0D;

        var sumaPositivos = 0D;
        var sumaNegativos = 0D;

        var contadorPositivos = 0;
        var contadorNegativos = 0;

        var mediaPositivos = 0D;
        var mediaNegativos = 0D;

        var cantidadCeros = 0;

        for (int i = 0; i < 120; i++) {
            // El rango es de 200. Sumo 1 para que incluya el 200 y resto 100 para que los
            // valores estén entre -100 y 100, ya que inicialmente estarán dentro de 0 y
            // 200.
            num = (Math.random() * rango + 1) - Math.abs(limiteInferior); // Número aleatorio

            /* Revisar que los 120 números sean creados correctamente */
            System.out.printf("%d. %f%n", i + 1, num);

            if (num > 0) {
                sumaPositivos += num;
                contadorPositivos++;
            } else {
                sumaNegativos += num;
                contadorNegativos++;
            }

            // Convertir el número en un iterable para poder contar la cantidad de 0s
            var cadenaNum = String.valueOf(num).replace(".", ""); // Eliminar punto decimal para que no cause problemas

            var charArrNum = cadenaNum.toCharArray();

            for (char digito : charArrNum) {
                if (Character.getNumericValue(digito) == 0) {
                    cantidadCeros++;
                }
            }

        }

        mediaPositivos = sumaPositivos / contadorPositivos;
        mediaNegativos = sumaNegativos / contadorNegativos;

        // Imprimir resultados
        System.out.println("\n------------------- RESULTADOS -------------------");
        System.out.printf("Suma positivos: %f%n", sumaPositivos);
        System.out.printf("Suma negativos: %f%n%n", sumaNegativos);

        System.out.printf("Contador positivos: %d%n", contadorPositivos);
        System.out.printf("Contador negativos: %d%n%n", contadorNegativos);

        System.out.printf("Media positivos: %f%n", mediaPositivos);
        System.out.printf("Media negativos: %f%n%n", mediaNegativos);

        System.out.printf("Cantidad de ceros: %d", cantidadCeros);

    }

}
