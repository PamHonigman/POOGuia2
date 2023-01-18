import entidades.Producto;
import entidades.ProductoEnvasado;
import entidades.ProductoFresco;

public class Main {
    public static void main(String[] args) {

        Producto producto1 = new ProductoFresco("Paulina", 140, 22, "Pastas");
        producto1.infoProducto();

        System.out.println("");

        Producto producto2 = new ProductoEnvasado("Natura", 200, 99, "Aceite");
        producto2.infoProducto();
    }
}