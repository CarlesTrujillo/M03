package UF2A1;

import java.util.Scanner;

public class Ex05 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
                
        int totalPrimers = entrada.nextInt();

        entrada.close();

        int[] primers = new int[totalPrimers];
        int valor = 2, comptadorPrimers = 0;
        while (comptadorPrimers < totalPrimers)
        {            
            if (esNombrePrimer(valor))
                    primers[comptadorPrimers++] = valor;
            ++valor;
        }

        mostrarVector(primers);        
    }
    
    
    static boolean esNombrePrimer(int nombre) {
            
        boolean esPrimer = true;
        for (int i = 2; i <= Math.sqrt(nombre); ++i)
        {
            if (nombre % i == 0)
            {
                esPrimer = false;
                break;
            }
        }
        
        return esPrimer;          
    }
    
    static void mostrarVector(int[] primers) {
        // Mostra resultat
        for (int i = 0; i < primers.length; ++i)
        {
            System.out.print(primers[i]);
            if (i < primers.length - 1)
            {
                System.out.print(", ");
                if ((i + 1) % 10 == 0)
                    System.out.println();
            }
            else
                System.out.println(".");
        }        
    }
}
