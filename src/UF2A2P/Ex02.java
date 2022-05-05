package UF2A2P;

import java.util.Scanner;

/**
 *
 * @author Carles
 */
public class Ex02 {
    
    static Scanner in;
    
    public static void main(String[] args) {
        in = new Scanner(System.in);
        
        int tamañoArray = in.nextInt();
        
        float[] temperaturas = new float[tamañoArray];
        
        for(int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = in.nextFloat();
        }
        
        ordenaSeleccio2(temperaturas);
    }
    static void mostraVector(float[] vector) {

        for (float element : vector) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    static void ordenaSeleccio2(float[] vector) {

        int contador = 0;
        for (int i = 0; i < vector.length - 1; ++i)
        {
            for (int j = i + 1; j < vector.length; ++j)
            {
                contador++;
                if (vector[i] > vector[j])
                {                    
                    // Intercanviem posicions
                    float aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;
                }

            }
        }
        mostraVector(vector);
        System.out.print("Total passades: " + contador);
    }
}
