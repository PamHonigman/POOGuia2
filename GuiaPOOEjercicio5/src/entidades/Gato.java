package entidades;

public class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nombre, String comida, int edad, String raza) {
        super(nombre, comida, edad, raza);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Especie: GATO \n\tNombre: " + nombre + "\n\tEdad: " + edad + "\n\tRaza: " + raza);
    }
}
