package Teoria;

public class Array {
    public static void main(String[] args) {
            // Características
        /* Son estructuras de datos complejas y permiten
        almacenar datos del mismo tipo
         * Todos los arrays son estáticos -> no se redimensionan autom.
         * Hay que crearlos con un tamaño inicial
         * Siempre van de 0 a tamaño-1 (posiciones)
         */

         // Declarar array de int []
         int[] arrayInt;
         // Inicialización del array para 10 números
         arrayInt = new int[10];
         // Para almacenar datos en el array tenemos que
         // usar las posiciones
         // posicion 0 el número 8
         arrayInt[0] = 8;
         arrayInt[3] = 9;
         arrayInt[3] = 11;   

         // Recuperar el valor de una posición del array
        System.out.println("El array en la posicion 1 tiene " + arrayInt[3]);

        // IMPORTANTE - NO SALIRSE DE LAS POSICIONES
        // ArrayIndexOutOfBounds (0-tam-1)
        arrayInt[9] = 6;

        // 
        System.out.println("El tamaño del array " + arrayInt.length);

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayInt[i]);
        }
    }
    
}
