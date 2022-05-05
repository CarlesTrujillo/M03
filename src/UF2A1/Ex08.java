package UF2A1;

import java.util.Scanner;
/**
* @author Carles
* @version 1.0
*/
public class Ex08 {

    static Scanner in;

    // metodo principal donde se crea la matriz y se inicia el juego
    public static void main(String[] args) {
        in = new Scanner(System.in);
        boolean continuar = true;

        // matriz con las reglas de juego
        int[][] reglas = {
            {0, -1, 1, 1, -1},
            {1, 0, -1, -1, 1},
            {-1, 1, 0, 1, -1},
            {-1, 1, -1, 0, 1},
            {1, -1, 1, -1, 0}
        };

        int winJugador = 0, winCPU = 0;
        int ronda = 1;

        // bucle del juego
        do {
            System.out.println("Ronda: " + ronda + "(Jugador: " + winJugador + " - CPU: " + winCPU + ")");

            int tiradaHumano = jugadaHumano();
            int tiradaCPU = jugadaCPU();

            // comprobante de quien gana
            if (reglas[tiradaHumano][tiradaCPU] == -1) {
                System.out.println("Ha ganado la CPU.");
                winCPU++;
            } else if (reglas[tiradaHumano][tiradaCPU] == 1) {
                System.out.println("Ha ganado el jugador.");
                winJugador++;
            } else {
                System.out.println("Empate.");
            }
            ronda++;

            // comprobante de victorias para acabar el juego
            if (winJugador >= 3 || winCPU >= 3) {
                System.out.println("La partida ha acabado en " + ronda + " rondas");
                System.out.println("El resultado ha sido: Jugador: " + winJugador + " Ordenador: " + winCPU);

                System.out.print("Quieres seguir jugando? (S/N): ");
                String respuesta = in.nextLine();
                System.out.println("");

                if (respuesta.equalsIgnoreCase("N")) {
                    continuar = false;
                } else {
                    winJugador = 0;
                    winCPU = 0;
                    ronda = 1;
                    continuar = true;
                }
            }

        } while (continuar != false);

    }
    // metodo de la jugada del jugador
    static int jugadaHumano() {

        System.out.println("0. Piedra");
        System.out.println("1. Papel");
        System.out.println("2. Tijeras");
        System.out.println("3. Lagarto");
        System.out.println("4. Spock");
        System.out.println("");

        System.out.print("Selecciona un movimiento: ");
        int movJugador = in.nextInt();
        in.nextLine();

        return movJugador;
    }
    // metodo de la jugada del ordenador
    static int jugadaCPU() {

        int movCPU = (int) (Math.random() * (4 + 1 - 0)) + 0;

        return movCPU;
    }
}
