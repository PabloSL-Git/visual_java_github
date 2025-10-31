package Entrega6;

import javax.swing.JOptionPane;

import java.util.Random;

public class MainHalloween {
    public static void main(String[] args) {

        String entrar = "";
        Random random = new Random();
        int entradaNum = 0;
        String entrarPuerta = "";
        boolean escape = false;
        String entrarVentana = "";

        do {

            entradaNum = random.nextInt(2) + 1;
            // 1 puerta
            // 2 ventana

            entrar = JuegoHalloween.mostrarEntar(entradaNum);

            if (entrar.equalsIgnoreCase("no")) {
                break;
            }

            switch (entradaNum) {
                case 1 -> { // puerta

                    entrarPuerta = JuegoHalloween.mostrarPuerta();

                    if (entrarPuerta.equalsIgnoreCase("biblioteca")) {
                        escape = JuegoHalloween.mostrarPuertaBiblioteca();
                    } else {
                        escape = JuegoHalloween.mostrarPuertaSalon();
                    }
                }

                case 2 -> { // ventana

                    entrarVentana = JuegoHalloween.mostrarVentana();

                    if (entrarVentana.equalsIgnoreCase("despensa")) {
                        escape = JuegoHalloween.mostrarVentanaDespensa();
                    } else {
                        escape = JuegoHalloween.mostrarVentanaPasillo();
                    }

                }
            }

            if (escape == false) {
                JOptionPane.showMessageDialog(null, "Jajajaja ya que has fallado continuaras sufriendo en mi bucle");
            }

        } while (escape == false);

    }
}