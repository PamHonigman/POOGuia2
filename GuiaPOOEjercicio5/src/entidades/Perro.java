package entidades;

public class Perro extends Animal{

    public Perro() {
    }

    public Perro(String nombre, String comida, int edad, String raza) {
        super(nombre, comida, edad, raza);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Especie: PERRO \n\tNombre: " + nombre + "\n\tEdad: " + edad + "\n\tRaza: " + raza);
    }
}
