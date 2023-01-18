import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;

public class Main {
    public static void main(String[] args) {

        Animal perro = new Perro("Stitch", "Carnívoro", 15, "Doberman");
        perro.mostrarDatos();
        perro.alimentarse();

        Perro perro1 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro1.mostrarDatos();
        perro1.alimentarse();

        Animal gato = new Gato("Pelusa", "Galletas", 15, "Siamés");
        gato.mostrarDatos();
        gato.alimentarse();

        Animal caballo = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo.mostrarDatos();
        caballo.alimentarse();
    }
}