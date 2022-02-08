package uf2repe;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1, num2;

        System.out.print("Introduce un numero: ");
        num1 = in.nextInt();

        System.out.print("Introduce otro numero: ");
        num2 = in.nextInt();

        System.out.println("¿Que operacion deseas realizar?");

        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Cancelar");

        int opcion = in.nextInt();

        switch (opcion) {
            case 1:
                numSuma(num1, num2);
                break;
            case 2:
                numResta(num1, num2);
                break;
            case 3:
                numMulti(num1, num2);
                break;
            case 4:
                numDiv(num1, num2);
                break;
            case 5:
                break;
        }

    }

    static void numSuma(int num1, int num2) {
        int sumaTotal = num1 + num2;
        System.out.println("La suma dels 2 numeros es igual a: " + sumaTotal);
    }

    static void numResta(int num1, int num2) {
        int restaTotal = num1 + num2;
        System.out.println("La resta dels 2 numeros es igual a " + restaTotal);
    }

    static void numMulti(int num1, int num2) {
        int multiTotal = num1 * num2;
        System.out.println("La multiplicació dels 2 numeros es igual a: " + multiTotal);
    }

    static void numDiv(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            System.out.println("No se puede dividir entre 0");
        } else {
            int divTotal = num1 / num2;
            System.out.println("La divisió dels 2 numeros es igual a " + divTotal);
        }

    }
}
