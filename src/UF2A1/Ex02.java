package UF2A1;

import java.util.Scanner;

public class Ex02 {

    static Scanner in = new Scanner(System.in);
    static double perimetro, superficie;

    public static void main(String[] args) {
        
        boolean repeticio = true;
        //System.out.println("1. Cuadrado");
        //System.out.println("2. Rectangulo");
        //System.out.println("3. Triangulo Isosceles");
        //System.out.println("4. Circulo");
        //System.out.println("5. Cancelar");
        //System.out.print("Selecciona una de las opciones siguientes: ");
        do {
            String opcion = in.nextLine();
            switch (opcion.toLowerCase()) {
                case "q":
                    System.out.println("==Quadrat==");
                    cuadrado();
                    break;
                case "r":
                    System.out.println("==Rectangle==");
                    rectangulo();
                    break;
                case "t":
                    System.out.println("==Triangle isòsceles==");
                    triangulo();
                    break;
                case "c":
                    System.out.println("==Cercle==");
                    circulo();
                    break;
                case "s":
                    repeticio = false;
                    break;
            }
        } while(repeticio != false);
    
    }

    static void cuadrado() {
        //System.out.print("Lado del cuadrado: ");
        double ladocuadrado = in.nextDouble();

        // perimetro
        perimetro = (ladocuadrado * 4);
        // superficie
        superficie = (ladocuadrado * ladocuadrado);

        resultado(perimetro, superficie);
    }

    static void rectangulo() {
        //System.out.print("Base del rectangulo: ");
        double base = in.nextFloat();
        //System.out.print("Altura del rectangulo: ");
        double altura = in.nextFloat();

        //perimetro
        perimetro = (base + base) + (altura + altura);
        // superficie
        superficie = (base * altura);

        resultado(perimetro, superficie);

    }

    static void triangulo() {
        //System.out.print("Medida de los 2 lados iguales: ");
        double lados = in.nextFloat();
        //System.out.print("Base del triangulo: ");
        double base = in.nextFloat();

        // perimetro
        perimetro = base + (lados * 2);
        // superficie
        double altura = (double) (Math.sqrt(Math.pow(lados, 2) - (Math.pow(base, 2) / 4)));
        superficie = base * altura / 2;

        resultado(perimetro, superficie);
    }

    static void circulo() {
        //System.out.print("Radio del circulo: ");
        double radio = in.nextFloat();

        // perimetro
        perimetro = (double) (2 * Math.PI * radio);
        // superificie
        superficie = (double) (Math.PI * Math.pow(radio, 2));

        resultado(perimetro, superficie);
    }

    static void resultado(double perimetro, double superficie) {

        System.out.printf("Perímetre : " + "%.2f",perimetro);
        System.out.println("");
        System.out.printf("Superfície: " + "%.2f",superficie);
        System.out.println("");
    }
}