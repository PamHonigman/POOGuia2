package entidades;

public class ProductoEnvasado extends Producto{

    protected String clase;

    public ProductoEnvasado(){
    }

    public ProductoEnvasado(String clase) {
        this.clase = clase;
    }

    public ProductoEnvasado(String marca, int stock, int ventas, String clase){
        super(marca, stock, ventas);
        this.clase = clase;
    }

    @Override
    public void infoProducto(){
        System.out.println("Producto: " + clase + "\nMarca: " + marca + "\nStock: " + stock + "\nVentas: " + ventas);
        System.out.println("Producto ENVASADO");
    }
}
