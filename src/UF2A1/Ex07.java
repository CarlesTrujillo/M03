package UF2A1;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Nombre de filas: ");
        int filas = in.nextInt();

        System.out.print("Nombre de columnas: ");
        int columnas = in.nextInt();

        int[][] camp = Ex06.generarMatriu(filas, columnas, -1, 0);
        System.out.println("Matriu entrada:");
        Ex06.mostraMatriu(camp);

        //int suma = sumaMines(camp, 2, 2);
        //System.out.println("Suma: " + suma);
        int[][] sortida = comptaMines(camp);
        System.out.println("Matriu sortida:");
        Ex06.mostraMatriu(sortida);
    }

    public static int[][] comptaMines(int[][] camp) {

        int[][] resultat = new int[camp.length][camp[0].length];
        for (int i = 0; i < camp.length; i++) {
            for (int j = 0; j < camp.length; j++) {
                if (camp[i][j] == -1) {
                    resultat[i][j] = -1;
                } else {
                    resultat[i][j] = sumaMines(camp, i, j);
                }
                // resultat[i][j] = (camp[i][j] == -1) ? -1 : sumaMines(camp, i, j);
            }
        }
        return resultat;
    }

    static int sumaMines(int[][] camp, int filas, int columnas) {
        int suma = 0;

        for (int incFila = -1; incFila <= 1; incFila++) {
            for (int incCol = -1; incCol <= 1; incCol++) {
                if (filas + incFila >= 0 && filas + incFila < camp.length
                        && columnas + incCol >= 0 && columnas + incCol < camp[0].length
                        && camp[filas + incFila][columnas + incCol] == -1) {
                    suma++;
                }
            }
        }
        return suma;
    }
}
