package entidades;

public class VehiculoDeportivo extends Vehiculo {

    protected int rpm;

    public VehiculoDeportivo() {
    }

    public VehiculoDeportivo(int rpm) {
        this.rpm = rpm;
    }

    public VehiculoDeportivo(String marca, int modelo, String color, int rpm) {
        super(marca, modelo, color);
        this.rpm = rpm;
    }

    @Override
    public void vehiculo() {
        System.out.println("VEHÍCULO DEPORTIVO");
    }

    @Override
    public void fichaTecnica() {
        super.fichaTecnica();
        System.out.println("RPM: " + rpm);

        if (rpm > 0 && rpm <= 50) {
            System.out.println("El auto es muy bonito, pero sólo sirve para salir a pasear");
        } else if (rpm >= 51 && rpm <= 300) {
            System.out.println("Con este auto puedes desafiar a cualquiera en la pista");
        } else if (rpm >= 301 && rpm <= 600) {
            System.out.println("Si tienes este auto, deberías considerar participar en NASCAR");
        } else {
            System.out.println("¿Eres parte del elenco de Rápidos y Furiosos?");
        }
    }
}
