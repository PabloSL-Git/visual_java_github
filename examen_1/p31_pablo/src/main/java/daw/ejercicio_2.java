package daw;

import javax.swing.JOptionPane;

public class ejercicio_2 {
    public static void main(String[] args) {

        // picual, aloreña y hojiblanca
        // aceituna gruesa o aceituna fina.

        // picual + 20 centimos gruesa
        // 30 centimos fina

        // aloreña - 15 centimos gruesa
        // - 30 centimos fina

        // hojiblanca + 15 centimos gruesa
        // - 5 centimos fina

        final double PRECIO_ACEITUNA_INICIAL_KILO = 1.23;

         for (int variableControl1 = 1; variableControl1 <= 10; variableControl1++) {
         System.out.println("Iteracion: " + variableControl1);

        boolean tipoAceitunaBooleanPicual;
        boolean tipoAceitunaBooleanAloreña;
        boolean tipoAceitunaBooleanHojiblanca;
        String tipoAceituna;

        String cantidadAceitunaTxt;
        double cantidadAceituna;

        String mensaje;

        String tamañoAceituna;

        double precio_final = 0;

        System.out.println(precio_final);

        boolean tamañoAceitunaBooleanGruesa;
        boolean tamañoAceitunaBooleanFina;

        //pide la cantidad en kilos y te repise se 0 o menos

        do {

            cantidadAceitunaTxt = JOptionPane.showInputDialog("Introduzca cantidad de aceitunas en kilo");
            cantidadAceituna = Double.parseDouble(cantidadAceitunaTxt);

        } while (cantidadAceituna <= 0);

        // pide tipo te repite si no es una de las 3 y si pones salir termina

        do {

            tipoAceituna = JOptionPane.showInputDialog("Introduzca tipo de aceituna");
            tipoAceitunaBooleanPicual = tipoAceituna.equalsIgnoreCase("picual");
            tipoAceitunaBooleanAloreña = tipoAceituna.equalsIgnoreCase("aloreña");
            tipoAceitunaBooleanHojiblanca = tipoAceituna.equalsIgnoreCase("hojiblanca");

        } while (!tipoAceitunaBooleanPicual && !tipoAceitunaBooleanAloreña && !tipoAceitunaBooleanHojiblanca);

        if (tipoAceituna.equalsIgnoreCase("picual")) {

            // pide tamaño y si no es coreecto repite

            do {

                tamañoAceituna = JOptionPane.showInputDialog("Introduzca tamaño del picual");
                tamañoAceitunaBooleanGruesa = tamañoAceituna.equalsIgnoreCase("gruesa");
                tamañoAceitunaBooleanFina = tamañoAceituna.equalsIgnoreCase("fina");

            } while (!tamañoAceitunaBooleanGruesa && !tamañoAceitunaBooleanFina);

            if (tamañoAceituna.equalsIgnoreCase("gruesa")) {

                precio_final = (PRECIO_ACEITUNA_INICIAL_KILO + 0.20) * cantidadAceituna;

            }

            if (tamañoAceituna.equalsIgnoreCase("fina")) {

                precio_final = (PRECIO_ACEITUNA_INICIAL_KILO + 0.30) * cantidadAceituna;

            }

        }
        if (tipoAceituna.equalsIgnoreCase("aloreña")) {

            do {

                tamañoAceituna = JOptionPane.showInputDialog("Introduzca tamaño del aloreña");
                tamañoAceitunaBooleanGruesa = tamañoAceituna.equalsIgnoreCase("gruesa");
                tamañoAceitunaBooleanFina = tamañoAceituna.equalsIgnoreCase("fina");

            } while (!tamañoAceitunaBooleanGruesa && !tamañoAceitunaBooleanFina);

            if (tamañoAceituna.equalsIgnoreCase("gruesa")) {

                precio_final = (PRECIO_ACEITUNA_INICIAL_KILO - 0.15) * cantidadAceituna;

            }

            if (tamañoAceituna.equalsIgnoreCase("fina")) {

                precio_final = (PRECIO_ACEITUNA_INICIAL_KILO - 0.30) * cantidadAceituna;

            }

        }
        if (tipoAceituna.equalsIgnoreCase("hojiblanca")) {

            do {

                tamañoAceituna = JOptionPane.showInputDialog("Introduzca tamaño del hojiblanca");
                tamañoAceitunaBooleanGruesa = tamañoAceituna.equalsIgnoreCase("gruesa");
                tamañoAceitunaBooleanFina = tamañoAceituna.equalsIgnoreCase("fina");

            } while (!tamañoAceitunaBooleanGruesa && !tamañoAceitunaBooleanFina);

            if (tamañoAceituna.equalsIgnoreCase("gruesa")) {

                precio_final = (PRECIO_ACEITUNA_INICIAL_KILO + 0.15) * cantidadAceituna;

            }

             if (tamañoAceituna.equalsIgnoreCase("fina")) {

                precio_final = (PRECIO_ACEITUNA_INICIAL_KILO - 0.05) * cantidadAceituna;

            }

        }

        if (tipoAceituna.equalsIgnoreCase("salir")) {
             break;
        }

        mensaje = """
                kilos de aceitunas %s
                Tipo de aceituna %s
                Tamaño de aceituna %.2f
                Precio final %.2f
                """.formatted(cantidadAceituna, tipoAceituna);

        JOptionPane.showMessageDialog(null, mensaje);

        }

       
    }

}
