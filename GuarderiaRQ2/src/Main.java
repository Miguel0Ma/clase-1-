import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        ArrayList<Estudiante> listaEstudiantes=new ArrayList<>();
        listaEstudiantes=crearEstudiante(listaEstudiantes);
        String cantidadStr = JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes");
        int cantidadEstudiantes = Integer.parseInt(cantidadStr);

        String nombre=JOptionPane.showInputDialog("Ingrese el nombre: ");
        String edad=JOptionPane.showInputDialog("Ingrese el edad: ");
        int edad1=Integer.parseInt(edad);
        String genero=JOptionPane.showInputDialog("Ingrese el genero: ");
        String identidad=JOptionPane.showInputDialog("Ingrese el numero identidad: ");
        String alergia=JOptionPane.showInputDialog("Ingrese tipo de alergia: ");
        String nombreAcudiente=JOptionPane.showInputDialog("Ingrese el nombre acudiente: ");
        String numeroContacto=JOptionPane.showInputDialog("Ingrese el numero de contacto del acudiente: ");

        Estudiante newEstudiante=
                new Estudiante(nombre,edad1,genero,identidad,alergia,
                        nombreAcudiente,numeroContacto);
        JOptionPane.showMessageDialog(null,newEstudiante);
        listaEstudiantes.add(newEstudiante);
    }
    JOptionPane.showMessageDialog(null,listaEstudiantes);

    public static ArrayList crearEstudiante(ArrayList<Estudiante> listaEstudiantes){
        Estudiante estudiante1 = new Estudiante(" ",  2 ," ", "b",
                " ", " ", "");

    }
}