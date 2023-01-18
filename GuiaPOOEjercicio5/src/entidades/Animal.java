package entidades;
//Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo. La clase Animal tendrá como
// atributos el nombre, comida, edad y raza del Animal, con respectivos constructores cada clase.

public abstract class Animal {

    protected String nombre;
    protected String comida;
    protected int edad;
    protected String raza;

    public Animal() {
    }

    public Animal(String nombre, String comida, int edad, String raza) {
        this.nombre = nombre;
        this.comida = comida;
        this.edad = edad;
        this.raza = raza;
    }
//Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un mensaje por pantalla
// informando de que se alimenta

    public void alimentarse(){
        System.out.println("El animal se alimenta con " + comida);
    }

//incorporaremos un método para poder visualizar el nombre, edad, y la raza de cada animal u objeto creado

    public abstract void mostrarDatos();
}
