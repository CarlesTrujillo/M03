package UF4A1.Circulo;

import UF4A1.Punt.Punt;

/**
 *
 * @author Carles
 */
public class Circulo {

    private static final double PI = 3.141592;
    private double radio;
    private Punt centro;

    public Circulo(double valor) {
        setRadio(valor);
        Punt centro = new Punt();
        centro.set(0, 0);
        this.centro = centro;
    }

    public Circulo(double valor, Punt centro) {
        setRadio(valor);

    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double valor) {
        if (valor >= 0) {
            this.radio = valor;
        }

    }

    public Punt getCentro() {
        return centro;
    }

    public void setCentro(Punt centro) {
        this.centro = centro;
    }

    public double perimetro() {
        return 2 * PI * radio;
    }

    public double area() {
        return PI * radio * radio;
    }

    public boolean mayorQue(Circulo otro) {
        return this.radio > otro.getRadio();
    }

    public static void main(String[] args) {
        Circulo c1 = new Circulo(2.3);
        System.out.printf("Perimetro: %.2f\n", c1.perimetro());
        System.out.printf("Area: %.2f\n", c1.area());

        Punt p = new Punt();
        p.set(5, -3);
        Circulo c2 = new Circulo(4.6, p);

        String esMayor = c1.mayorQue(c2) ? "SI" : "NO";
        System.out.println("c1 es mayor que c2? " + esMayor);
        
        System.out.println("Centro de C1: " + c1.getCentro());
        System.out.println("Centro de C2: " + c2.getCentro());
    }
}
