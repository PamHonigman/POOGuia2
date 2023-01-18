package entidades;

public class Herbivoros extends Animales{

    public Herbivoros(){
    }

    public Herbivoros(String animal, boolean peligro, String edad) {
        super(animal, peligro, edad);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("ANIMAL: " + animal + "\n\tPeligro: " + peligro + "\n\tEdad: " + edad);
    }

    @Override
    public void tipoAnimal() {
        System.out.println("\tEs herbívoro");
        this.peligro = false;
    }

    @Override
    public void alimentacion() {
        System.out.println("\tSe alimenta de plantas");
    }


}
