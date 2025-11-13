package EjemploProfesor;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        int opcion = 0;
        String tipoAceituna = "";
        int tamanioAceituna = 0;
        double kg = 0;

        do {

            try {
                opcion = AceitunasFuncionesArray.pedirOpcion();
                // Si continua mi programa por aquí significa
                // que no hay excepción NumberFormat
                switch (opcion) {
                    case 1 -> {
                        // Vender
                        // Pedir tipo
                        tipoAceituna = AceitunasFuncionesArray.pedirTipoAceituna();
                        System.out.println("El tipo es: " + tipoAceituna);
                        // Pedir tamaño
                        // Devuelve un int indicando 1 gruesa y 2 fina
                        tamanioAceituna = AceitunasFuncionesArray.pedirTamanioAceituna();
                        System.out.println("El tamaño es " + pasarTamanioAceituna(tamanioAceituna));
                        // Pedir kg
                        kg = AceitunasFuncionesArray.pedirKg();
                        System.out.println("Los kg son " + kg);
                        // calcular
                    }
                    case 2 -> {
                        JOptionPane.showMessageDialog(null, "Hasta pronto");
                    }
                    default -> {
                        JOptionPane.showMessageDialog(null, "Opción incorrecta");

                    }

                }

            } catch (NumberFormatException nfe) {
                // Repite el bucle al saltar la excepción
                opcion = 0;
            }

        } while (opcion != 2);
    }

    public static String pasarTamanioAceituna(int numero){
        String tamanio;
        tamanio = numero == 1?AceitunasFuncionesArray.GRUESA:AceitunasFuncionesArray.FINA;
        return tamanio;
    }
}