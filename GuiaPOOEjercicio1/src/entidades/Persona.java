//1- Tenemos la clase Padre denominada como “Persona”, con los atributos protected que son los siguientes: String
// nombre, String apellido e int edad y también deberá contener lo siguiente:
//Su respectivo constructor vacío y con parámetros.
//Crear un método abstracto Acción(); en donde derivaremos la acción que realizaran sus clases hijas y uno
// MostrarDatos(); donde visualizaremos los atributos.
//Crear 2 clases hijas Alumno, donde tendrá su atributo añoAcademico y Profesor con su atributo materia. También
// implementaran el método Acción(); en ambas clases derivando que harán cada uno y MostrarDatos(); donde vamos a colocar
// los atributos que queramos imprimir por consola.

package entidades;

public abstract class Persona {

    protected String nombre;
    protected String apellido;
    protected int edad;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public abstract void accion();

    public void mostrarDatos(){
        System.out.println("\t\u2726 Nombre: " + nombre + "\n\t\u2726 Apellido: " + apellido + "\n\t\u2726 Edad: " + edad);
    }
}
