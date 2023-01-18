package entidades;

public class ProductoFresco extends Producto{

    protected String tipo;

    public ProductoFresco(){
    }

    public ProductoFresco(String tipo) {
        this.tipo = tipo;
    }

    public ProductoFresco(String marca, int stock, int ventas, String tipo){
        super(marca, stock, ventas);
        this.tipo = tipo;
    }

    @Override
    public void infoProducto(){
        System.out.println("Producto: " + tipo + "\nMarca: " + marca + "\nStock: " + stock + "\nVentas: " + ventas);
        System.out.println("Producto FRESCO");
    }
}