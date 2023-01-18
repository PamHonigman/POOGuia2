import entidades.Alumno;
import entidades.Profesor;

public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Pamela", "Honigman", 34, "2023");
        alumno1.mostrarDatos();
        alumno1.accion();

        System.out.println("");

        Profesor profesor1 = new Profesor("John", "Doe", 47, "Inglés");
        profesor1.mostrarDatos();
        profesor1.accion();
    }
}