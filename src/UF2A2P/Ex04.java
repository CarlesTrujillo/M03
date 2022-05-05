package UF2A2P;

import java.util.Scanner;

/**
 *
 * @author Carles
 */
public class Ex04 {

    static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);

        int tamañoArray = in.nextInt();

        in.nextLine();

        String[] paisos = new String[tamañoArray];

        for (int i = 0; i < paisos.length; i++) {
            paisos[i] = in.nextLine();
        }
        String paisATrobar = in.nextLine();

        cercaBinaria(paisos, paisATrobar);
    }

    static void mostraVector(String[] vector) {

        for (String element : vector) {
            System.out.print(element + " ");
        }
        System.out.println();
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

        System.out.println("Total passades: " + comptadorPassades);

        if (trobat) {
            System.out.println("Trobat a la posició: " + (comptadorPassades + 1));
        } else {
            System.out.println("No trobat");
        }
    }
}
