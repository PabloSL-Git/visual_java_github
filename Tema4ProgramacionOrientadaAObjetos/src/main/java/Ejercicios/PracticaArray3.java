package Ejercicios;

import java.util.Random;
import java.util.Arrays;

public class PracticaArray3 {
    public static void main(String[] args) {

        // 7. array 100 numeros aleatorios entre 1 y 30
        // * 8. Funcion que recibe aray del 7. que nos devolvera el array sin duplicados

        int[] numerosCambiados = arrayNoRepetido();

        for (int i = 0; i < numerosCambiados.length; i++) {

            System.out.println("EL numero cambiado de " + (1 + i) + " es " + numerosCambiados[i]);

        }
    }

    public static int[] arrayNoRepetido() {

        int[] numeros = new int[100];
        Random randomNumeros = new Random();
        int[] numerosCambiados = new int[100];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = randomNumeros.nextInt(1, 31);
        }  

        for (int j = 0; j < numerosCambiados.length; j++) {
            numerosCambiados[j] = numeros[j];
        }
        // Cuando j es por ejemplo 4, have que numeroCambiado sea 4 y numero sea 4

        


        return numerosCambiados;
    }

}
