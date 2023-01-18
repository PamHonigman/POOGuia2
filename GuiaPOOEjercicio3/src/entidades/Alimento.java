package entidades;

import java.util.Scanner;

public abstract class Alimento {

    protected String nombre;
    protected String marca;
    protected String rangoPrecio;

    public Alimento() {
    }

    public Alimento(String nombre, String marca, String rangoPrecio) {
        this.nombre = nombre;
        this.marca = marca;
        this.rangoPrecio = rangoPrecio;
    }

    public void crearAlimento(){
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Qué alimento es?");
        nombre = in.nextLine();
        System.out.println("Cuál es la marca del alimento?");
        marca = in.nextLine();
        System.out.println("Qué rango de precio tiene?: \nBajo \nAccesible \nAlto");
        rangoPrecio = in.nextLine();
    }

    public abstract void tipoAlimento();


}
