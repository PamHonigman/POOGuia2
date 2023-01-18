package entidades;

import java.util.Scanner;

public abstract class Animales {

    protected String animal;
    protected boolean peligro;
    protected String edad;
   // protected char aux;

    public Animales() {
    }

    public Animales(String animal, boolean peligro, String edad) {
        this.animal = animal;
        this.peligro = peligro;
        this.edad = edad;
    }

    /*public void crearAnimal(){
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        System.out.println("¿Qué animal es?");
        animal = in.nextLine();

        System.out.println("¿Qué edad tiene (aclare si son meses o años)?");
        edad = in.nextLine();

        System.out.println("¿Qué tipo de alimentación tiene? \nC = Carnívoro \nH = Herbívoro");
        aux = in.next().charAt(0);

        if (aux == 'C') {
            peligro = true;
            System.out.println("Es un animal peligroso");
        } else if (aux == 'H') {
            System.out.println("No es un animal peligroso");
        }
    }*/

    public abstract void mostrarDatos();

    public abstract void tipoAnimal();

    public abstract void alimentacion();
}
