package Ejercicios;

import java.util.Scanner;

public class PracticaArray {

    private static final Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {
        /*
         * Sumar los elementos de un array y mostrar resultado
         * 
         * Media aritmética de los números de un array
         * 
         * Contar números de veces que aparece un numero de un array
         */

        int[] array1 = { 15, 6, 3, 7, 15, 8 };

        // suma

        int suma = 0;
        for (int i = 0; i < array1.length; i++) {
            suma = suma + array1[i];
        }
        System.out.println("La suma de los elementos es: " + suma);

        // media

        double media = suma / array1.length;
        System.out.println("La media aritmética es: " + media);

        // contar numeros

        System.out.print("Introduce un número a buscar: ");
        int numeroBuscado = tec.nextInt();

        int contador = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == numeroBuscado) {
                contador = contador + 1;
            }
        }

        if (contador > 0) {
            System.out.println("El número " + numeroBuscado + " aparece " + contador + " veces en el array.");
        } else {
            System.out.println("El número " + numeroBuscado + " no aparece en el array.");
        }

        tec.close();

    }

}
