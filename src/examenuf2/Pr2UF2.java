package examenuf2;

import java.util.Scanner;

public class Pr2UF2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numeros = new int[100];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 10);
        }
        funcion(numeros);
    }

    public static void funcion(int numeros[]) {
        int contador = 0;
        int total = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] != 0) {
                contador++;
                total = total + numeros[i];
                funcion(numeros);
            } else {
                System.out.println("Se ha encontrado el cero en la posicion: " + contador + 1);
                System.out.println("Total: " + total);
            }
        }
    }

}
