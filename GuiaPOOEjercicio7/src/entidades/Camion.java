package entidades;

public class Camion extends Vehiculo {

    protected int cargaMaxima;

    public Camion(){
    }

    public Camion(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public Camion(String marca, int modelo, String color, int cargaMaxima) {
        super(marca, modelo, color);
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public void vehiculo() {
        System.out.println("CAMIÓN");
    }

    @Override
    public void fichaTecnica() {
        super.fichaTecnica();
        System.out.println("Carga Máxima: " + cargaMaxima);

        if (cargaMaxima <= 100){
            System.out.println("Este vehículo está muy bien para iniciar un negocio de flete");
        } else {
            System.out.println("Tienes que usar este vehículo en el campo, ¡¡Es una máquina de trabajo!!");
        }
    }
}
