package UF2A2P;

import java.util.Scanner;

/**
 *
 * @author Carles
 */
public class JocDeTaula {

    static Scanner in;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int intents = 1;
        int fichasNegras = 4;

        int[][] tauler = crearTauler();

        do {
            System.out.println("Intent " + intents);

            System.out.print("Fila: ");
            int fila = in.nextInt();

            System.out.print("Columna: ");
            int columna = in.nextInt();

            if (fila == 0) {
                fila = fila + 1;
            } else if (fila == 8) {
                fila = fila - 1;
            }

            if (columna == 0) {
                columna = columna + 1;
            } else if (columna == 8) {
                columna = columna - 1;
            }

            if (tocaVora(fila, columna) == true) {
                System.out.println("No és vàlida. toca la vora!");
            } else if (existeixFitxa(tauler, fila, columna) == true) {
                System.out.println("No és vàlida. Ja hi ha una fitxa!");
            } else {
                System.out.println("Perfecte! La posició és vàlida");
                tauler[fila][columna] = 2;
                fichasNegras--;
            }
            intents++;

        } while (fichasNegras != 0 || intents < 10);

        if (fichasNegras == 0) {
            System.out.println("Enhorabona! Has guanyat!");

        } else {
            System.out.println("Oh no! Has perdut!");
        }
        System.out.println("El tauler:");

        mostraTauler(tauler);
    }

    public static int[][] crearTauler() {

        int[][] tauler = new int[8][8];

        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler.length; j++) {
                tauler[i][j] = (int) (Math.random() * 2);
            }
        }
        return tauler;
    }

    public static void mostraTauler(int[][] tauler) {

        for (int[] fila : tauler) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println("");
        }
    }

    public static boolean tocaVora(int fila, int columna) {

        if (fila != 0 || fila != 7 || columna != 0 || columna != 7) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean existeixFitxa(int[][] tauler, int fila, int columna) {
        if (tauler[fila][columna] != 1) {
            return false;
        } else {
            return true;
        }
    }
}
