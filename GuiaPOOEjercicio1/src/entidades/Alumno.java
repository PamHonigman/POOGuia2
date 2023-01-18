package entidades;

public class Alumno extends Persona{

    protected String añoAcademico;

    public Alumno(){
    }

    public Alumno(String añoAcademico) {
        this.añoAcademico = añoAcademico;
    }

    public Alumno(String nombre, String apellido, int edad, String añoAcademico) {
        super(nombre, apellido, edad);
        this.añoAcademico = añoAcademico;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("ALUMNO:");
        super.mostrarDatos();
        System.out.println("\t\u2726 Año Académico: " + añoAcademico);
    }

    @Override
    public void accion() {
        System.out.println("\t\"Estoy aprendiendo\"");
    }
}
