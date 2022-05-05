package UF2A2;

import java.util.Scanner;

/**
 *
 * @author Carles
 */
public class Ex03 {

    static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);

        // lista de palabras
        final String[] paraules = {"patata", "armari", "bicicleta"};
        // seleccionador de palabra
        int aleatori = (int) (Math.random() * paraules.length);

        String palabrAdivinar = paraules[aleatori];

        // campo
        char[][] estatPenjatIni = {
            {' ', ' ', ' ', '_', '_', '_', '_', ' ', ' ', ' ', ' '},
            {' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', '_', '|', '_', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {'|', ' ', ' ', ' ', '|', '_', '_', '_', '_', '_', ' '},
            {'|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|'},
            {'|', '_', '_', '_', '_', '_', '_', '_', '_', '_', '|'}
        };

        char[][] estatPenjat = new char[10][11];

        // iniciar aspecto grafico del ahorcado
        IniMostrarEstatPenjat(estatPenjatIni, estatPenjat);
        mostrarEstatPenjat(estatPenjat);

        // iniciamos 2 arrays con la palabra seleccionada
        char[] palabraSplit = palabrAdivinar.toCharArray();
        boolean[] lletresEncertades = new boolean[palabraSplit.length];

        // metodo que pedira letra y la comprobará
        juego(palabraSplit, lletresEncertades);
    }

    static void mostrarEstatPenjat(char[][] estat) {
        for (char[] fila : estat) {
            System.out.print(fila);
            System.out.println("");
        }
    }

    static public void IniMostrarEstatPenjat(char[][] estatPenjatIni, char[][] estat) {
        for (int i = 0; i < estat.length; i++) {
            for (int j = 0; j < estat.length; j++) {
                System.out.print(estatPenjatIni[i][j]);
            }
            System.out.println("");
        }
    }

    static void mostrarParaula(char[] palabraSplit, boolean[] encertades) {
        System.out.print("Paraula: ");
        for (int i = 0; i < encertades.length; i++) {
            if (encertades[i]) {
                System.out.print(palabraSplit[i]);
            } else {
                System.out.print("*");
            }
        }
    }

    static void juego(char[] palabraSplit, boolean[] lletresEncertades) {

        int totalAciertos = 0, totalErrores = 0;
        char[] letras = new char[100];
        int totalLetras = 0;

        do {
            System.out.print("Introdueix lletra: ");
            char letraUsuario = in.next().charAt(0);

            for (int i = 0; i < palabraSplit.length; i++) {

                if (letraUsuario == palabraSplit[i]) {
                    lletresEncertades[i] = true;
                    totalAciertos++;
                    totalLetras++;
                    letras[i] = letraUsuario;
                } else {
                    lletresEncertades[i] = false;
                    totalErrores++;
                    totalLetras++;
                    letras[i] = letraUsuario;
                }
                
            }
            mostrarParaula(palabraSplit, lletresEncertades);
        } while (totalErrores < 7 );

    }
}
