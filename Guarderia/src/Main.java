import javax.swing.*;
import java.util.ArrayList;

// Ejercicio guarderia requerimiento 1
public class Main {
    public static void main(String[] args) {
        int cantidadEstudiantes = 2;

        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

        for (int i = 1; i < cantidadEstudiantes; i++) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
            String edad = JOptionPane.showInputDialog("Ingrese el edad");
            String genero = JOptionPane.showInputDialog("Ingrese el genero");
            String documentoIdentidad = JOptionPane.showInputDialog("Ingrese el documento");
            String nombreAcudiente = JOptionPane.showInputDialog("Ingrese el nombre acudiente");
            String numeroAcudiente = JOptionPane.showInputDialog("Ingrese el numero acudiente");
            // JOptionPane.showMessageDialog(null, "El nombre es: "+nombre);

            Estudiante newEstudiante =
                    new Estudiante(nombre, edad, genero, documentoIdentidad, nombreAcudiente, numeroAcudiente);
            JOptionPane.showMessageDialog(null, newEstudiante);
            listaEstudiantes.add(newEstudiante);
        }
    JOptionPane.showMessageDialog(null, listaEstudiantes);
    }
}
