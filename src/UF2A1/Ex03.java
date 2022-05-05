package UF2A1;

import java.util.Scanner;

public class Ex03 {

    static Scanner in = new Scanner(System.in);
    static double volum, superficie;

    public static void main(String[] args) {

        boolean repeticio = true;
        //System.out.println("1. Hexaedre");
        //System.out.println("2. Cilindre");
        //System.out.println("3. Tetraedre");
        //System.out.println("4. Esfera");
        //System.out.println("5. Cancelar");
        //System.out.print("Selecciona una de las opciones siguientes: ");
        do {
            String opcion = in.nextLine();
            switch (opcion.toLowerCase()) {
                case "h":
                    System.out.println("==Hexaedre==");
                    hexaedro();
                    break;
                case "c":
                    System.out.println("==Cilindre==");
                    cilindro();
                    break;
                case "t":
                    System.out.println("==Tetraedre==");
                    tetraedro();
                    break;
                case "e":
                    System.out.println("==Esfera==");
                    esfera();
                    break;
                case "s":
                    repeticio = false;
                    break;
            }
        } while (repeticio != false);

    }

    static void hexaedro() {
        //System.out.print("Lado del hexaedro: ");
        double lado = in.nextDouble();

        // volumen
        volum = Math.pow(lado, 3);
        // superficie
        superficie = 6 * (Math.pow(lado, 2));

        resultado(volum, superficie);
    }

    static void cilindro() {
        //System.out.print("Radio del cilindro: ");
        double radio = in.nextDouble();
        //System.out.print("Altura del cilindro: ");
        double altura = in.nextDouble();

        //volumen
        volum = Math.PI * (Math.pow(radio, 2) * altura);
        // superficie
        superficie = 2 * (Math.PI * radio) * (radio + altura);

        resultado(volum, superficie);

    }

    static void tetraedro() {
        //System.out.print("Medida de la arista: ");
        double aresta = in.nextDouble();

        // volumen
        volum = Math.pow(aresta, 3) * (Math.sqrt(2) / 12);
        // superficie
        superficie = Math.pow(aresta, 2) * Math.sqrt(3);

        resultado(volum, superficie);
    }

    static void esfera() {
        //System.out.print("Radio de la esfera: ");
        double radio = in.nextDouble();

        // volumen
        volum = (double) 4 / 3 * (Math.PI * Math.pow(radio, 3));
        // superificie
        superficie = (double) (4 * Math.PI * Math.pow(radio, 2));

        resultado(volum, superficie);
    }

    static void resultado(double volum, double superficie) {

        System.out.printf("Superfície: " + "%.2f", superficie);
        System.out.println("");
        System.out.printf("Volum: " + "%.2f", volum);
        System.out.println("");
    }
}
