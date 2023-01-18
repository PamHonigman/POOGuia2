import entidades.Carnivoros;
import entidades.Herbivoros;

public class Main {
    public static void main(String[] args) {

        Carnivoros leon = new Carnivoros("León", true, "10 años");
        //leon.crearAnimal();
        leon.mostrarDatos();
        leon.tipoAnimal();
        leon.alimentacion();

        System.out.println("");

        Herbivoros ardilla = new Herbivoros("ardilla", false, "5 meses");
        //ardilla.crearAnimal();
        ardilla.mostrarDatos();
        ardilla.tipoAnimal();
        ardilla.alimentacion();


    }
}