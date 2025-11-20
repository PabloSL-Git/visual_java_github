package Ejercicios;

import java.util.Scanner;

public class practicaArray5 {
    private static final Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {
        // funcion de copiar array que se le de y darle la vuelta

        int[] array1 = LectorArray();

        
    }

    public static int[] LectorArray() { // funcion, se le pone int[] para devolver array

        int[] array1 = new int[10];

        for (int i = 0; i < array1.length; i++) {


            System.out.println("Dame el numero de la siguiente posicion " + (i));
            array1[i] = tec.nextInt();

        }
        return array1;
    }

}
