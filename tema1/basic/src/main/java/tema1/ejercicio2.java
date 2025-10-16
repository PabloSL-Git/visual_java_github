package tema1;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("introduce año nacimiento = ");
        int year = teclado.nextInt();

        System.out.println("tu ead es = " + year);

        teclado.close();

    }

}
