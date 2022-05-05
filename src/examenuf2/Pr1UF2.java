package examenuf2;

import java.util.Scanner;

public class Pr1UF2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] tabla = new int[8][8];
        int intentos = 10;

        for (int i = 0; i < tabla.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < tabla.length; j++) {
                if (i == 0 && j == 0) {
                    tabla[i][j] = 1;
                }
                System.out.print(tabla[i][j] + " ");
            }
        }
        //  compruebaBordes(tabla);
        gameOver(intentos);
    }

    public static boolean compruebaBordes(int tabla[][]) {
        boolean borde = false;

        //    if(tabla[0][j] == 1) {
        //    }
        return borde;
    }

    public static void tocado() {

    }

    public static void rellenar() {

    }

    public static void gameOver(int intentos) {
        if (intentos == 0) {
            System.out.println("Has esgotat les possibilitats");
        }
    }
}
