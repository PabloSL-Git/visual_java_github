package Ejercicios;

import java.util.Scanner;

public class PracticaArray4 {

    private static final Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {

        // pedir a usuario que meta en array 10 posiciones numeros del 1 al 5
        // contar cuantos 1 hay, cuantos 2 hay , etc

        int[] array1 = new int[10];
        System.out.println("Dame 10 numeros del 1 al 5");
        int buscador1 = 0;
        int buscador2 = 0;
        int buscador3 = 0;
        int buscador4 = 0;
        int buscador5 = 0;
        
        for (int i = 0; i < array1.length; i++) {

            boolean valido = false;


            System.out.println("Dame el numero de la siguiente posicion " + (i));
            array1[i] = tec.nextInt();

            while (!valido) { // Repite hasta que el usuario escriba algo correcto

                if (array1[i] < 1 || array1[i] > 5) {

                    System.out.println("Deve ser entre 1 y 5");
                    array1[i] = tec.nextInt();

                } else {
                    valido = true;
                }

            }

        }

        for (int i = 0; i < array1.length; i++) {

            System.out.println("En array posicion " + i + " es " + array1[i]);

        }

        for (int i = 0; i < array1.length; i++) {

            if (array1[i] == 1) {
                buscador1++;
            }
            if (array1[i] == 2) {
                buscador2++;
            }
            if (array1[i] == 3) {
                buscador3++;
            }
            if (array1[i] == 4) {
                buscador4++;
            }
            if (array1[i] == 5) {
                buscador5++;
            }

        }

        System.out.println("Numero de 1: " + buscador1);
        System.out.println("Numero de 2: " + buscador2);
        System.out.println("Numero de 3: " + buscador3);
        System.out.println("Numero de 4: " + buscador4);
        System.out.println("Numero de 5: " + buscador5);

        tec.close();

        // problemas no deberia coger numeros superior o inferior a 1 y 5

    }

}
