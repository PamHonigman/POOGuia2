import entidades.Camion;
import entidades.Vehiculo;
import entidades.VehiculoDeportivo;
import entidades.VehiculoElectrico;

public class Main {
    public static void main(String[] args) {

        Vehiculo deportivo1 = new VehiculoDeportivo("Mercedes-Benz", 2019, "Negro", 601);
        deportivo1.vehiculo();
        deportivo1.fichaTecnica();

        System.out.println("");

        Vehiculo electrico1 = new VehiculoElectrico("Tesla Model 3", 2021, "Blanco", 222);
        electrico1.vehiculo();
        electrico1.fichaTecnica();

        System.out.println("");

        Vehiculo camion1 = new Camion("IVECO", 2018 , "Amarillo", 101);
        camion1.vehiculo();
        camion1.fichaTecnica();
    }
}