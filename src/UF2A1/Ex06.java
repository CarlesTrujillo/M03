package UF2A1;

import java.util.Scanner;

public class Ex06 {

    static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);

        System.out.print("Nombre de filas: ");
        int files = in.nextInt();

        System.out.print("Nombre de columnas: ");
        int columnas = in.nextInt();

        int[][] matriu = demanaMatriu(files, columnas);

        mostraMatriu(matriu);
    }

    public static int[][] demanaMatriu(int files, int columnes) {

        System.out.print("Valor minimo: ");
        int min = in.nextInt();

        System.out.print("Valor maximo: ");
        int max = in.nextInt();

        int[][] matriu = generarMatriu(files, columnes, min, max);
        return matriu;
    }

    public static int[][] generarMatriu(int files, int columnes, int min, int max) {

        int[][] matriu = new int[files][columnes];

        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                matriu[i][j] = (int) (Math.random() * (max + 1 - min)) + min;
            }
        }
        return matriu;
    }

    public static void mostraMatriu(int[][] matriu) {

        for (int[] fila : matriu) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println("");
        }
    }
}
