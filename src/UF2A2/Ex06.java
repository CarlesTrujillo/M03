package UF2A2;

import java.util.Scanner;

/**
 *
 * @author Carles
 */
public class Ex06 {

    static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);

        int cantidadCasillas, posicionFicha, tiradaDado;
        boolean continuar;
        
        do {
            cantidadCasillas = in.nextInt();
            posicionFicha = in.nextInt();
            tiradaDado = in.nextInt();
            
            continuar = cantidadCasillas != 0 && posicionFicha != 0 && tiradaDado != 0;
            if (continuar) {
                System.out.println(posicionFinal(cantidadCasillas, posicionFicha, tiradaDado));
            } else {
                continuar = false;
            }

        } while (continuar);

    }

    public static int posicionFinal(int tablero, int posicion, int tirada) {
        int posicionFinal = 0;
        
        posicionFinal = posicion + tirada;
        
        if(posicionFinal > tablero) {
            posicionFinal = 2 * tablero - posicion - tirada;
        }

        return posicionFinal;
    }
}
