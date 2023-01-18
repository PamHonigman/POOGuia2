package entidades;

public class Caballo extends Animal{

    public Caballo() {
    }

    public Caballo(String nombre, String comida, int edad, String raza) {
        super(nombre, comida, edad, raza);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Especie: CABALLO \n\tNombre: " + nombre + "\n\tEdad: " + edad + "\n\tRaza: " + raza);
    }


}
