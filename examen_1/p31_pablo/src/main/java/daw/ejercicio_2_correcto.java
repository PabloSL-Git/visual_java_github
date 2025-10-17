package daw;

import javax.swing.JOptionPane;

public class ejercicio_2_correcto {
    public static void main(String[] args) {

        final double PRECIO_ACEITUNA_INICIAL_KILO = 1.23;

        for (int variableControl1 = 1; variableControl1 <= 10; variableControl1++) {
            System.out.println("Iteración: " + variableControl1);

            boolean tipoAceitunaBooleanPicual;
            boolean tipoAceitunaBooleanAloreña;
            boolean tipoAceitunaBooleanHojiblanca;
            String tipoAceituna;

            String cantidadAceitunaTxt;
            double cantidadAceituna;

            String mensaje;

            String tamañoAceituna = "";
            

            double precio_final = 0;

            boolean tamañoAceitunaBooleanGruesa;
            boolean tamañoAceitunaBooleanFina;

            // Pedir la cantidad en kilos, repetir si es 0 o menos
            do {
                cantidadAceitunaTxt = JOptionPane.showInputDialog("Introduzca cantidad de aceitunas en kilo");
                cantidadAceituna = Double.parseDouble(cantidadAceitunaTxt);
            } while (cantidadAceituna <= 0);

            // Pedir tipo de aceituna, repetir si no es válido o no es "salir"
            do {
                tipoAceituna = JOptionPane.showInputDialog("Introduzca tipo de aceituna (picual, aloreña, hojiblanca o salir)");

                if (tipoAceituna.equalsIgnoreCase("salir")) {
                    return; // Termina la ejecución
                }

                tipoAceitunaBooleanPicual = tipoAceituna.equalsIgnoreCase("picual");
                tipoAceitunaBooleanAloreña = tipoAceituna.equalsIgnoreCase("aloreña");
                tipoAceitunaBooleanHojiblanca = tipoAceituna.equalsIgnoreCase("hojiblanca");

            } while (!tipoAceitunaBooleanPicual && !tipoAceitunaBooleanAloreña && !tipoAceitunaBooleanHojiblanca);

            if (tipoAceitunaBooleanPicual) {
                do {
                    tamañoAceituna = JOptionPane.showInputDialog("Introduzca tamaño del picual (gruesa/fina)");
                    tamañoAceitunaBooleanGruesa = tamañoAceituna.equalsIgnoreCase("gruesa");
                    tamañoAceitunaBooleanFina = tamañoAceituna.equalsIgnoreCase("fina");
                } while (!tamañoAceitunaBooleanGruesa && !tamañoAceitunaBooleanFina);

                if (tamañoAceitunaBooleanGruesa) {
                    precio_final = (PRECIO_ACEITUNA_INICIAL_KILO + 0.20) * cantidadAceituna;
                }

                if (tamañoAceitunaBooleanFina) {
                    precio_final = (PRECIO_ACEITUNA_INICIAL_KILO + 0.30) * cantidadAceituna;
                }
            }

            if (tipoAceitunaBooleanAloreña) {
                do {
                    tamañoAceituna = JOptionPane.showInputDialog("Introduzca tamaño del aloreña (gruesa/fina)");
                    tamañoAceitunaBooleanGruesa = tamañoAceituna.equalsIgnoreCase("gruesa");
                    tamañoAceitunaBooleanFina = tamañoAceituna.equalsIgnoreCase("fina");
                } while (!tamañoAceitunaBooleanGruesa && !tamañoAceitunaBooleanFina);

                if (tamañoAceitunaBooleanGruesa) {
                    precio_final = (PRECIO_ACEITUNA_INICIAL_KILO - 0.15) * cantidadAceituna;
                }

                if (tamañoAceitunaBooleanFina) {
                    precio_final = (PRECIO_ACEITUNA_INICIAL_KILO - 0.30) * cantidadAceituna;
                }
            }

            if (tipoAceitunaBooleanHojiblanca) {
                do {
                    tamañoAceituna = JOptionPane.showInputDialog("Introduzca tamaño del hojiblanca (gruesa/fina)");
                    tamañoAceitunaBooleanGruesa = tamañoAceituna.equalsIgnoreCase("gruesa");
                    tamañoAceitunaBooleanFina = tamañoAceituna.equalsIgnoreCase("fina");
                } while (!tamañoAceitunaBooleanGruesa && !tamañoAceitunaBooleanFina);

                if (tamañoAceitunaBooleanGruesa) {
                    precio_final = (PRECIO_ACEITUNA_INICIAL_KILO + 0.15) * cantidadAceituna;
                }

                if (tamañoAceitunaBooleanFina) {
                    precio_final = (PRECIO_ACEITUNA_INICIAL_KILO - 0.05) * cantidadAceituna;
                }
            }

            mensaje = """
                    Kilos de aceitunas: %.2f
                    Tipo de aceituna: %s
                    Tamaño de aceituna: %s
                    Precio final: %.2f €
                    """.formatted(cantidadAceituna, tipoAceituna, tamañoAceituna, precio_final);

            JOptionPane.showMessageDialog(null, mensaje);
        }
    }
}