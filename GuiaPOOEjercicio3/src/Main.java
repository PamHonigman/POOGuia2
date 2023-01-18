import entidades.Alimento;
import entidades.NoPerecedero;
import entidades.Perecedero;

public class Main {
    public static void main(String[] args) {

        Perecedero perecedero1 = new Perecedero();
        perecedero1.crearAlimento();
        perecedero1.tipoAlimento();

        System.out.println("");

        NoPerecedero noPerecedero1 = new NoPerecedero();
        noPerecedero1.crearAlimento();
        noPerecedero1.tipoAlimento();
    }
}

