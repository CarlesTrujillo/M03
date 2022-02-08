package uf2repe;

import java.util.Scanner;

public class Ex02 {

    static Scanner in = new Scanner(System.in);
    static double perimetro, superficie;

    public static void main(String[] args) {

        System.out.println("1. Cuadrado");
        System.out.println("2. Rectangulo");
        System.out.println("3. Triangulo Isosceles");
        System.out.println("4. Circulo");
        System.out.println("5. Cancelar");

        System.out.print("Selecciona una de las opciones siguientes: ");
        int opcion = in.nextInt();

        switch (opcion) {
            case 1:
                cuadrado();
                break;
            case 2:
                rectangulo();
                break;
            case 3:
                triangulo();
                break;
            case 4:
                circulo();
                break;
            case 5:
                break;
        }
    }

    static void cuadrado() {
        System.out.print("Lado del cuadrado: ");
        double ladocuadrado = in.nextDouble();

        // perimetro
        perimetro = ladocuadrado * 4;
        // superficie
        superficie = ladocuadrado * ladocuadrado;

        resultado(perimetro, superficie);
    }

    static void rectangulo() {
        System.out.print("Base del rectangulo: ");
        double base = in.nextDouble();
        System.out.print("Altura del rectangulo: ");
        double altura = in.nextDouble();

        //perimetro
        perimetro = (base + base) + (altura + altura);
        // superficie
        superficie = base * altura;

        resultado(perimetro, superficie);

    }

    static void triangulo() {
        System.out.println("Medida de los 2 lados iguales: ");
        double lados = in.nextDouble();
        System.out.println("Base del triangulo: ");
        double base = in.nextDouble();
        
        // perimetro
        perimetro = base + (lados * 2);
        // superficie
       // double altura = 
       // perimetro =
    }

    static void circulo() {

    }

    static void resultado(double perimetro, double superficie) {

        System.out.println("El perimetro es igual a: " + perimetro);

        System.out.println("La superficie es igual a: " + superficie);
    }
}
