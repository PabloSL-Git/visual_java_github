package Ejercicios;

import java.util.Random;
import java.util.Arrays;

public class PracticaArray3 {
    public static void main(String[] args) {

        // 7. array 100 numeros aleatorios entre 1 y 30
        // * 8. Funcion que recibe aray del 7. que nos devolvera el array sin duplicados

        int[] numeros = new int[100];
        Random randomNumeros = new Random();
        

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = randomNumeros.nextInt(30) + 1;

            System.out.println("EL numero " + (1 + i) + " es " + numeros[i]);

        }

        numeros = arrayNoRepetido(numeros);

        for (int i = 0; i < numeros.length; i++) {

            System.out.println("EL numero cambiado de " + (1 + i) + " es " + numeros[i]);

        }
    }

    public static int[] arrayNoRepetido(int[] array) {
        


        

    return numeros;
    }

}
