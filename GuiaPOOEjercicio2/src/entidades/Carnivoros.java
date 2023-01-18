//ojooooo el ej 1 es de herencia, NO POLIMORFISMO

package entidades;

public class Carnivoros extends Animales {

    public Carnivoros(){
    }

    public Carnivoros(String animal, boolean peligro, String edad) {
        super(animal, peligro, edad);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("ANIMAL: " + animal + "\n\tPeligro: " + peligro + "\n\tEdad: " + edad);
    }

    @Override
    public void tipoAnimal() {
        System.out.println("\tEs un animal carnívoro");
        this.peligro = true;
    }

    @Override
    public void alimentacion() {
        System.out.println("\tSe alimenta de carnes");
    }
}
