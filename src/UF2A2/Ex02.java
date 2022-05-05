package UF2A2;

import java.util.Scanner;

/**
 *
 * @author Carles
 */
public class Ex02 {

    static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        System.out.print("Cuantas tablas de multiplicar quieres mostrar? ");
        int num = in.nextInt();

        final int TAULES_PER_BLOC = 4;
        for (int taula = 1; taula <= num; taula += TAULES_PER_BLOC) {
            mostrarBlocPantalla(taula, Math.min(taula + TAULES_PER_BLOC - 1, num));
        }

    }
    // Mostra una línia d’una taula de multiplicar

    static String muntarLiniaTaulaMultiplicar(int taula, int n) {
        return String.format("%d x %2d = %2d", taula, n, taula * n);
    }

// Mostra una línia d’una sèrie de taules de multiplicar, començant per taulaInicial i acabant per taulaFinal.
    static String muntarLiniaPantalla(int taulaInicial, int taulaFinal, int n) {
        String linea = "";
        for (int taula = taulaInicial; taula <= taulaFinal; taula++) {
            linea += muntarLiniaTaulaMultiplicar(taula, n) + "\t";
        }
        return linea;
    }

// Mostra un bloc de taules per pantalla des de taulaInicial fins taulaFinal.
    static void mostrarBlocPantalla(int taulaInicial, int taulaFinal) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(muntarLiniaPantalla(taulaInicial, taulaFinal, i));
        }
        System.out.println("");
    }
}
