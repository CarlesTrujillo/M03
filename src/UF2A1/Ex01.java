package UF2A1;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1, num2;
        boolean repeticio = true;

        do {
            //System.out.print("Introduce un numero: ");
            num1 = in.nextInt();

            //System.out.print("Introduce otro numero: ");
            num2 = in.nextInt();
            in.nextLine();

            //System.out.print("¿Que operacion deseas realizar? (+, -, x o /): ");
            String opcion = in.nextLine();

            switch (opcion) {
                case "+":
                    sumar(num1, num2);
                    break;
                case "-":
                    restar(num1, num2);
                    break;
                case "x":
                    multiplicar(num1, num2);
                    break;
                case "/":
                    dividir(num1, num2);
                    break;
                case "":
                    break;
            }

        } while (repeticio = true);

    }

    static void sumar(int a, int b) {
        int sumaTotal = a + b;
        System.out.println(a + " + " + b + " = " + sumaTotal);
    }

    static void restar(int a, int b) {
        int restaTotal = a - b;
        System.out.println(a + " - " + b + " = " + restaTotal);
    }

    static void multiplicar(int a, int b) {
        int multiTotal = a * b;
        System.out.println(a + " x " + b + " = " + multiTotal);
    }

    static void dividir(int a, int b) {
        if (a == 0 || b == 0) {
            System.out.println("No se puede dividir entre 0");
        } else {
            int divTotal = a / b;
            System.out.println(a + " / " + b + " = " + divTotal);
        }

    }
}
