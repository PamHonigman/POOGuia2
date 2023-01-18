package entidades;

import java.util.Scanner;

public class Menu extends Figuras{

    public Menu() {
    }

    public Menu(String tipoFigura, int area, int base, int altura, double PI, int radio) {
        super(tipoFigura, area, base, altura, PI, radio);
    }

    public void eleccion() {
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Seleccione una figura para calcular su área: \n\t1)Triángulo \n\t2)Rectángulo" +
                " \n\t3)Círculo \n\t4)Ninguna");
        int figura = in.nextInt();

        switch (figura) {
            case 1:
                System.out.println("Ingrese el valor de la base");
                base = in.nextInt();
                System.out.println("Ingrese el valor de la altura");
                altura = in.nextInt();

                System.out.println("TRIÁNGULO" + "\nLa fórmula para calcular su área es: base (" + base + ") * " +
                        "altura (" + altura + ") / 2" );

                area = (base * altura) / 2;
                break;
            case 2:
                System.out.println("Ingrese el valor de la base");
                base = in.nextInt();
                System.out.println("Ingrese el valor de la altura");
                altura = in.nextInt();
                System.out.println("RECTÁNGULO"+ "\nLa fórmula para calcular su área es: base (" + base + ") * " +
                        "altura (" + altura + ")");

                area = (base * altura);
                break;
            case 3:
                System.out.println("Ingrese el valor del radio");
                radio = in.nextInt();

                System.out.println("CÍRCULO"+ "\nLa fórmula para calcular su área es: Pi (" + PI + ") * radio (" + radio
                        + ") elevado al cuadrado");

                area = (int) (Math.pow(radio, 2) * PI);
                break;
            case 4:
                System.out.println("Fin");
        }
    }

    @Override
    public void area() {
        System.out.println("El resultado es: " + area);
    }
}
