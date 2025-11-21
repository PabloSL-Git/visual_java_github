package ejercicios;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class practicaArray5 {
    private static final Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {
        // funcion de copiar array que se le de y darle la vuelta

        int[] array1 = GenerarArray();

        int[] copia = new int[array1.length];

        int[] copiaInvertida = InvertirArray(copia);

        System.out.println("Array dado la vuelta es: " + Arrays.toString(copiaInvertida));

    }

    public static int[] GenerarArray() { // funcion, se le pone int[] para devolver array

        int[] array1 = new int[5];

        for (int i = 0; i < array1.length; i++) {

            Random random = new Random();

            array1[i] = random.nextInt(10);

        }

        System.out.println("Array 1 es: " + Arrays.toString(array1));
        return array1;
    }

    public static int[] InvertirArray(int[] copia) {

        int[] copiaInvertida = new int[copia.length];

        // parte que invierte

        return copiaInvertida;

    }

}
