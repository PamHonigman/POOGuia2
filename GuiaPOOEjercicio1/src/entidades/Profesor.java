package entidades;

public class Profesor extends Persona {

    protected String materia;

    public Profesor(){
    }

    public Profesor(String materia) {
        this.materia = materia;
    }

    public Profesor(String nombre, String apellido, int edad, String materia) {
        super(nombre, apellido, edad);
        this.materia = materia;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("PROFESOR:");
        super.mostrarDatos();
        System.out.println("\t\u2726 Materia: " + materia);
    }

    @Override
    public void accion() {
        System.out.println("\t\"Estoy enseñando\"");
    }
}
