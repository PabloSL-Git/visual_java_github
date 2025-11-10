package Ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PracticaArray2 {

    private static final Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {

        /*
         * No hace falta pedir al usuario
         * 
         * 1. Funcion que reciba un array de int y devuelve el valor maximo.
         * 
         * 2. Funcion que reciba un array de int y devuelve el valor minimo.
         * 
         * 3. Funcion que reciba un array de double y un numero y multiplica
         * todos los elementos el array por ese numero. Muestra el array en el main
         * antes de llamer a la funcion y despues.
         * 
         * 4. Funcion que recibe un tamaño y genera un array de letras aletorias
         * (entre a y z) del tamaño especificado. la funcion devuelve el array generado.
         * 
         * 5. Funcion que recibe dos arrays de String y devuelve si son iguales o no.
         * Dos arrays son iguales si tienen mismo tamaño y los elemetos de la misma
         * posicion son iguales.
         * 
         */

        // 1

        int[] numeros = { 15, 6, 3, 7, 15, 8 };
        double[] decimales = { 2.5, 4.0, 6.5 };
        String[] palabras1 = { "hola", "mundo", "java" };
        String[] palabras2 = { "hola", "mundo", "java" };

        // 1. Valor máximo
        int max = valorMaximo(numeros);
        System.out.println("El valor máximo es: " + max);

        // 2. Valor mínimo
        int min = valorMinimo(numeros);
        System.out.println("El valor mínimo es: " + min);

        // 3. Multiplicar elementos de un array de double por un número
        System.out.println("Array original: " + Arrays.toString(decimales));
        multiplicaArray(decimales, 2.0);
        System.out.println("Array multiplicado: " + Arrays.toString(decimales));

        // 4. Generar array de letras aleatorias
        char[] letras = generaArrayLetras(10);
        System.out.println("Array de letras generado: " + Arrays.toString(letras));

        // 5. Comparar dos arrays de String
        boolean iguales = arraysIguales(palabras1, palabras2);
        System.out.println("¿Los arrays son iguales? " + iguales);

        tec.close();
    }

    // 1. Valor máximo
    public static int valorMaximo(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // 2. Valor mínimo
    public static int valorMinimo(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // 3. Multiplicar todos los elementos de un array de double
    public static void multiplicaArray(double[] array, double numero) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= numero;
        }
    }

    // 4. Generar array de letras aleatorias entre 'a' y 'z'
    public static char[] generaArrayLetras(int tamaño) {
        Random random = new Random();
        char[] letras = new char[tamaño];
        for (int i = 0; i < tamaño; i++) {
            letras[i] = (char) ('a' + random.nextInt(26));
        }
        return letras;
    }

    // 5. Comparar si dos arrays de String son iguales
    public static boolean arraysIguales(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;

    }

}
