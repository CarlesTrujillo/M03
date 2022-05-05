package UF2A2;

import java.util.Scanner;

/**
 *
 * @author Carles
 */
public class Ex04 {

    static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);

        System.out.print("Introduce un valor entero: ");
        int totalElements = in.nextInt();

        int[] llista = generaVector(totalElements);
        System.out.println("Vector original: ");
        mostraVector(llista);

        ordenaBombolla(llista);
    }

    static int[] generaVector(int numElements) {

        int[] vector = new int[numElements];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = numElements - i;
        }
        return vector;
    }

    static void mostraVector(int[] vector) {

        for (int element : vector) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    static void ordenaSeleccio(int[] vector) {

        int contador = 0;
        for (int i = 0; i < vector.length - 2; i++) {
            int posMinim = i;
            for (int j = i + 1; j < vector.length; j++) {
                contador++;
                if (vector[posMinim] > vector[j]) {
                    posMinim = vector[j];
                }
            }
            // intercambio
            int aux = vector[i];
            vector[i] = vector[posMinim];
            vector[posMinim] = aux;
        }
        System.out.println("Vector ordenado: ");
        mostraVector(vector);
        System.out.print("Total comprobados: " + contador);
    }

    static void ordenaBombolla(int[] vector) {

        int contador = 0;
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - 1; i--) {
                contador++;
                if (vector[j] > vector[j + 1]) {
                    int aux = vector[i];
                    vector[i] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }
        System.out.println("Vector ordenado: ");
        mostraVector(vector);
        System.out.print("Total comprobados: " + contador);
    }
}
