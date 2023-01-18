package entidades;

public abstract class Figuras{

    protected String tipoFigura;
    protected int area;
    protected int base;
    protected int altura;
    protected double PI = 3.14159265358979323846;
    protected int radio;

    public Figuras(){
    }

    public Figuras(String tipoFigura, int area, int base, int altura, double PI, int radio) {
        this.tipoFigura = tipoFigura;
        this.area = area;
        this.base = base;
        this.altura = altura;
        this.PI = PI;
        this.radio = radio;
    }

    public abstract void area();
}
