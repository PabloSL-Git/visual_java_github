package ejercicios;
import javax.swing.JOptionPane;


public class AceitunasFunciones {
    public static void mostrarMenu() {

        String tamaño = null;
        boolean valido = false;



        while (!valido) {  // Repite hasta que el usuario escriba algo correcto
            String menu = """
                    Dame qué tamaño quieres:
                    - Picual
                    - Aloreña
                    - Hojiblanca
                    """;

            tamaño = JOptionPane.showInputDialog(null, menu);

             if (tamaño.equalsIgnoreCase("fina")) {
                JOptionPane.showMessageDialog(null, "Has elegido masa fina");
                valido = true;
            } else if (tamaño.equalsIgnoreCase("gruesa")) {
                JOptionPane.showMessageDialog(null, "Has elegido masa gruesa");
                valido = true;
            } else {
                JOptionPane.showMessageDialog(null, "Opción no válida. Intenta de nuevo.");
            }
        }
    }

    public static void mostrarMenuTamaño() {

        String tamaño = null;
        boolean valido = false;



       while (!valido) {  // Repite hasta que el usuario escriba algo correcto
            String menu = """
                    Dame qué tamaño quieres:
                    - Fina
                    - Gruesa
                    """;

            tamaño = JOptionPane.showInputDialog(null, menu);

             if (tamaño.equalsIgnoreCase("fina")) {
                JOptionPane.showMessageDialog(null, "Has elegido masa fina");
                valido = true;
            } else if (tamaño.equalsIgnoreCase("gruesa")) {
                JOptionPane.showMessageDialog(null, "Has elegido masa gruesa");
                valido = true;
            } else {
                JOptionPane.showMessageDialog(null, "Opción no válida. Intenta de nuevo.");
            }
        }
    }

}
