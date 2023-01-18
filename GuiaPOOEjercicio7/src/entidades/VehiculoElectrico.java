package entidades;

public class VehiculoElectrico extends Vehiculo{

    protected int potencia;

    public VehiculoElectrico() {
    }

    public VehiculoElectrico(int potencia) {
        this.potencia = potencia;
    }

    public VehiculoElectrico(String marca, int modelo, String color, int potencia) {
        super(marca, modelo, color);
        this.potencia = potencia;
    }

    @Override
    public void vehiculo() {
        System.out.println("VEHÍCULO ELÉCTRICO");
    }

    @Override
    public void fichaTecnica() {

        if (modelo < 2007){
            System.out.println("No existe modelo para este año");
        } else {
            super.fichaTecnica();
            System.out.println("Potencia: " + potencia + "\n¡Es un auto de última tecnología!");
        }
    }
}
