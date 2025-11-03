package Ejercicios;

import java.util.Random;
import javax.swing.JOptionPane;

public class BolasColores {
    public static void main(String[] args) {

        // da descuento aun precio segun
        // color de bola, se repie programa
        // rojo 15%
        // naranja 25%
        // azul 50%
        // negro no descuento

        boolean salir = false;
        Random random = new Random();

        final double BOLA_ROJA = 0.15;
        final double BOLA_NARANJA = 0.25;
        final double BOLA_AZUL = 0.50;

        do {
            double precioCompra = 0;
            int colorBola = 0;
            String precioCompraTxt = "";
            boolean valido = false;

            colorBola = random.nextInt(4) + 1;

            while (!valido) {

                try {

                    precioCompraTxt = JOptionPane.showInputDialog("¿Cuanto vas a gastar en esta compra?");
                    precioCompra = Double.parseDouble(precioCompraTxt);

                    if (precioCompra > 0) {
                        JOptionPane.showMessageDialog(null, "Numero valido");
                        valido = true;

                    } else if (precioCompra <= 0) {
                        JOptionPane.showMessageDialog(null, "Numero deve ser mayor que 0");
                    }
                } catch () {

                }

            }

            if (colorBola == 1) {
                String ColorBolatxt = "rojo";
            } else if (colorBola == 2) {
                String ColorBolatxt = "naranja";
            } else if (colorBola == 3) {
                String ColorBolatxt = "azul";
            } else if (colorBola == 4) {
                String ColorBolatxt = "negro";
            }

            switch (colorBola) {
                case 1 -> { // rojo

                }
                case 2 -> { // naranja

                }
                case 3 -> { // azul

                }
                case 4 -> { // negro

                }

            }

        } while (salir);

    }

}
