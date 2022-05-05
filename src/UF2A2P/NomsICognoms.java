package UF2A2P;

import java.util.Scanner;

/**
 *
 * @author Carles
 */
public class NomsICognoms {

    static Scanner in;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] nomsComplets = {
            "Torres Hernández, Pere",
            "Majoral Gatell, Anna",
            "Pérez Gomis, Josep",
            "López López, Rosa",
            "Camps García, Ricard",
            "Sánchez Pasqual, Carles",
            "Mengual Sánchez, Gemma",
            "Puig Soler, Jordi"
        };
        
        ordenaBombolla(nomsComplets);
       
        System.out.print("Introdueix un nom: ");
        String nom = in.nextLine();
        
        cercaBinaria(nomsComplets,nom);
    }
    static void ordenaBombolla(String[] nomsComplets) {

        for(int i = 0; i < nomsComplets.length - 1; ++i)
        {
            for (int j = 0; j < nomsComplets.length - 1 - i;++j)
            {
                if (nomsComplets[j].compareTo(nomsComplets[j + 1]) == 0)
                {
                    // Intercanviem posicions
                    String aux = nomsComplets[j];
                    nomsComplets[j] = nomsComplets[j+1];
                    nomsComplets[j+1] = aux;                    
                }
            }
        }
        System.out.println("Llistat de noms:");
        mostraNoms(nomsComplets);
    }
    static void mostraNoms(String[] nomsComplets) {
        int contador = 1;
        for (String element : nomsComplets) {
            System.out.println(contador + ". " + element);
            contador++;
        }
    }
    static void cercaBinaria(String[] array, String valor) {
        int comptadorPassades = 0;
        boolean trobat = false;
        int index = 0, indexEsq = 0, indexDret = array.length - 1;

        while (indexEsq <= indexDret) {
            comptadorPassades++;

            index = (indexDret + indexEsq) / 2;
            if (array[index].equals(valor)) {
                trobat = true;
                break;
            }
            if (array[index].compareTo(valor) < 0) {
                indexEsq = index + 1;
            } else {
                indexDret = index - 1;
            }
        }

        if (trobat) {
            System.out.println("El nom " + valor + " s' ha trobat a la posició "
                          + (comptadorPassades + 1) + " de la llista ordenada.");
        } else {
            System.out.println("El nom " + valor + " no s'ha trobat a la llista.");
        }
    }
}
