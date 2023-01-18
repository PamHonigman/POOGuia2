package entidades;

import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Perecedero extends Alimento{

    protected String vencimiento;

    public Perecedero() {
    }

    public Perecedero(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    public Perecedero(String nombre, String marca, String rangoPrecio, String vencimiento) {
        super(nombre, marca, rangoPrecio);
        this.vencimiento = vencimiento;
    }

    @Override
    public void crearAlimento() {
        super.crearAlimento();
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cuál es su fecha de vencimiento?");
        vencimiento = in.nextLine();
    }

    @Override
    public void tipoAlimento() {
        System.out.println("Alimento: " + toUpperCase(nombre) + "\nMarca: " + marca + "\nRango de Precio: " +
                rangoPrecio);
        System.out.println("Es un alimento Perecedero"+ "\nVencimiento: " + vencimiento);
    }
}
