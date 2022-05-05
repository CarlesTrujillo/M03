package UF2A2P;

import java.util.Scanner;

/**
 *
 * @author Carles
 */
public class Ex01 {

    static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);

        int tamañoArray = in.nextInt();
        
        in.nextLine();
        
        String[] paisos = new String[tamañoArray];

        for (int i = 0; i < paisos.length; i++) {
            paisos[i] = in.nextLine();
        }
        
        ordenaBombolla(paisos);
    }

    static void mostraVector(String[] vector) {

        for (String element : vector) {
            System.out.println(element);
        }
    }

    static void ordenaBombolla(String[] paisos) {

        for(int i = 0; i < paisos.length - 1; ++i)
        {
            for (int j = 0; j < paisos.length - 1 - i;++j)
            {
                if (paisos[j].compareTo(paisos[j + 1]) == 0)
                {
                    // Intercanviem posicions
                    String aux = paisos[j];
                    paisos[j] = paisos[j+1];
                    paisos[j+1] = aux;                    
                }
            }
        }
        System.out.println("Països ordenats:");
        mostraVector(paisos);
    }
}
