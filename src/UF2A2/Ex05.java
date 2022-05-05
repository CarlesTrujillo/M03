package UF2A2;

import java.util.Scanner;

/**
 *
 * @author Carles
 */
public class Ex05 {

    static Scanner in;

    public static void main(String[] args) {

        in = new Scanner(System.in);
        int[] vector = {1, 3, 7, 13, 19, 21};

        System.out.print("Numero a trobar: ");
        int x = in.nextInt();

        System.out.println(trobaXSecuencial(vector, x));
        // System.out.println(trobaXBinario(vector, x));
    }

    public static int trobaXSecuencial(int[] vector, int x) {

        int posicion = 0;
        int contador = 0;
        
        for (int i = 0; i < vector.length; i++) {
            contador++;
            if (vector[i] == x) {
                posicion = i;
            } else {
                posicion = -1;
            }
        }
        // contador de ms
        long tiempo = System.currentTimeMillis();
        System.out.println("Total pasos: " + contador);
        System.out.println("Total tiempo: " + tiempo);
        
        return posicion;
    }

    public static int trobaXBinario(int[] vector, int x) {

        int indexIzq = 0;
        int indexDer = vector.length - 1;
        int posicion = -1, contador = 0;
        
        while (indexIzq <= indexDer) {
            contador++;
            int index = (indexIzq + indexDer) / 2;
            if (x == vector[index]) {
                posicion = index;
                break;
            } else if (x < vector[index]) {
                indexDer = index - 1;
            } else if (x > vector[index]) {
                indexIzq = index + 1;
            }
        }
        // contador de ms
        long tiempo = System.currentTimeMillis();
        System.out.println("Total pasos: " + contador);
        System.out.println("Total tiempo: " + tiempo);
        
        return posicion;
    }

}
