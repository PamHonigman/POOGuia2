package entidades;

import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class NoPerecedero extends Alimento{

    protected String bestBefore;

    public NoPerecedero() {
    }

    public NoPerecedero(String bestBefore) {
        this.bestBefore = bestBefore;
    }

    public NoPerecedero(String nombre, String marca, String rangoPrecio, String bestBefore) {
        super(nombre, marca, rangoPrecio);
        this.bestBefore = bestBefore;
    }

    @Override
    public void crearAlimento() {
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        super.crearAlimento();
        System.out.println("Cuál es su plazo máximo de conservación?");
        bestBefore = in.nextLine();
    }

    @Override
    public void tipoAlimento() {
        System.out.println("Alimento: " + toUpperCase(nombre) + "\nMarca: " + marca + "\nRango de Precio: " +
                rangoPrecio);
        System.out.println("Es un alimento Perecedero"+ "\nConsumir preferiblemente antes de: " + bestBefore + " " +
                "desde su fecha de elaboración");
    }
}
